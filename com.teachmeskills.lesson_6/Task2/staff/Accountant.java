package Task2.staff;

public class Accountant extends InfoStaff implements Staff {

    public Accountant(String firstName, String lastName, String surName, String jobTitle) {
        super(firstName, lastName, surName, jobTitle);
    }

    @Override
    public String toString() {
        return jobTitle;
    }

}