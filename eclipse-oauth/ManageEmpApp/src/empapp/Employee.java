package empapp;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private int salary;

    Employee(int eid,String ename,int sly) {
        this.id = eid;
        this.name = ename;
        this.salary = sly;
     }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return this.id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);

    }
}