/**
 * Appointment type: Encapsulate patient appointment information and link it with health professionals.
 */
public class Appointment {
    // Instance variable
    private String patientName;
    private String patientMobile;
    private String timeSlot;           // The scheduled time slot
    private HealthProfessional selectedProfessional; // The selected health professionals

    // Default constructor (without parameters)
    public Appointment() {}

    // Parameterized constructor (initializing all variables)
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional selectedProfessional) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.selectedProfessional = selectedProfessional;
    }

    // Method for Printing Appointment Details
    public void printAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Patient's Name: " + patientName);
        System.out.println("Patient's mobile phone number: " + patientMobile);
        System.out.println("Scheduled time: " + timeSlot);
        System.out.println("Information of the attending doctor:");
        selectedProfessional.printDetails(); // Invoke the doctor's printing method
    }

    // Getter and Setter (Used for obtaining/modifying variables during appointment management)
    public String getPatientMobile() {
        return patientMobile;
    }
    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }

    public String getPatientName() {
        return patientName;
    }

    public HealthProfessional getSelectedProfessional() {
        return selectedProfessional;
    }
    public void setSelectedProfessional(HealthProfessional selectedProfessional) {
        this.selectedProfessional = selectedProfessional;
    }
}