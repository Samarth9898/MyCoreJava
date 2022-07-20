import java.util.Scanner;

public class ArrayOfObjects {
	public static void main(int args[]) {
//create an array of product object   
		//Product[] obj = new Product[2];
		Product Obj[] = {new Product(2005, 1), new Product(2006, 1)};
//create & initialize actual product objects using constructor  
		//obj[0] = new Product(23907, 0);
		//obj[1] = new Product(91240, 0);

//display the product object data  
		System.out.println("Product Object 1:");
		obj[0].display();
		System.out.println("Product Object 2:");
		obj[1].display();

	}
}

//Product class with product Id and product name as attributes  
class Product {
	int pro_Id;
	int pro_name;

//Product class constructor  
	Product(int pid, int n)
	{
		pro_Id = pid;
		pro_name = n;
	}

	
	public static void verifyUser()
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter");
		int choice = sc.nextInt();
		if(choice==1)
		{
			
		}
	}
	public void display()
	{
		System.out.print("Product Id = " + pro_Id + "  " + " Product Name = " + pro_name);
			}
}