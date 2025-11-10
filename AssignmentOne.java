import java.util.ArrayList;

// Main category.

public class AssignmentOne {
    public static void main(String[] args) {

        // Part 3 – Using classes and objects

        System.out.println("===== Part 3: =====");
        // Create three objects of general practitioners
        GeneralPractitioner gp1 = new GeneralPractitioner("251001", "Doctor Zhang", "43", "Internal Medicine", true);
        GeneralPractitioner gp2 = new GeneralPractitioner("251002", "Doctor Li", "28", "Family Medicine", false);
        GeneralPractitioner gp3 = new GeneralPractitioner("251003", "Doctor Wang", "32", "Otolaryngology", true);

        // Create two objects of the paediatrician type
        Paediatrician p1 = new Paediatrician("252001", "Doctor Chen", "29", "Children's Health", "1 to 6 years old");
        Paediatrician p2 = new Paediatrician("252002", "Doctor Zhao", "38", "Children's Health", "7 to 12 years old");

        // Call the printing method to output all the information of the health professionals.
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        p1.printDetails();
        p2.printDetails();

        System.out.println("------------------------------");


        // Part 5 – Collection of appointments

        System.out.println("\n===== Part 5: =====");
        // Create an ArrayList collection to store all the reservations.
        ArrayList<Appointment> appointmentList = new ArrayList<>();

        // Step 1: Create 4 appointments (2 general practitioners + 2 paediatricians)
        createAppointment(appointmentList, "John", "13800002501", "08:30", gp1);
        createAppointment(appointmentList, "Alice", "13900002502", "10:00", gp2);

        createAppointment(appointmentList, "Jack", "13700002503", "14:30", p1);
        createAppointment(appointmentList, "Sarah", "13600002504", "16:00", p2);

        // Step 2: Print all reservations
        System.out.println("\n[All appointment records]");
        printExistingAppointments(appointmentList);

        // Step 3: Cancel one reservation (for the mobile phone number "13900002502")
        System.out.println("\n[Cancel appointment operation]");
        cancelBooking(appointmentList, "13900002502");

        // Step 4: Print the reservation again and verify that the cancellation was successful.
        System.out.println("\n[The remaining appointment records after cancellation]:");
        printExistingAppointments(appointmentList);

        System.out.println("------------------------------");
    }


    // Part 5 – Collection of appointments


    /**
     * Create appointment: Verify the information and add it to the collection
     */
    public static void createAppointment(ArrayList<Appointment> list, String patientName, String patientMobile, String timeSlot, HealthProfessional professional) {
        // Verify all required information (non-empty)
        if (patientName == null || patientName.trim().isEmpty() ||
                patientMobile == null || patientMobile.trim().isEmpty() ||
                timeSlot == null || timeSlot.trim().isEmpty() ||
                professional == null) {
            System.out.println("Failed to create appointment: Required information cannot be empty!");
            return;
        }

        // Verify the format of the mobile phone number (11 digits)
        if (!patientMobile.matches("\\d{11}")) {
            System.out.println("Failed to create appointment: The mobile phone number " + patientMobile + " is in an incorrect format (it should be 11 digits)!");
            return;
        }

        // The information is legal. Create an appointment object and add it to the collection.
        Appointment appointment = new Appointment(patientName, patientMobile, timeSlot, professional);
        list.add(appointment);
        System.out.println("Appointment created successfully! Patient: " + patientName + ", Time: " + timeSlot);
    }

    /**
     * Print all appointment records
     */
    public static void printExistingAppointments(ArrayList<Appointment> list) {
        if (list.isEmpty()) {
            System.out.println("No reservation record found!");
            return;
        }

        // Iterate through the collection and print out each appointment details.
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\n[Appointment" + (i + 1) + "]");
            list.get(i).printAppointmentDetails();
        }
    }

    /**
     * Cancel Appointment: Search for and delete based on the patient's phone number. The output will include the patient's name.
     */
    public static void cancelBooking(ArrayList<Appointment> list, String mobile) {
        // Search for matching appointments by traversing the collection
        for (int i = 0; i < list.size(); i++) {
            Appointment appointment = list.get(i);
            // Match the patient's mobile phone number in the appointment with the parameter mobile phone number.
            if (appointment.getPatientMobile().equals(mobile)) {
                // Obtain the patient's name through the Getter method
                String patientName = appointment.getPatientName();
                // Find the appointment, delete it and output the cancellation message of "Patient Name + Mobile Number"
                list.remove(i);
                System.out.println("Appointment cancellation successful! The appointment record of patient *[" + patientName + "]* (Phone number: " + mobile + ") has been deleted.");
                return;
            }
        }

        // No matching appointment was found. Outputting prompt.
        System.out.println("Failed to cancel reservation: No reservation record with mobile number " + mobile + " was found!");
    }
}