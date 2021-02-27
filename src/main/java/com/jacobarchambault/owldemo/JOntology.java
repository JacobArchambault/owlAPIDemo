package com.jacobarchambault.owldemo;

import java.io.File;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

public class JOntology {

	File file;

	JOntology(
			File file) {
		this.file = file;
	}

	OWLOntology load() throws OWLOntologyCreationException {
		return OWLManager.createOWLOntologyManager()
				.loadOntologyFromOntologyDocument(
						file);

	}
}
