package com.jacobarchambault.owldemo;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.PrefixManager;

public final class PrefixedData implements JData {
	final JOWLData jOWLData;
	final PrefixManager prefix;

	PrefixedData(
			final JOWLData jOWLData,
			final PrefixManager prefix) {
		this.jOWLData = jOWLData;
		this.prefix = prefix;
	}

	OWLClass jOWLClass(
			final String fromString) {
		return jOWLData.jOWLClass(
				fromString,
				prefix);
	}

	OWLNamedIndividual jOWLNamedIndividual(
			final String shortName) {
		return jOWLData.jOWLNamedIndividual(
				shortName,
				prefix);
	}

}
