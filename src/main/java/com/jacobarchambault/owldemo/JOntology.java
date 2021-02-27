package com.jacobarchambault.owldemo;

import java.io.File;

import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

public final class JOntology {

	final File file;
	final JOntologyManager manager;

	JOntology(
			File file,
			JOntologyManager manager) {
		this.file = file;
		this.manager = manager;
	}

	final OWLOntology load() throws OWLOntologyCreationException {
		return manager.create()
				.loadOntologyFromOntologyDocument(
						file);
	}
}
