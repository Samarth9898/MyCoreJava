import java.util.Scanner;

public class Test_02 
{
	String firstName;
	String lastName;
	int phoneNumber;
	
	public static void addNewCon()
	{
		System.out.println("");
	}
	public static void editCon() {}
	public static void searchCon() {}
	public static void RemoveCon() {}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1 Add new Contact\r\n" + 
				"2 Edit Contact\r\n" + 
				"3 Search Contact \r\n" + 
				"4 Remove Contact \r\n" + 
				"5 Exit From App ");
		System.out.println();
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			
		}
		

	}

}
