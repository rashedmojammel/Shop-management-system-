package Classes;


public class EmployeeC
{
	private String employeeId;
	private String employeeName;
	private String salary;

	public EmployeeC()
	{
		
	}

	public EmployeeC(String name,String empid,String salary)
	{
	this.employeeName = name;
	this.employeeId = employeeId;
	this.salary = salary;	
	}
	
	public String getemployeeId(){return employeeId;} 
	public String getEmployeeName(){return employeeName;}
	public String getSalary(){return salary;} 
}