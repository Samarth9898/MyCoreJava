
public class oddevenArray
{
	public static void main(String args[])
	{
		int arr[] = {2,3,4,5,6,7,8,9,10},sum1=0,sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				sum1=sum1+arr[i];
				
			}
			else if(arr[i]%2==0)
			{
				sum2=sum2+arr[i];
			}
		}
		System.out.println("Even:"+sum2);
		System.out.println("Odd:"+sum1);
	}

}
