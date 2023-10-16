package com.mycompany.csc325_oop_designreview_lab;

// ToDo 1: Student extends Human
public class Student extends Human {

    // ToDo 3: Add GPA field
    private double gpa;

    // ToDo: address field (required by Human)
    private String address;

    private int credits;

    // Constructor (ToDo 6): must call super()
    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
        this.address = "Unknown"; // default
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // GPA getter and setter (ToDo 3)
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // ToDo 2: Implement abstract methods from Human
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // ToDo 9: toString method
    @Override
    public String toString() {
        return "Student{name=" + getName() +
                ", age=" + getAge() +
                ", gpa=" + gpa +
                ", address=" + address +
                ", credits=" + credits + "}";
    }
}
