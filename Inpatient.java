package GroupProject1;

import java.util.List;

public class Inpatient extends Patient {
    private String admissionDate;
    private String roomNumber;

    // Constructor
    public Inpatient(int patientID, String name, List<MedicalRecord> medicalHistory, String admissionDate, String roomNumber) {
        super(patientID, name, medicalHistory);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
    }

    // Getters and Setters
    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Inpatient{" +
                "patientID=" + getPatientID() +
                ", name='" + getName() + '\'' +
                ", admissionDate='" + admissionDate + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }
}
