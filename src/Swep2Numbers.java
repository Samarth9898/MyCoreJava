import java.util.Scanner;

public class Swep2Numbers
{
	public static void main(String ages[])
	{
		
		Scanner sc = new Scanner(System.in);
		//int a,b;
		System.out.println("Enter num a:");
		int a=sc.nextInt();
		System.out.println("Enter num b:");
		int b=sc.nextInt();
		System.out.println("Before swapping a:"+a);
		System.out.println("Before swapping b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a:"+a);
		System.out.println("After swapping b:"+b);

		
	}
}
