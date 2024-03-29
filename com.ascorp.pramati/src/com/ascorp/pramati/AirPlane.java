package com.ascorp.pramati;

import java.io.IOException;

public class AirPlane {
	public AirPlane() throws IOException {
		System.out.print("AirPlane");
		throw new IOException();
	}
}

class AirJet extends AirPlane {
	public AirJet() throws IOException {
		try {
			super();
		} catch (IOException e) {
			System.out.print("IOException is thrown in AirJet");
		}
	}
}

class AirPlanem {
	public static void main(String args[]) {
		try {
			new AirJet();
		} catch (IOException e) {
			System.out.print("IOException is thrown in Tester");
		}
	}
}
