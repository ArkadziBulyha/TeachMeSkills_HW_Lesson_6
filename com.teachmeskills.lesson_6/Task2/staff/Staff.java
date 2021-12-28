package Task2.staff;

public interface Staff {

    default String printJobTitle(Staff staff) {
        return staff.toString();
    }

}
