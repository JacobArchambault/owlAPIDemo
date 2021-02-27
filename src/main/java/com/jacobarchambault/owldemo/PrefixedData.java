package com.jacobarchambault.owldemo;

import org.semanticweb.owlapi.model.OWLClass;
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

	final OWLClass JOWLClass(
			String fromString) {
		return jOWLData.JOWLClass(
				fromString,
				prefix);
	}

}
