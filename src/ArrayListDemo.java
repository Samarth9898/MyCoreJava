import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo
{
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> list =  new ArrayList<>();
		while(true)
		{
		Person e = new Person();
		System.out.println("1). ADD");
		System.out.println("2). EDIT");
		System.out.println("3). LIST");
		System.out.println("4). REMOVE");
		System.out.println("5). EXIT");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:	
				System.out.println("Enter FirstName LastName and ContactNumber");
				
				e.setFname(sc.next());
				e.setLname(sc.next());
				e.setContact(sc.nextInt());
				list.add(e);
				break;
			
		case 2:
			try
			{
				System.out.println("Enter First name to edit");
				String fname = sc.next();
				
				for(int i=0;i<list.size();i++)
				{
					if(list.get(i).getFname().equals(fname))
					{
							System.out.println("Enter Firstname");
							list.get(i).setFname(sc.next());
							System.out.println("Editted Succesfully");
							break;
					}
				}
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			
				break;
				
		case 3:
			  System.out.println("PERSONS");
			  System.out.println(list.toString());			
			  break;
			                                                 
		case 4:
			System.out.println("Enter First name to remove");
			String fname = sc.next();
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getFname().equals(fname))
				{
						list.remove(i);
						System.out.println("Removed Succesfully");
						break;
				}
			}
			{
				System.out.println("Element not found....");
			}
			break;
			
		case 5:
			System.exit(0);
			break;
		}
		
		
	}}
}
class Person
{
	private int contact; 
	private String Fname;
	private String Lname;
	
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String toString()
	  {
		  return "\nFname:->" + Fname + "  Lname:->" + Lname + "  Contact:->" +contact; 
	  }

}
