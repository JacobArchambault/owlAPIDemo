package com.jacobarchambault.owldemo;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.PrefixManager;

public final class PrefixedData implements JData {
	final JOWLData jOWLData;
	final PrefixManager prefix;

	PrefixedData(
			JOWLData jOWLData,
			PrefixManager prefix) {
		this.jOWLData = jOWLData;
		this.prefix = prefix;
	}

	final OWLClass jOWLClass(
			String fromString) {
		return jOWLData.jOWLClass(
				fromString,
				prefix);
	}

	final OWLNamedIndividual jOWLNamedIndividual(
			String shortName) {
		return jOWLData.jOWLNamedIndividual(
				shortName,
				prefix);
	}

}
