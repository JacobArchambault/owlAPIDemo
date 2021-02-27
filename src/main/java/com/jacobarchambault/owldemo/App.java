package com.jacobarchambault.owldemo;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(
			String[] args) {
		new JOntology(
				new File(
						"solar-ontology.owl"));
		System.out.println("Hello");

	}
}
