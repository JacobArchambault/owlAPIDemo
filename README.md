# OWLAPIDemo
A Maven Java project using the OWL API to read from, manipulate and save a building ontology importing SAREF.

## 1 Create ontology
### 1.1 Import SAREF
The project begins with a file, solar-ontology.owl, generated with Protege. This file imports the SAREF (Smart Applications REFerence) ontology for buildings, which contains standard classes and properties for handling ontologies related to buildings. 
### 1.2 Add entities
To this we've then added individuals of type pump, solar panel, and tank, which our application will use to model the transfer of energy from a solar panel to a storage tank.

## 2 Create OWL Classes
From here, we create three classes JOntology, JOWLData, and PrefixedData, which will be used to obtain successively more fine-grained information from our owl file. The first encapsulates OWLAPI functionality for loading and saving our ontology; the second, for getting classes, properties, and individuals from our data; the third [decorates](https://en.wikipedia.org/wiki/Decorator_pattern) the second with a prefix passed into its constructor to simplify access to types from the same base ontology.

## 3 Create custom classes
### 3.1 Solar panel
This class is used to represent the solar panel object in our OWL ontology. After obtaining it from our data, the application checks for sunlight and the ambient temperature value to determine the voltage it is going to transfer to the storage pump, adjusting the voltage so that for equal quantities of sunlight, lower temperatures imply higher energy transfer (this occurs on account of the material properties of the silicon from which the panel's cells are formed).  
