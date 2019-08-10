package empapp;

import java.util.ArrayList;

public interface EmployeeService {

    boolean add (Employee e);
    boolean removeById (int id);
    Employee searchByName(String name);
    ArrayList <Employee> searchBySalaryRange(int low,int high);
}
