package com.jacobarchambault.owldemo;

import java.io.File;

import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(
			String[] args) throws OWLOntologyCreationException {
		OWLOntology ontology = new JOntology(
				new File(
						"solar-ontology.owl"),
				new JOntologyManager()).load();
		System.out.println(
				"Hello");
	}
}
