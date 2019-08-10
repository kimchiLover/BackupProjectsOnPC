package question3;

import java.util.*;

class Q3alt {

    public static void main(String args[]) {

        HashSet <Employee> Emp = new HashSet <Employee>();

        System.out.println("|------------------------|");
        System.out.println("|Employee Menu           |");
        System.out.println("|------------------------|");
        System.out.println("|1.Add                   |");
        System.out.println("|2.Remove                |");
        System.out.println("|3.Search by Name        |");
        System.out.println("|4.Search by Salary Range|");
        System.out.println("|5.Exit                  |");
        System.out.println("|------------------------|");

        while(true) {

            Scanner s = new Scanner(System.in);
            String choice=s.next();

            if (choice.equals("add")) {

                int a    = s.nextInt();
                String b = s.next();
                long c   = s.nextLong();

                if( Emp.add(new Employee(a, b, c)) )
                    System.out.println("Employee created.");
                else
                    System.out.println("Employee with same id already exists.");

            }
            else if (choice.equals("remove")) {

                int sid=s.nextInt();
                int flag=0;
                Iterator it = Emp.iterator();

                while(it.hasNext()) {

                    Employee d = (Employee)it.next();

                    if(d.getEmpId() == sid ) {

                        Emp.remove(d);
                        flag=1;
                        break;
                    }
                }

                if(flag == 1)
                    System.out.println("Employee removed.");
                else
                    System.out.println("Employee not found.");
            }

            else if (choice.equals("get")) {

                int flag = 0;

                if(s.hasNextInt()) {

                    int sl=s.nextInt();
                    int su=s.nextInt();

                    Iterator it = Emp.iterator();

                    while (it.hasNext()) {

                        Employee d = (Employee) it.next();
                        long sal =d.getEmpSalary();

                        if (sal>=sl && sal<=su) {
                            d.displayEmp();
                            flag = 1;
                        }
                    }

                }

                else {

                    String ename = s.next();
                    Iterator it = Emp.iterator();

                    while (it.hasNext()) {

                        Employee d = (Employee) it.next();

                        if (d.getEmpName().equals(ename)) {

                            d.displayEmp();
                            flag = 1;
                        }
                    }

                }

                if(flag == 0)
                    System.out.println("Employee not found.");

            }

            else {

                break;
            }
        }
    }
}
