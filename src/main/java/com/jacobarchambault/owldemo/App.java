package com.jacobarchambault.owldemo;

import java.io.File;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.util.DefaultPrefixManager;

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
		PrefixedData sarefData = new PrefixedData(
				new JOWLData(
						jOntology),
				new DefaultPrefixManager(
						"https://saref.etsi.org/saref4bldg/v1.1.2/#"));
		PrefixedData myData = new PrefixedData(
				new JOWLData(
						jOntology),
				new DefaultPrefixManager(
						"http://www.semanticweb.org/jacobarchambault/ontologies/2021/0/solar-ontology/#"));

		jOntology.save(
				new File(
						"solar-ontology-result.owl"));
	}
}
