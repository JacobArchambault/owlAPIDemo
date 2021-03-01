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
			File file,
			OWLOntologyManager manager)
			throws OWLOntologyCreationException {
		this.file = file;
		this.manager = manager;
		this.ontology = manager.loadOntologyFromOntologyDocument(
				file);
	}

	final OWLDataFactory ontologyData() {
		return manager.getOWLDataFactory();
	}

	final void save() throws OWLOntologyStorageException {
		save(
				file);
	}

	final void save(
			File file) throws OWLOntologyStorageException {
		manager.saveOntology(
				ontology,
				IRI.create(
						file.toURI()));
	}
}
