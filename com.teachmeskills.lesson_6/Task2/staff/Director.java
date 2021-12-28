package Task2.staff;

public class Director extends InfoStaff implements Staff {

    public Director(String firstName, String lastName, String surName, String jobTitle) {
        super(firstName, lastName, surName, jobTitle);
    }

    @Override
    public String toString() {
        return jobTitle;
    }
}