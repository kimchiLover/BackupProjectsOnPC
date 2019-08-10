package empapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddEmployeeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public static boolean isAlpha(String s) {
		
		if( s!= "" && s != null && s.matches("^[a-zA-Z]*$") )
		return true;
		
		return false;
	}
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {	
		
	 String a = req.getParameter("id");
	 String b = req.getParameter("name");
	 String c = req.getParameter("salary");
	
	 PrintWriter out = res.getWriter();
	 
		String empname=b;
		int empid=0;
		int salary=0;
		if(isAlpha(empname))
	{		
		try {
		
		empid=Integer.parseInt(a);
   	    salary=Integer.parseInt(c);
		
   	    EmployeeService employeeService = EmployeeServiceImpl.getInstance();
   	 
        if(employeeService.add(new Employee(empid,empname,salary)))
        out.println("Employee Created.");
   	    else
   	    out.println("Employee already exists."); 
        
		}catch(Exception e) {
			out.println("Invalid Details.");
		}
	}
		else
		out.println("Invalid Employee Name");
		
  }

}
