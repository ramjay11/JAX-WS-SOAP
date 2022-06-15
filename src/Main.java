import employeemanagement.services.Employee;
import employeemanagement.services.EmployeeServiceImpl;
import employeemanagement.services.EmployeeServiceImplService;

public class Main {
	//The objective of this class is to call the webservice
	public static void main(String[] args) {
		//call the web service
		//URL of the WSDL: http://localhost:8082/any/name/you/like/employeeservice.
		//This tool will generate some java classes that represent that webservice
		//It will look into WSDL and for example there's an operation supported called
		//getEmployeeById(), and it will generate a Java method called of the same name.
		//The tool is WSImport: Run this tool from your project directory
		//wsimport -keep -verbose -s ./src/ -d ./bin/ <WSDL URL>
		//The return type of this of this object is EmployeeServiceImpl
		EmployeeServiceImpl webService = new 
				EmployeeServiceImplService().getEmployeeServiceImplPort();
		//What will happen when we call the webService object is it's going to do a 
		//network call and accessing the server, it will also convert the data that we
		//got from getEmployeeByID("1") into xml message, and when the server responds
		//and returns an xml message back, it will convert it back to the plain Java 
		//class called Employee.
		Employee employee = webService.getEmployeeByID("1");
		System.out.println(employee.getName());
	}
}
