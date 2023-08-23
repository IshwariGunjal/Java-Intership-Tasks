
//1st
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
        Student student1 = new Student("Ghule Harshada ", "2002", "Bsc(com sci)");
        student1.addDetail("DOB", "2002-05-15");
        student1.addDetail("Address", "200 Main St, pune");

        System.out.println("Student Name: " + student1.name);
        System.out.println("Roll Number: " + student1.rollNumber);
        System.out.println("Grade: " + student1.grade);
        System.out.println("Details: " + student1.getDetails());
    }
}



