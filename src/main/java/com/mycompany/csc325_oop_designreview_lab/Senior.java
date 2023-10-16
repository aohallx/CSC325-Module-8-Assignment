package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {

    public Senior(String name, short age, int credits) {
        super(name, age, credits);
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have ≥ 85 credits.");
        }
    }

    // ToDo 11: toString
    @Override
    public String toString() {
        return "Senior 🎓 → " + super.toString();
    }
}
