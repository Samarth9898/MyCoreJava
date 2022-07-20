import java.util.Scanner;

class InchToMeter 
{
	public static void main(String a[])
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter in Inch");
		int a1=sc.nextInt();
		double a2 = a1*.00254;
		System.out.println("Meter:"+a2);
		
	}

}
