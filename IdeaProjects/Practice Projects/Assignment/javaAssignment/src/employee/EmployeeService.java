package employee;

public interface EmployeeService {

    boolean add (Employee e);
    boolean removeById (int id);
    Employee searchByName(String name);
    Employee searchBySalaryRange(int low,int high);
}
