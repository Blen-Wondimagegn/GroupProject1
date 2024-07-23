package GroupProject1;

import java.util.ArrayList;
import java.util.List;

public class Hospital<T extends Patient> {
    private List<T> patients;

    // Default constructor
    public Hospital() {
        this.patients = new ArrayList<>();
    }

    // Method to add a patient
    public void addPatient(T patient) {
        if (patient != null) {
            patients.add(patient);
        } else {
            System.out.println("Cannot add a null patient.");
        }
    }

    public T getPatient(int patientID) {
        for (T patient : patients) {
            if (patient.getPatientID() == patientID) {
                return patient;
            }
        }
        return null; // or throw an exception if patient not found
    }

}