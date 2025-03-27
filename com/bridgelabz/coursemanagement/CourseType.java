package com.bridgelabz.coursemanagement;

// Abstract class to define course type
abstract class CourseType {
    // Attributes
    private final String courseCode;
    private final String courseName;
    private final String instructor;

    // Constructor
    CourseType(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    // getter methods for course code, course name, instructor
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    // method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode + "| Course Name: " + courseName + " by " + instructor);
    }
}

// Subclass -> ExamCourse
class ExamCourse extends CourseType {
    // Constructor
    ExamCourse(String courseCode, String courseName, String instructor) {
        super(courseCode, courseName, instructor);
    }
}

// Subclass -> AssignmentCourse
class AssignmentCourse extends CourseType {
    // Constructor
    AssignmentCourse(String courseCode, String courseName, String instructor) {
        super(courseCode, courseName, instructor);
    }
}

// Subclass -> ResearchCourse
class ResearchCourse extends CourseType {
    // Constructor
    ResearchCourse(String courseCode, String courseName, String instructor) {
        super(courseCode, courseName, instructor);
    }
}