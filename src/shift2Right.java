import java.util.Scanner;

public class shift2Right {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ar1[] = {1,2,3,4,5};
		System.out.println("Enter element to Shift");
		int temp=0;
		temp=ar1[ar1.length-1];
		System.out.println("Before Shifting");
		for(int i=0;i<ar1.length;i++)
		{
				System.out.print(" "+ar1[i]);
		}
		
		for(int i=ar1.length-1;i>0;i--)
		{
				ar1[i]=ar1[i-1];
		}
		ar1[0]=temp;
		for(int i=0;i<ar1.length;i++)
		{
				System.out.print(" "+ar1[i]);
		}
		

	}

}
