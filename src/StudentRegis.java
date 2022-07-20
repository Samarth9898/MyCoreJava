
import java.awt.print.Book;
import java.util.Scanner;


public class StudentRegis 
{
	static final int silver = 100;
	static final int gold = 150;
	static final int diamond = 200;
	static int sil = 20;
	static int gol = 20;
	static int dia = 20;
	static int silBooked = 0;
	static int golBooked = 0;
	static int diaBooked = 0;
	
	

	

	
	static void bookTicket()
	{
		  
		System.out.println(sil);
		Scanner sc= new Scanner(System.in);
		System.out.println("------------------");
		System.out.println("---Logged In--------");
		System.out.println("-----------------");
		System.out.println("1----Silver--100/-");
		System.out.println("2----Gold----150/-");
		System.out.println("3----Diamond-200/-");
		System.out.println("-----------------");
		System.out.println("Enter choice");
		int a = sc.nextInt();
		switch(a)
		{
			case 1:
				if(sil>0)
				{
					System.out.println("You have selected silver");
					System.out.println("Enter the total tickets you want to buy");
					int b = sc.nextInt();
					int flag=0;
					while(flag==0)
					{
						if(b<=7 && b >0 )
						{
							sil = sil-b;
							silBooked=silBooked+b;
							//b=b*silver;
							
							
							flag=-1;
							break;
						}
						else if(b<0)
						{
							System.out.println("Please enter valid ticket number");
							flag=1;
							break;
						}
						else
						{
							System.out.println("Invalid Input");
							flag=1;
							break;
						}
					}
					
				}
				else
				{
					System.out.println("Sorry all Silver Tickets is sold out");
				}
				
				break;
				
			case 2:
				System.out.println("You have selected Gold");
				System.out.println("Enter the total tickets you want to buy");
				int b = sc.nextInt();
				int temp=0;
				temp=b;
				if(gol>0)
				{
					
					int flag=0;
					while(flag==0)
					{
						if(b<=7 && b >0 )
						{
							gol=gol-b;
							golBooked=golBooked+b;
							b=b*gold;
							break;
						}
						else if(b<0)
						{
							System.out.println("Please enter valid ticket number");
							flag=1;
							break;
						}
						else
						{
							System.out.println("Invalid Input");
							flag=1;
							break;
						}
					}
					
				}
				else if(temp> 0)
				{
					System.out.println("Sorry user can select max 7 tickets");
				}
				else
				{
					System.out.println("Sorry Gold Tickets is sold out");
				}
				
				
				break;
			case 3:
				System.out.println("You have selected Diamond");
				System.out.println("Enter the total tickets you want to buy");
				int b1 = sc.nextInt();
				int temp1=0;
				temp1=b1;
				if(dia>0 && temp1<7)
				{
					
					int flag=0;
					
					while(flag==0)
					{
						if(b1<=7 && b1 >0 )
						{
							dia=dia-b1;
							diaBooked=diaBooked+b1;
							b1=b1*diamond;
							temp1++;
							break;
						}
						else if(b1<0)
						{
							System.out.println("Please enter valid ticket number");
							flag=1;
							break;
						}
						else
						{
							
							System.out.println("Invalid Input");
							flag=1;
							break;
						}
					}
					
				}
				else if(temp1> 0)
				{
					System.out.println("Sorry user can select max 7 tickets");
				}
				else
				{
					System.out.println("Sorry all Diamond Tickets is sold out");
				}
				break;
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
	public static void main(String[] args)throws Exception
	{
		Scanner sc = new Scanner(System.in); 
		int flag=0;
		System.out.println("1-------Login");
		  System.out.println("2-------Exit");
		  System.out.println("Enter choice");
		  int f = sc.nextInt();
		while(flag==0)
		{
			  flag=1;
			  if(f==1)
			  {
			  System.out.println("Enter User");
			  String name = sc.next();
			  String a[] = {"123","456"};
			  for(int i=0;i<a.length;i++)
			  {
			  		if(name.equals(a[i])==true)
			  		{
			  			int infi=1;
			  			while(infi==1)
			  			{
			  		  System.out.println("1-----------------Book Tickets");
			  		  System.out.println("2----------Show Avialabe Tickets");
			  		  System.out.println("3-----------Show Booked Tickets");
			  		  System.out.println("4------------LogOut");
			  		  System.out.println("Enter choice:");
			  		  int choice = sc.nextInt();
			  		  switch(choice)
			  		  {
			  		  		case 1:
			  		  			bookTicket();
			  		  			
			  		  			break;
			  		  			
			  		  		case 2:
			  		  			viewAvialableTickets();
			  		  			
			  		  			break;
			  		  			
			  		  		case 3:
			  		  			viewBookedTickets();
			  		  			break;
			  		  			
			  		  		case 4:
			  		  			System.exit(0);
			  		  			break;
			  		  }
			  			flag=0;
			  			break;
			  		}
			  			}
					  
			  }
		}
		int infi=0;
		
			
			
			
		  
		
		} 
		

	}

}
