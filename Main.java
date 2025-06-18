package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        try {
            employeeDAO.addEmployee("John", 30, "Developer", 50000);
            employeeDAO.addEmployee("Jane", 28, "Designer", 45000);
            employeeDAO.getEmployee(1);
            employeeDAO.updateEmployee(1, "Tom", 31, "Senior Developer", 60000);

            employeeDAO.deleteEmployee(2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закриття з'єднання
            employeeDAO.dbConnector.close();
        }
    }
}
