import java.util.Scanner;

public class If2 {

	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x2 co-efficient:");
		a=sc.nextInt();
		System.out.println("Enter x1 co-efficient:");
		b=sc.nextInt();
		System.out.println("Enter x0 co-efficient:");
		c=sc.nextInt();
		int d= b*b-(4*a*c);
		int sqrd = (int) Math.sqrt(d);
		if(d>0)
		{
			int alpha,beta;
			alpha=(-b+sqrd)/2*a;
			beta=(-b-sqrd)/2*a;
			System.out.println("Alpa: "+alpha);
			System.out.println("Beta: "+beta);
		}
		else
		{
			System.out.println("Roots are negative");
		}
		

	}

}
