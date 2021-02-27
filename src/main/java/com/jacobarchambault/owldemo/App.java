package com.jacobarchambault.owldemo;

import java.io.File;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(
			String[] args) throws OWLOntologyCreationException,
			OWLOntologyStorageException {
		JOntology jOntology = new JOntology(
				new File(
						"solar-ontology.owl"),
				OWLManager.createConcurrentOWLOntologyManager());
		OWLOntology ontology = jOntology.load();

		jOntology.save(
				ontology,
				new File(
						"solar-ontology-result.owl"));
	}
}
