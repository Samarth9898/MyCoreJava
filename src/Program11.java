import java.util.Scanner;

/*Write a do-while loop that asks the user to enter two numbers. The numbers
should be added and the sum displayed. The loop should ask the user whether
he or she wishes to perform the operation again. If so, the loop should repeat;
otherwise it should terminate.*/
public class Program11 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("1-----Repeat again");
			System.out.println("2-----Exit");
			System.out.println("Enter Choice:");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				int sum=0;
				System.out.println("Enter 1st Number");
				int a=sc.nextInt();
				System.out.println("Enter 2nd Number");
				int b=sc.nextInt();
				sum=a+b;
				System.out.println("Sum"+sum);
				break;
				
			case 2:
				break;
				
			}
		}while(true);


	}

}
