package com.jacobarchambault.owldemo;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public final class JOntologyManager {
	
	final OWLOntologyManager create() {
		return OWLManager.createOWLOntologyManager();
	}

}
