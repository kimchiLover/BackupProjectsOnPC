package empapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchBySalaryRangeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
   {	
		int slow=Integer.parseInt(req.getParameter("name1"));
		int shigh=Integer.parseInt(req.getParameter("name2"));
   	 
   	 EmployeeService employeeService = EmployeeServiceImpl.getInstance();

   	 PrintWriter out = res.getWriter();
   	 
   	ArrayList <Employee> f= employeeService.searchBySalaryRange(slow,shigh);
   	 
   	if(f.equals(null)) 
   		out.println("Employee not found.");
   	 else
   	 {
   		out.println("Employee found.");
   		out.println("");
   		
   		Iterator it = f.iterator();
   		
   		while(it.hasNext())
   		{
   	       Employee e = (Employee)it.next();
   		   out.println("Employee ID     :"+e.getId());
   	       out.println("Employee Name   :"+e.getName());
   	       out.println("Employee Salary :"+e.getSalary());
   	       out.println("");
   		}  
   	 }
   }

}
