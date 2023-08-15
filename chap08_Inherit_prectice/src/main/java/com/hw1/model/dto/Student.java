package com.hw1.model.dto;

public class Student extends Person{

    private int grade;
    private String major;

    public Student() {
    }


    public String info() {
        return super.info() + "Student{" +
                "grade=" + grade +
                ", major='" + major + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int grade, String major) {
        this.grade = grade;
        this.major = major;
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(name, age, height, weight);
        this.grade = grade;
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
