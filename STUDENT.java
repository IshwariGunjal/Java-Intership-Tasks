//6th
// Inside the addStudent() method
private static void addStudent() {
    System.out.print("Enter student ID: ");
    int id = readIntInput();

    System.out.print("Enter student name: ");
    String name = readStringInput();

    students.add(new Student(id, name));
    System.out.println("Student added successfully.");
}

// Inside the editStudent() method
private static void editStudent() {
    System.out.print("Enter student ID to edit: ");
    int id = readIntInput();

    Student student = findStudentById(id);
    if (student != null) {
        System.out.print("Enter new student name: ");
        String newName = readStringInput();
        student.setName(newName);
        System.out.println("Student information updated successfully.");
    } else {
        System.out.println("Student not found.");
    }
}

// Helper method to read integer input with validation
private static int readIntInput() {
    while (true) {
        try {
            int input = Integer.parseInt(scanner.nextLine());
            return input;
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}

// Helper method to read string input with validation
private static String readStringInput() {
    while (true) {
        String input = scanner.nextLine().trim();
        if (!input.isEmpty()) {
            return input;
        } else {
            System.out.println("Input cannot be empty. Please enter a value.");
        }
    }
}

public static void main(String[] args) {
    // ... (remaining code unchanged)
}
