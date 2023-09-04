package com.jbk.collection.sol4;

public class HospitalManagementSystem {
	public static void main(String[] args) {

		PatientMasters patientMasters = new PatientMasters();

		Patient patient1 = new Patient();
		patient1.setPatientId(111);
		patient1.setPatientName("Ismail");
		patient1.setPatientAge(22);
		patientMasters.addPatient(patient1);

		Patient patient2 = new Patient();
		patient2.setPatientId(112);
		patient2.setPatientName("Himmat ");
		patient2.setPatientAge(20);
		patientMasters.addPatient(patient2);

		// getting patient
		int patientId = 112;
		Patient patientById = patientMasters.getPatientById(patientId);
		if (patientById != null) {
			System.out.println("Patient with id " + patientId + " Name " + patientById.getPatientName() + " Age "
					+ patientById.getPatientAge());
		} else {
			System.out.println("Patient not found with id " + patientId);
		}
		
		System.out.println("---------------");
		// list all patients
		patientMasters.getAllPatients();
	}
}
