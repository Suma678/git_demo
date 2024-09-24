package com;

import java.util.ArrayList;
import java.util.List;

// Class representing a subject
class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Class representing a grade for a subject
class Grade {
    private Subject subject;
    private double score;

    public Grade(Subject subject, double score) {
        this.subject = subject;
        this.score = score;
    }

    public Subject getSubject() {
        return subject;
    }

    public double getScore() {
        return score;
    }
}

// Class representing a student
class Student {
    private String name;
    private String studentId;
    private List<Grade> grades;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void addGrade(Subject subject, double score) {
        Grade grade = new Grade(subject, score);
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (Grade grade : grades) {
            total += grade.getScore();
        }
        return total / grades.size();
    }

    public void displayGrades() {
        System.out.println("Grades for " + name + " (ID: " + studentId + "):");
        for (Grade grade : grades) {
            System.out.println("Subject: " + grade.getSubject().getName() + " | Score: " + grade.getScore());
        }
        System.out.println("Average Grade: " + calculateAverageGrade());
        System.out.println("=====================================");
    }
}

// Main class to manage students and grades
public class StudentGrade {

    public static void main(String[] args) {
        // Create subjects
        Subject math = new Subject("Mathematics");
        Subject english = new Subject("English");
        Subject science = new Subject("Science");

        // Create students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        // Assign grades to students
        student1.addGrade(math, 85);
        student1.addGrade(english, 90);
        student1.addGrade(science, 88);

        student2.addGrade(math, 78);
        student2.addGrade(english, 82);
        student2.addGrade(science, 79);

        // Display grades and average for each student
        student1.displayGrades();
        student2.displayGrades();
    }
}
