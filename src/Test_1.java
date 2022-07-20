import java.util.Scanner;

public class Test_1
{
	private String firstName;
	private String lastName;
	private String gender;
	private int salary;
	
	public int getSalary()
	{
		
		return salary;
	}


	public void setSalary(int salary)
	{
		this.salary = salary;
		int max=0;
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() 
	{
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	

	public String toString()
	{
		String print = "User: [firstName = " + getFirstName() + ", lastName = " + getLastName() + ", Gender = " + getGender() + ", Salary = " + getSalary()+"]";
		return print;
		
	}
	public static void main(String[] args) 
	{
		
		Test_1 a = new Test_1();
		Test_1 b = new Test_1();
		Test_1 c = new Test_1();
		
	
		a.setFirstName("Samarth");
		a.setLastName("Ladani");
		a.setGender("Male");
		System.out.println(a.toString());
		
		b.setFirstName("Ram");
		b.setLastName("Patel");
		b.setGender("Male");
		b.setSalary(1000);
		System.out.println(b.toString());
		
		c.setFirstName("Sita");
		c.setLastName("Shah");
		c.setGender("Female");
		c.setSalary(2000);
		System.out.println(c.toString());
		
		
		if(b.getSalary()>c.getSalary())
		{
			System.out.println("Max sal:"+b.getSalary());
		}
		else if(b.getSalary()<c.getSalary())
		{
			System.out.println("Max sal:"+c.getSalary());
		}
		
		

	}

}
