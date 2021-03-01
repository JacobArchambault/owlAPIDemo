package com.jacobarchambault.owldemo;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.PrefixManager;

public final class JOWLData implements JData {
	final OWLDataFactory dataFactory;
	final JOntology ontology;

	JOWLData(
			final JOntology ontology) {
		this.ontology = ontology;
		dataFactory = ontology.ontologyData();
	}

	OWLClass jOWLClass(
			final IRI fromIri) {
		return dataFactory.getOWLClass(
				fromIri);
	}

	OWLClass jOWLClass(
			final String fromString) {
		return jOWLClass(
				IRI.create(
						fromString));
	}

	OWLClass jOWLClass(
			final String fromString,
			final PrefixManager withPrefix) {
		return dataFactory.getOWLClass(
				fromString,
				withPrefix);
	}

	OWLNamedIndividual jOWLNamedIndividual(
			final String fromString,
			final PrefixManager withPrefix) {
		return dataFactory.getOWLNamedIndividual(
				fromString,
				withPrefix);
	}
}
