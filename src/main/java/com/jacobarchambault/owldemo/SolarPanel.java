package com.jacobarchambault.owldemo;

public class SolarPanel {
	final PrefixedData data;
	final String shortName;

	SolarPanel(
			PrefixedData data,
			String shortName) {
		this.data = data;
		this.shortName = shortName;
	}

	double generateEnergy(
			boolean sunIsOut,
			double ambientTemperatureInCelsius) throws Exception {
		// For this example, we'll set DCVoltage to 30, since that's pretty standard for
		// .5 volts per cell, and 60 cells per panel
		double dcVoltage = 30;
		if (!sunIsOut) {
			return 0;
		} else if (ambientTemperatureInCelsius > 25) {
			return dcVoltage;
		}
		// Adjust voltage for ambient temperature following 2020 NFPA, found at section
		// 690 here:
		// https://www.nfpa.org/codes-and-standards/all-codes-and-standards/list-of-codes-and-standards/detail?code=70
		else if (isInRange(
				ambientTemperatureInCelsius,
				20,
				24)) {
			return dcVoltage * 1.02;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				15,
				20)) {
			return dcVoltage * 1.04;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				10,
				15)) {
			return dcVoltage * 1.06;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				5,
				10)) {
			return dcVoltage * 1.08;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				0,
				5)) {
			return dcVoltage * 1.10;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				-5,
				0)) {
			return dcVoltage * 1.12;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				-10,
				-5)) {
			return dcVoltage * 1.14;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				-15,
				-10)) {
			return dcVoltage * 1.16;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				-20,
				-15)) {
			return dcVoltage * 1.18;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				-25,
				-20)) {
			return dcVoltage * 1.20;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				-30,
				-25)) {
			return dcVoltage * 1.21;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				-35,
				-30)) {
			return dcVoltage * 1.23;
		} else if (isInRange(
				ambientTemperatureInCelsius,
				-40,
				-35)) {
			return dcVoltage * 1.25;
		} else {
			throw new Exception(
					"Move to a warmer climate");
		}
	}

	private boolean isInRange(
			double number,
			double lowInclusive,
			double highExclusive) {
		return number >= lowInclusive && number < highExclusive;
	}
}