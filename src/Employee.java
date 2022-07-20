import java.util.Scanner;

public class Employee 
{

	public static void main(String[] args)
	{
		
		getData();
			
		
		
		

	}
	
	public static void getData()
	
	{
		Scanner sc =  new Scanner(System.in);
		String name;
		int sal,tax;
		System.out.println("Enter Emp Name:");
		name=sc.next();
		System.out.println("Enter Emp Sal:");
		sal=sc.nextInt();
		System.out.println("Enter Emp Tax:");
		tax=sc.nextInt();
		printData(name,sal,tax);
	}
	public  static void printData(String name, int sal, int tax)
	{
		
		System.out.println("Emp nam:"+name);
		System.out.println("Emp sal:"+sal);
		System.out.println("Emp tax:"+tax);
	}

}
