/**
 * General practitioner subclass, inheriting the base class of health professionals
 * Unique attribute: Whether one is a chief physician level doctor
 */
public class GeneralPractitioner extends HealthProfessional {
    // Unique instance variables of subclasses
    private boolean chiefPhysicianJudgment; // Is it a chief physician? (Boolean type)

    // Default constructor (without parameters)
    public GeneralPractitioner() {
        super(); // Implicitly call the base class's parameterless constructor method
    }

    // Parameterized constructor (initializing base class variables + unique variables of the subclass)
    public GeneralPractitioner(String id, String name, String age, String specialty, boolean chiefPhysicianJudgment) {
        // Call the parameterized constructor of the base class to initialize the common properties
        super(id, name, age, specialty);
        // Initialize unique attributes of the subclass
        this.chiefPhysicianJudgment = chiefPhysicianJudgment;
    }

    // Printing method (output complete information of general practitioners, overriding the base class method)
    @Override
    public void printDetails() {
        System.out.println("=== Type of health professional: General practitioner ===");
        super.printDetails(); // Call the base class's printing method and reuse the common attributes for output.
        System.out.println("- Is it a chief physician? " + (chiefPhysicianJudgment ? "*YES*" : "*NO*"));
        System.out.println(); // Blank lines for separation
    }

    // Getter and Setter
    public boolean getChiefPhysicianJudgment() {
        return chiefPhysicianJudgment;
    }

    public void setChiefPhysicianJudgment(boolean chiefPhysicianJudgment) {
        this.chiefPhysicianJudgment = chiefPhysicianJudgment;
    }
}