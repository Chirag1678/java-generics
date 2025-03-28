package com.bridgelabz.resumescreener;

// Main class to check resumes using generics
public class ScreeningSystem {
    public static void main(String[] args) {
        // Create objects of resume for different roles
        Resume<SoftwareEngineer> seResume = new Resume<>("Jane Smith", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("John Doe", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Amit Sharma", new ProductManager());

        // Create object of screening pipeline
        ScreeningPipeline pipeline = new ScreeningPipeline();
        pipeline.addResume(seResume);
        pipeline.addResume(dsResume);
        pipeline.addResume(pmResume);

        System.out.println("--- AI-Driven Resume Screening ---");
        pipeline.displayResumes();
    }
}
// Sample Output ->
// --- AI-Driven Resume Screening ---
// Name: Jane Smith
// Software Engineer: Requires strong coding and problem-solving skills.
// Name: John Doe
// Data Scientist: Requires expertise in machine learning and data analysis.
// Name: Amit Sharma
// Product Manager: Requires strategic thinking and leadership skills.