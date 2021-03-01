# owlAPIDemo
A Maven Java project using OWL API to read from, manipulate and save a building ontology importing SAREF.

## 1 Create ontology
## 1.1 Import SAREF
The project begins with a file, solar-ontology.owl, generated with Protege. This file imports the SAREF (Smart Applications REFerence) ontology for buildings, which contains standard classes and properties for handling ontologies related to buildings. 
## 1.2 Add entities
To this we've then added individuals of type pump, solar panel, and tank, which our application will use to model the transfer of energy from a solar panel to a storage tank.
