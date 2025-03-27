package com.bridgelabz.coursemanagement;

// Main class to maintain courses using generics
public class CourseSystem {
    public static void main(String[] args) {
        // Create objects of course class with different course types
        Course<ExamCourse> math = new Course<>(new ExamCourse("MH221", "mathematics", "Dr. Smith"));
        Course<AssignmentCourse> cs = new Course<>(new AssignmentCourse("CS121", "Computer Science", "Prof. Verma"));
        Course<ResearchCourse> physics = new Course<>(new ResearchCourse("PH221", "Quantum Mechanics", "Dr. Doe"));

        // Create an object of course catalog and add courses in it
        CourseCatalog catalog = new CourseCatalog();
        catalog.addCourse(math);
        catalog.addCourse(cs);
        catalog.addCourse(physics);

        // Display courses and details
        System.out.println("--- University Course Catalog ---");
        catalog.displayCourses();
    }
}
// Sample Output ->
// --- University Course Catalog ---
// Course Code: MH221| Course Name: mathematics by Dr. Smith
// Course Code: CS121| Course Name: Computer Science by Prof. Verma
// Course Code: PH221| Course Name: Quantum Mechanics by Dr. Doe