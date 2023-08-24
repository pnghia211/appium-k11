package LAB_7;

import java.util.Arrays;
import java.util.List;

public class LAB_07_EmployeeController {


    public static void main(String[] args) {
        LAB_07_FullTimeEmployee fullTimeEmployee = new LAB_07_FullTimeEmployee();
        LAB_07_PartTimeEmployee partTimeEmployee = new LAB_07_PartTimeEmployee();
        List<LAB_07_Employee> employeeList = Arrays.asList(fullTimeEmployee, partTimeEmployee);

        int totalSalary = 0;
        for (LAB_07_Employee employee : employeeList) {
            totalSalary += employee.getSum();
        }
        System.out.println(totalSalary);

    }


}

