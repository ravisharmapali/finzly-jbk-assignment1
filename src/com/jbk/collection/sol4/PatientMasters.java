package com.jbk.collection.sol4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PatientMasters {

	HashMap<Integer, Patient> patients = new HashMap<>();

	public void addPatient(Patient patient) {
		if (patient != null) {
			patients.put(patient.getPatientId(), patient);
		}
	}

	public Patient getPatientById(int patientId) {

		Iterator<Integer> iterator = patients.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			if (key == patientId) {
				Patient patient = patients.get(key);
				return patient;
			}
		}
		return null;
	}

	public void getAllPatients() {
		System.out.println("Id" + "\tName" + "\tAge");
		for (Map.Entry<Integer, Patient> set : patients.entrySet()) {
			System.out.println(
					set.getKey() + "\t" + set.getValue().getPatientName() + "\t" + set.getValue().getPatientAge());
		}
	}
}
