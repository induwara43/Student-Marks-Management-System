package com.exam.cs2019032.student;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @Column(nullable = false,unique = true,length = 12,name = "student_id")
    private String studentID;
    @Column(nullable = false,length = 45,name = "student_name")
    private String studentName;
    @Column(name = "ca_marks")
    private int caMarks;
    @Column(name = "practical_marks")
    private int practicalMarks;
    @Column(name = "theory_marks")
    private int theoryMarks;
    @Column(name = "final_marks")
    private double finalMarks;

    public void calculateFinalMarks(){
        this.finalMarks = caMarks*0.2 + practicalMarks*0.2 + theoryMarks*0.6;
    }
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCaMarks() {
        return caMarks;
    }

    public void setCaMarks(int caMarks) {
        this.caMarks = caMarks;
    }

    public int getPracticalMarks() {
        return practicalMarks;
    }

    public void setPracticalMarks(int practicalMarks) {
        this.practicalMarks = practicalMarks;
    }

    public int getTheoryMarks() {
        return theoryMarks;
    }

    public void setTheoryMarks(int theoryMarks) {
        this.theoryMarks = theoryMarks;
    }

    public double getFinalMarks() {
        return finalMarks;
    }

    public void setFinalMarks(double finalMarks) {
        this.finalMarks = finalMarks;
    }
}
