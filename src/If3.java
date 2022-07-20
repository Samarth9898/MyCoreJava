import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Age:");
		int a= sc.nextInt();
		if(a>18)
		{
			System.out.println("Eligible for voting");
		}
		else if(a<18)
		{
			System.out.println("Not Eligible for voting");
		}
		else if(a<0)
		{
			System.out.println("Error");
		}
	}

}
