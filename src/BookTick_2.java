import java.util.Scanner;

public class BookTick_2 
{
	static int count=0;
	BookTick_2()
	{
		Scanner sc = new Scanner(System.in);
		if(count==0) 
		{
			
			System.out.println("Enter user");
			String user1=sc.next();
			verifyUser(user1);
			count++;
			
		}
		else
		{
			System.out.println("Sorry can't book more then 7 tickets");
		}
		
	}
	
	static void verifyUser(String user1)
	{
		String exisUser[] = {"123","456"};
		System.out.println(user1);
		for(int i=0;i<exisUser.length;i++)
		{
			if(exisUser[i].equals(user1)==true)
			{
				System.out.println("user found");
				bookTickets();
			}
			else
			{
				System.out.println("User not found");
			}
		}
	}

	public static void bookTickets()
	{
		
	}
	public static void main(String[] args)
	{
		
		BookTick_2 book = new BookTick_2();
	}

}
