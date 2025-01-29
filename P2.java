import java.util.*;

class Employee
{
	String name;
	int empId;
	String department;
	int age;
	String designation;

	// Constructor to initialize employee details
	public Employee(String name, int empId, String department, int age, String designation) {
	    this.name = name;
	    this.empId = empId;
	    this.department = department;
	    this.age = age;
	    this.designation = designation;
	}

	public void display() {
	    System.out.println("Employee ID: " + empId);
	    System.out.println("Name: " + name);
	    System.out.println("Department: " + department);
	    System.out.println("Age: " + age);
	    System.out.println("Designation: " + designation);
	    System.out.println("------------------------------------");
	} 

}

class EmployeeDB
{
	Employee[] edb = new Employee[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter employee " + (i + 1) + " details");

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();

            System.out.print("Enter Department (sales/purchase): ");
            String department = sc.next().toLowerCase();

            System.out.print("Enter Age: ");
                        int age = sc.nextInt();

            System.out.print("Enter Designation: ");
            String designation = sc.next();

            edb[i] = new Employee(name, empId, department, age, designation);
		}

	}

	for(Employee e:edb)
	{
		int sumsales = 0;
		if(e.department.equals("sales"))
		{
			sumsales+=e.sales;
		}

		if(e.dept.equals("Purchase") && e.desgn.equals("Manager")){
		    if(e.sal > highSal)
		    {
		        highSal = e.sal;
		        highSalName = e.name;
		    }
		}

	}


}
