package com.jacobarchambault.owldemo;

import java.io.File;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(
			String[] args) throws OWLOntologyCreationException,
			OWLOntologyStorageException {
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = manager.loadOntologyFromOntologyDocument(
				new File(
						"solar-ontology.owl"));

		System.out.println(
				"Hello");
		IRI iri = IRI.create(
				new File(
						"solar-ontology-result.owl").toURI());
		manager.saveOntology(
				ontology,
				iri);
	}
}
