package Task2.runner;

import Task2.staff.Accountant;
import Task2.staff.Director;
import Task2.staff.Worker;

public class Runner {
    public static void main(String[] args) {

        Director director1 = new Director("Самир", "Раджулабов","Намик оглы", "Директор");

        Accountant accountant1 = new Accountant("Галина", "Дрезден","Викторовна", "Главный бухгалтер");

        Worker worker1 = new Worker("Семён", "Дрезден", "Васильевич",  "Погрузчик");

        System.out.println("Должность сотрудника1 - " + "" + director1.printJobTitle(director1));
        System.out.println("Должность сотрудника2 - " + "" + accountant1.printJobTitle(accountant1));
        System.out.println("Должность сотрудника3 - " + "" + worker1.printJobTitle(worker1));
    }
}