package com.jacobarchambault.owldemo;

import org.semanticweb.owlapi.model.OWLDataFactory;

public class JOWLData implements JData {
	JOntology ontology;
	OWLDataFactory dataFactory;
	JOWLData(JOntology ontology){
		this.ontology = ontology;
		dataFactory = ontology.ontologyData();
	}
}
