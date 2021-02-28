package com.jacobarchambault.owldemo;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.PrefixManager;

public final class JOWLData implements JData {
	final JOntology ontology;
	final OWLDataFactory dataFactory;

	JOWLData(
			JOntology ontology) {
		this.ontology = ontology;
		dataFactory = ontology.ontologyData();
	}

	final OWLClass jOWLClass(
			IRI fromIri) {
		return dataFactory.getOWLClass(
				fromIri);
	}

	final OWLClass jOWLClass(
			String fromString) {
		return jOWLClass(
				IRI.create(
						fromString));
	}

	final OWLClass jOWLClass(
			String fromString,
			PrefixManager withPrefix) {
		return dataFactory.getOWLClass(
				fromString,
				withPrefix);
	}
	final OWLNamedIndividual jOWLNamedIndividual(String fromString, PrefixManager withPrefix) {
		return dataFactory.getOWLNamedIndividual(fromString, withPrefix);
	}
}
