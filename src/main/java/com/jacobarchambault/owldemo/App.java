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
			final String[] args) throws OWLOntologyCreationException,
			OWLOntologyStorageException {
		final var jOntology = new JOntology(
				new File(
						"solar-ontology.owl"),
				OWLManager.createConcurrentOWLOntologyManager());
		final var baseOWLData = new JOWLData(
				jOntology);
		final var sarefData = new PrefixedData(
				baseOWLData,
				new DefaultPrefixManager(
						"https://saref.etsi.org/saref4bldg/v1.1.2/#"));
		final var myData = new PrefixedData(
				baseOWLData,
				new DefaultPrefixManager(
						"http://www.semanticweb.org/jacobarchambault/ontologies/2021/0/solar-ontology/#"));
		final var solarPanel = new SolarPanel(
				myData,
				"solar_panel_1");

		jOntology.save(
				new File(
						"solar-ontology-result.owl"));
	}
}
