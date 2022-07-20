import java.util.Scanner;

public class PrimeNumSum {

	public static void main(String args[])
	   {
	      int n;
	      int flag,no,prime=1;
	      
	      
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the value of n:");
	      int sum=0;
	      //The entered value is stored in the var n
	      for(int i=2 ; prime<=100;i++)
	      {
	    	 
	    	  flag=0;
	    	  for(int j=2;j<i;j++)
	    	  {
	    		  if(i%j==0)
	    		  {
	    			  flag=1;
	    			  break;
	    		  }
	    	  }
	    	  if(flag==0)
	    	  {
	    		  
	    		  sum=sum+i;
	    		  prime++;
	    	  }
	      }	 
	      System.out.println(sum);
	      }
	      
	
}
