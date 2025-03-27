package com.bridgelabz.coursemanagement;

import java.util.ArrayList;

// Class to add, remove and display courses using wildcard
class CourseCatalog {
    private ArrayList<Course<? extends CourseType>> courses = new ArrayList<>();

    // method to add course
    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    // method to remove course
    public void removeCourse(String courseCode) {
        boolean found = false;
        for(Course<? extends CourseType> course:courses) {
            if(course.getCourseType().getCourseCode().equalsIgnoreCase(courseCode)) {
                System.out.println("Removed course details: ");
                course.displayCourse();
                courses.remove(course);
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Course with code: " + courseCode + " not found.");
    }

    // method to display courses
    public void displayCourses() {
        for(Course<? extends CourseType> course:courses) {
            course.displayCourse();
        }
    }
}
