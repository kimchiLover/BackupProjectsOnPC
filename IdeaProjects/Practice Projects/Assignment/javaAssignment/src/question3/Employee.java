package question3;

class Employee {

        private int empId;
        private String empName;
        private long empSalary;

        Employee(int eid,String ename,long sly) {
           this.empId = eid;
           this.empName = ename;
           this.empSalary = sly;
        }

        int getEmpId() {
            return this.empId;
        }

        String getEmpName() {
            return this.empName;
        }

        long getEmpSalary() {
            return this.empSalary;
        }

        void displayEmp() {
            System.out.println("Emp Id : "+this.empId+"  "+"Emp Name : "+this.empName+"  "+"Emp Salary : "+this.empSalary);
        }

    @Override
    public int hashCode() {
        return empId;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;

        if ( !(empId == other.empId) )
            return false;

        return true;
    }

    public static void main(String args[]) {}
}