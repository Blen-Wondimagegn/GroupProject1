package GroupProject1;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private int patientID;
    private String name;
    private List<MedicalRecord> medicalHistory;

    // Constructor
    public Patient(int patientID, String name, List<MedicalRecord> medicalHistory) {
        this.patientID = patientID;
        this.name = name;
        this.medicalHistory = medicalHistory != null ? medicalHistory : new ArrayList<>();
    }

    // Getters and Setters
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MedicalRecord> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<MedicalRecord> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // Method to add a medical record
    public void addMedicalRecord(MedicalRecord record) {
        if (record != null) {
            medicalHistory.add(record);
        } else {
            System.out.println("Cannot add a null medical record.");
        }
    }

    // Method to update a medical record
    public void updateMedicalRecord(int index, MedicalRecord newRecord) {
        if (index >= 0 && index < medicalHistory.size()) {
            if (newRecord != null) {
                medicalHistory.set(index, newRecord);
            } else {
                System.out.println("Cannot update with a null medical record.");
            }
        } else {
            System.out.println("Invalid index. Please provide a valid index.");
        }
    }

    // Method to get a medical record
    public MedicalRecord getMedicalRecord(int index) {
        if (index >= 0 && index < medicalHistory.size()) {
            return medicalHistory.get(index);
        } else {
            System.out.println("Invalid index. Please provide a valid index.");
            return null;
        }
    }
}
