import java.util.Scanner;

public class IndecOfArray
{
	
	public static void main()
	{
	Scanner sc= new Scanner(System.in);
	int arr[] = {1,2,3,4,5,6,7,8,9,10},flag=0;
	System.out.println("Enter num to search");
	int x = sc.nextInt(); 
	int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==x)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("Element found:"+x);
			}
			else
			{
				System.out.println("Element not found");
			}
			
	}
}
