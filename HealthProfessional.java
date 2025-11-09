/**
 * Health Professional Base Class, encapsulating all common attributes and behaviors of all health professionals
 */
public class HealthProfessional {
    // Common instance variables (ID, name, age, professional field)
    private String id;
    private String name;
    private String age;
    private String specialty; // 专业领域

    // Default constructor (without parameters)
    public HealthProfessional() {}

    // Parameterized constructor (initializing all common variables)
    public HealthProfessional(String id, String name, String age, String specialty) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.specialty = specialty;
    }

    // The method for printing all common attributes
    public void printDetails() {
        System.out.println("The basic information of the medical professionals is as follows: ");
        System.out.println("- ID: " + id);
        System.out.println("- NAME: " + name);
        System.out.println("- AGE: " + age);
        System.out.println("- Specialty Field: " + specialty);
    }

    // Getter and Setter (Used for subclasses to access the private variables of the base class, demonstrating encapsulation)
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}