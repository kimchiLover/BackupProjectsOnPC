package employee;

public class Driver {
    public static void main(String[] args) {
        EmployeeService employeeService = EmployeeServiceImpl.getInstance();

        employeeService.add(new Employee());
        employeeService.removeById(5);
        employeeService.searchByName("Abc");

    }
}
