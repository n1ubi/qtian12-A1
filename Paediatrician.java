/**
 * Pediatrician subclass, inheriting the base class of health professionals
 * Unique attribute: Specialized age range
 */
public class Paediatrician extends HealthProfessional {
    // Special instance variables of the subclass (Specialized age range)
    private String specializedAgeGroup;

    // Default constructor (without parameters)
    public Paediatrician() {
        super();
    }

    // Parameterized constructor (initializing base class variables + unique variables of the subclass)
    public Paediatrician(String id, String name, String age, String specialty, String specializedAgeGroup) {
        super(id, name, age, specialty); // Call the parameterized constructor of the base class
        this.specializedAgeGroup = specializedAgeGroup;
    }

    // Printing method (outputting complete information of pediatricians, overriding the base class method)
    @Override
    public void printDetails() {
        System.out.println("=== Type of health professional: Pediatrician ===");
        super.printDetails(); // Output of common attributes of the base class for reuse
        System.out.println("- Age range of expertise: " + specializedAgeGroup);
        System.out.println(); // Blank lines for separation
    }

    // Getter and Setter
    public String getSpecializedAgeGroup() {
        return specializedAgeGroup;
    }

    public void setSpecializedAgeGroup(String specializedAgeGroup) {
        this.specializedAgeGroup = specializedAgeGroup;
    }
}