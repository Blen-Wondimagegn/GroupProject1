package GroupProject1;

import java.util.ArrayList;
import java.util.List;

public class MedRunner {

    public static void main(String[] args) {
        // Create some medical records
        MedicalRecord record1 = new MedicalRecord("2024-01-01", "Flu");
        MedicalRecord record2 = new MedicalRecord("2024-02-15", "Fracture");

        // Create a list of medical records and add the records to it
        List<MedicalRecord> records = new ArrayList<>();
        records.add(record1);
        records.add(record2);

        // Create a patient and initialize with patientID, name, and medical history
        Patient patient = new Patient(1, "Alice Johnson", records);

        // Add a new medical record
        MedicalRecord record3 = new MedicalRecord("2024-03-10", "Cold");
        patient.addMedicalRecord(record3);

        // Update an existing medical record
        MedicalRecord updatedRecord = new MedicalRecord("2024-02-15", "Healed Fracture");
        patient.updateMedicalRecord(1, updatedRecord);

        // Retrieve and display a specific medical record
        MedicalRecord retrievedRecord = patient.getMedicalRecord(0);
        System.out.println("Retrieved Medical Record: " + retrievedRecord);

        // Display initial and updated medical history
        System.out.println("Initial Medical History:");
        System.out.println(records.get(0));
        System.out.println(records.get(1));
        System.out.println(records.get(2)); // After adding the third record

        System.out.println("Updated Medical History:");
        System.out.println(patient.getMedicalHistory().get(0));
        System.out.println(patient.getMedicalHistory().get(1)); // Updated second record
        System.out.println(patient.getMedicalHistory().get(2));

        // Create an inpatient and outpatient for demonstration
        Inpatient inpatient = new Inpatient(2, "Bob Brown", new ArrayList<>(), "2024-04-01", "Room 101");
        Outpatient outpatient = new Outpatient(3, "Charlie Green", new ArrayList<>(), "2024-05-05", "Dr. Adams");

        // Add and update medical records for inpatient and outpatient
        MedicalRecord inpatientRecord = new MedicalRecord("2024-04-01", "Pneumonia");
        inpatient.addMedicalRecord(inpatientRecord);
        MedicalRecord outpatientRecord = new MedicalRecord("2024-05-05", "Back Pain");
        outpatient.addMedicalRecord(outpatientRecord);

        // Display inpatient and outpatient medical history
        System.out.println("Inpatient Medical History:");
        System.out.println(inpatient.getMedicalHistory().get(0));

        System.out.println("Outpatient Medical History:");
        System.out.println(outpatient.getMedicalHistory().get(0));

        // Create a hospital and add patients to it
        Hospital<Patient> hospital = new Hospital<>();
        hospital.addPatient(patient);
        hospital.addPatient(inpatient);
        hospital.addPatient(outpatient);

        // Display patient information in the hospital
        Patient p1 = hospital.getPatient(1);
        Patient p2 = hospital.getPatient(2);
        Patient p3 = hospital.getPatient(3);

        System.out.println("Patient ID: " + p1.getPatientID());
        System.out.println("Name: " + p1.getName());

        System.out.println("Patient ID: " + p2.getPatientID());
        System.out.println("Name: " + p2.getName());
        System.out.println("Type: Inpatient");
        System.out.println("Admission Date: " + ((Inpatient) p2).getAdmissionDate());
        System.out.println("Room Number: " + ((Inpatient) p2).getRoomNumber());

        System.out.println("Patient ID: " + p3.getPatientID());
        System.out.println("Name: " + p3.getName());
        System.out.println("Type: Outpatient");
        System.out.println("Appointment Date: " + ((Outpatient) p3).getAppointmentDate());
        System.out.println("Doctor Name: " + ((Outpatient) p3).getDoctorName());

        // Display specific patient information
        System.out.println("Retrieved Patient: " + p1);
        System.out.println("Retrieved Patient: " + p2);
        System.out.println("Retrieved Patient: " + p3);
    }
}


