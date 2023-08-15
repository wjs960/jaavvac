package com.hw1.model.dto;

public class Emplpyee extends Person {

    private int salary;
    private String dept;

    public String info() {
        return super.info() + " Emplpyee{" +
                "salary=" + salary +
                ", dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Emplpyee() {
    }

    public Emplpyee(int salary, String dept) {
        this.salary = salary;
        this.dept = dept;
    }

    public Emplpyee(String name, int age, double height, double weight, int salary, String dept) {
        super(name, age, height, weight);
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

