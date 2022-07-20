/*The total number of students in a class are 90 out of which 45 are boys. If 50%
of the total students secured grade 'A' out of which 20 are boys, then write a
program to calculate the total number of girls getting grade 'A'.
*/
public class Program7
{
	public static void main(String args[])
	{
		int girls = (50*90)/100 - 20;
		System.out.println(girls);
	}
	
}
