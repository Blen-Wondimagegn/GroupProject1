package GroupProject1;

import java.util.List;

public class Outpatient extends Patient {
    private String appointmentDate;
    private String doctorName;

    // Constructor
    public Outpatient(int patientID, String name, List<MedicalRecord> medicalHistory, String appointmentDate, String doctorName) {
        super(patientID, name, medicalHistory);
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }

    // Getters and Setters
    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Outpatient{" +
                "patientID=" + getPatientID() +
                ", name='" + getName() + '\'' +
                ", appointmentDate='" + appointmentDate + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
