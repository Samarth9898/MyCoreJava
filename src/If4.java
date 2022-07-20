import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a = sc.nextInt();
		System.out.println("Enter number 2:");
		int b = sc.nextInt();
		System.out.println("Enter number 3:");
		int c = sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("No1 is max:"+a);
			}
			else
			{
				System.out.println("No3 is max:"+c);
			}
		}
		else if(b>c)
		{
			if(b>a)
			{
				System.out.println("No2 is max:"+b);
			}
			else
			{
				System.out.println("No1 is max:"+a);
			}
		}
		else if(c>a)
		{
			if(c>b)
			{
				System.out.println("No3 is max:"+c);
			}
			else
			{
				System.out.println("No2 is max:"+b);
			}
		}

	}

}
