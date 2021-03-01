package com.jacobarchambault.owldemo;

import java.io.File;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

public final class JOntology {

	final File file;
	final OWLOntologyManager manager;
	final OWLOntology ontology;

	JOntology(
			final File file,
			final OWLOntologyManager manager)
			throws OWLOntologyCreationException {
		this.file = file;
		this.manager = manager;
		ontology = manager.loadOntologyFromOntologyDocument(
				file);
	}

	OWLDataFactory ontologyData() {
		return manager.getOWLDataFactory();
	}

	void save() throws OWLOntologyStorageException {
		save(
				file);
	}

	void save(
			final File file) throws OWLOntologyStorageException {
		manager.saveOntology(
				ontology,
				IRI.create(
						file.toURI()));
	}
}
