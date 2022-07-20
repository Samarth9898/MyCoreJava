import java.util.Scanner;

public class If1
{

	public static void main (String[] args)throws Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    int plyer1[] = new int[size];
	    int plyer2[] = new int[size];
	    int temp1[] = new int[size];
	    int max1[] = new int[size];
	    int max2[] = new int[size];
	    int temp3[] = new int[size];
	    for(int i=0;i<size;i++)
	    {
	        plyer1[i]=sc.nextInt();
	        plyer2[i]=sc.nextInt();
	    }
	    
	     for(int i=0;i<size;i++)
	    {
	       if(plyer1[i]>plyer2[i])
	       {
	    	   temp1[i] = plyer1[i]-plyer2[i];
	    	   temp3[i]=1;
	    	  
	    	   	    		   max1[i]=temp1[i];
	    	   
	       }
	       if(plyer1[i]<plyer2[i])
	       {
	    	   
	    	   temp1[i] = plyer2[i]-plyer1[i];
	    	   temp3[i]=2;
	    	    max1[i]=temp1[i];
	    	   
	       }
	    }
	     
		int max = 0;
		for (int i = 0; i < size; i++) {
			if (max < max1[i]) {
				max = max1[i];
				
				break;
			}
		}
	
		 
	   
	    	System.out.println(temp3[0]+" "+max);
	    	
	   
	}

}
