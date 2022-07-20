import java.util.Scanner;

public class CommonBet2Arr 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9,10},flag=0;
		int arr2[] = {11,22,33,44,5,6,7,8,9,10};
		System.out.println("Enter num to search");
		int x = sc.nextInt(); 
		int sum=0;
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr2.length;j++)
					{
						if(arr[i]==arr2[j])
						{
							flag=1;
							break;
						}	
					}
				}
				if(flag==1)
				{
					System.out.println("Element found:");
				}
				else
				{
					System.out.println("Element not found");
				}
				

	}

}
