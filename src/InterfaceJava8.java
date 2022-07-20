interface MyInterface{
   public static void display() {
      System.out.println("Default method of the interface");
   }
}

interface MyInterface2 extends MyInterface{
	   public default void display() {
		  
	      System.out.println("Default method of the interface");
	   }
	}
public class InterfaceJava8 implements MyInterface,MyInterface2{

   public static void main(String args[]) {
    
      
   }
}