package oop.q3;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;

    public University() {
        students = new ArrayList<>();
    }

    // Add a student to the university
    public void addStudent(Student s) {
        if (s != null && !students.contains(s)) {
            students.add(s);
        }
    }

    // Remove a student from the university
    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    // Print all students
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Check if university contains a specific student
    public boolean containsStudent(Student s) {
        return students.contains(s);
    }

    // Special method as per requirements
    public String getStudentInfoStrange(Student s) {
        // Replace these values with your actual information
        Student myself = new Student("Giorgi", "Pirveli", "Georgia", "Private");
        String myPersonalNumber = "YOUR_PERSONAL_NUMBER"; // Your Argus personal number

        if (s.equals(myself)) {
            if (containsStudent(s)) {
                // Case 1: If the student is yourself and the university contains you
                return "Java OOP, Data Structures, Algorithms, Databases"; // Replace with your actual courses
            } else {
                // Case 2: If the student is yourself but the university doesn't contain you
                return myPersonalNumber;
            }
        } else {
            // Case 3: If the student is not yourself
            if (containsStudent(s)) {
                return s.getInfo();
            } else {
                return null;
            }
        }
    }
}