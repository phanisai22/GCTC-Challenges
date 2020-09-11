package org.collection.EmployeeManagement;

/**
 * Implementations to test the program.
 * @author Phani Sai
 * @see EmployeeDB
 * @see Employee
 * @version 1.0
 */
public class Main {

    /**
     * Main Function.
     * @param args
     */
    public static void main(String[] args) {
        Employee e1 = new Employee(22, "John snow", "IKnowNothing@got.com", "Male", 66000);
        Employee e2 = new Employee(1, "Cersei", "PowerIsPower@got.com", "Female", 126000);
        Employee e3 = new Employee();
        Employee e4 = new Employee(3, "Tyrion", "ILikeWine@got.com", "Male", 0);
        Employee e5 = new Employee(23, "Daenerys", "MyReignHasJustBegan@got.com", "Female", 126000);

        EmployeeDB newDB = new EmployeeDB();
        newDB.addEmployee(e1);
        newDB.addEmployee(e2);
        newDB.addEmployee(e3);
        newDB.addEmployee(e4);
        newDB.addEmployee(e5);

        e2.getEmployeeDetails();

        newDB.deleteEmployee(22);
        newDB.showPaySlip(2);

        newDB.deleteEmployee(22);

        newDB.printAll();
    }

}
