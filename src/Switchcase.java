import java.util.Scanner;

public class Switchcase
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int ans=0;
		System.out.println("Enter number 1");
		int a= sc.nextInt();
		
		System.out.println("Enter number 2");
		int b= sc.nextInt();
		
		System.out.println("1-------Addition");
		System.out.println("2-------Substraction");
		System.out.println("3-------Multiply");
		System.out.println("4-------Division");
		int choice= sc.nextInt();
		switch(choice)
		{
			case 1:
				ans=a+b;
				System.out.println("Add:"+ans);
				break;
			case 2:
				ans=a-b;
				System.out.println("Sub:"+ans);
				break;
			case 3:
				ans=a*b;
				System.out.println("Mul:"+ans);
				break;
			case 4:
				ans=a/b;
				System.out.println("Divide:"+ans);
				break;
				
			default:
				System.out.println("Invalid Input");
		}

	}

}
