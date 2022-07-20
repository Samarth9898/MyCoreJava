/*Find common Numbers from 2 one dimension arrays.
		Array1:  1  2  3  4   5  6  7  
		Array2:  2  9  5  10 15  7  80
		Output : 2 5  7 
*/
public class ArrayLogic_2 {

	public static void main(String[] args) {
		
		int flag=0;
		String a1[] = {"1","2","3","4","5","6","7"};
		String a2[] = {"2","9","5","10","15","7","80"};
		String temp[] = {"0","0","0","0","0","0","0"};
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					temp[i]=a1[i];
					flag=1;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("Elements Found.....");
			for(int i=0;i<temp.length;i++)
			{
				if(temp[i].equals("0")==false)
				{
					System.out.print(temp[i]+" ,");
				}
			}
		}
		else
		{
			System.out.println("Element not found...");
		}
	}

}
