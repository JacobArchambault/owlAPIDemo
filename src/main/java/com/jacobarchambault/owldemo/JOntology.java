package com.jacobarchambault.owldemo;

import java.io.File;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

public final class JOntology {

	final File file;
	final OWLOntologyManager manager;

	JOntology(
			File file,
			OWLOntologyManager manager) {
		this.file = file;
		this.manager = manager;
	}

	final OWLOntology load() throws OWLOntologyCreationException {
		return manager.loadOntologyFromOntologyDocument(
				file);
	}

	final void save(
			OWLOntology ontology,
			File file) throws OWLOntologyStorageException {
		manager.saveOntology(
				ontology,
				IRI.create(
						file.toURI()));
	}

	final void save(
			OWLOntology ontology) throws OWLOntologyStorageException {
		manager.saveOntology(
				ontology,
				IRI.create(
						file.toURI()));
	}
}
