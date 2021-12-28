package Task2.staff;

public class Worker extends InfoStaff implements Staff {

    public Worker(String firstName, String lastName, String surName, String jobTitle) {
        super(firstName, lastName, surName, jobTitle);
    }

    @Override
    public String toString() {
        return jobTitle;
    }

}