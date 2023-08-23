import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String rollNumber;
    private String grade;
    private Map<String, String> details;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.details = new HashMap<>();
    }

    public void addDetail(String key, String value) {
        details.put(key, value);
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "A123", "10th");
        student1.addDetail("DOB", "1999-05-15");
        student1.addDetail("Address", "123 Main St, City");

        System.out.println("Student Name: " + student1.name);
        System.out.println("Roll Number: " + student1.rollNumber);
        System.out.println("Grade: " + student1.grade);
        System.out.println("Details: " + student1.getDetails());
    }
}
