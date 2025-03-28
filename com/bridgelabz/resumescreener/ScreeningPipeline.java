package com.bridgelabz.resumescreener;

import java.util.ArrayList;

// Class to handle multiple job roles in screening pipeline using generic and wildcard method
public class ScreeningPipeline {
    private ArrayList<Resume<? extends JobRole>> resumes = new ArrayList<>();

    // method to add resume
    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    // method to remove resume
    public void removeResume(String name) {
        boolean found = false;
        for(Resume<? extends JobRole> resume:resumes) {
            if(resume.getName().equalsIgnoreCase(name)) {
                System.out.println("Resume with name: " + name + " deleted successfully");
                found = true;
                resumes.remove(resume);
                break;
            }
        }
        if(!found) System.out.println("Resume with name: " + name + " not found.");
    }

    // method to display resumes
    public void displayResumes() {
        for(Resume<? extends JobRole> resume:resumes) {
            resume.displayJobDetails();
        }
    }
}
