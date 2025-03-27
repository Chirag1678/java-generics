package com.bridgelabz.coursemanagement;

// Generic class to manage course and its details
class Course<T extends CourseType> {
    // Attribute
    private final T courseType;

    // Constructor
    Course(T courseType) {
        this.courseType = courseType;
    }

    // getter method to get the course
    public T getCourseType() {
        return courseType;
    }

    // method to display course details
    public void displayCourse() {
        courseType.displayCourseDetails();
    }
}
