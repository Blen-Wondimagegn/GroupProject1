package GroupProject1;

public class MedicalRecord {
    private String date;
    private String description;

    // Constructor
    public MedicalRecord(String date, String description) {
        this.date = date;
        this.description = description;
    }

    // Getters and Setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Override toString method
    @Override
    public String toString() {
        return "MedicalRecord{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
