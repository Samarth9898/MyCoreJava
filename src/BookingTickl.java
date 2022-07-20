import java.util.Scanner;

public class BookingTickl
{
	static final int silver = 100;
	static final int gold = 150;
	static final int diamond = 200;
	static int flag = 0;
	static int sil = 20;
	static int gol = 20;
	static int dia = 20;
	static int silBooked = 0;
	static int golBooked = 0;
	static int diaBooked = 0;
	static String exisUser[]= {"0","0","0"};
	static int exisCounter = 0;
	static void enterUser()
	{
		
		while(flag==1)
		{
		System.out.println("<*><*><*><*><*><*><*><*><*><*><*>");
		System.out.println("<*><*><*><*>1).Login<*><*><*><*>");
		System.out.println("<*><*><*><*>2).Exit<*><*><*><*>");
		System.out.println("<*><*><*><*><*><*><*><*><*><*><*>");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1)
		{
			System.out.println("<*><*><*><*><*><*><*><*><*><*><*>");
			System.out.println("Enter user phone number:");
			String a = sc.next();
			verifyUser(a);
		}
		else
		{
			System.out.println("<*><*><*><*><*><*><*><*><*><*><*>");
			System.out.println("<*><*><*>Try Again<*><*><*><*><*>");
			System.out.println("<*><*><*><*><*><*><*><*><*><*><*>");
		}
		}
		
	}
	static void verifyUser(String a)
	{
		
		String user[] = {"123","456","789"};
		for(int i=0;i<user.length;i++)
		{
			if(user.equals(a))
			{
				if(exisCounter!=0)
				{
					
				}
				else
				{
						
				}
				flag=1;
				break;
				
			}
			
		}
		if(flag==1)
		{
			System.out.println("User Found");
		}
		
	}
	
	static void viewAvialableTickets()
	{
		System.out.println("Avialabe tickets are");
		System.out.println("---------------------");
		System.out.println("Silver-----------"+sil);
		System.out.println("Gold-------------"+gol);
		System.out.println("Diamond----------"+dia);
		
	}
	
	static void viewBookedTickets()
	{
		System.out.println("Booked tickets are");
		System.out.println("---------------------");
		System.out.println("Silver-----------"+silBooked);
		System.out.println("Gold-------------"+golBooked);
		System.out.println("Diamond----------"+diaBooked);
		
	}

	public static void main(String[] args) 
	{
		

	}

}
