import java.util.Scanner;

public class Fiboo
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int a=0 , b=1 , c;
		System.out.println("Enter the num:");
		int n = sc.nextInt();
		System.out.print(a+","+b+",");
		for(int i=0;i<n;i++)
		{
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
			
		}
		
	}

}
