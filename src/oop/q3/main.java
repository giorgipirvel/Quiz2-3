package oop.q3;

public class main {
    public static void main(String[] args) {
        // Create university
        University university = new University();

        // Create some students
        Student myself = new Student("YOUR_NAME", "YOUR_SURNAME", "YOUR_COUNTRY", "YOUR_INFO");
        Student student1 = new Student("John", "Doe", "USA", "Exchange student");
        Student student2 = new Student("Jane", "Smith", "UK", "Full-time student");

        // Add students to university
        university.addStudent(student1);
        university.addStudent(student2);

        // Print all students
        System.out.println("All students:");
        university.printStudents();

        // Test getStudentInfoStrange method
        System.out.println("\nTesting getStudentInfoStrange method:");
        System.out.println("Case 1 - myself not in university: " + university.getStudentInfoStrange(myself));

        university.addStudent(myself);
        System.out.println("Case 2 - myself in university: " + university.getStudentInfoStrange(myself));

        System.out.println("Case 3 - other student in university: " + university.getStudentInfoStrange(student1));

        Student studentNotInUniversity = new Student("Alex", "Johnson", "Canada", "Not enrolled");
        System.out.println("Case 4 - other student not in university: " + university.getStudentInfoStrange(studentNotInUniversity));
    }
}