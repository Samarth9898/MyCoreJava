import java.util.Scanner;

public class Program1 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		//1
		/*
		 * System.out.println("Enter first number"); int n1= sc.nextInt();
		 * System.out.println("Enter second number"); int n2= sc.nextInt();
		 * 
		 * if(n1>n2) { System.out.println("Number 1 is max:"+n1); } else if(n2>n1) {
		 * System.out.println("Number 2 is max:"+n2); } else {
		 * System.out.println("Both are euqual "); }
		 */
		
		//2
		
		/*
		 * System.out.println("Enter number 1:"); int a = sc.nextInt();
		 * System.out.println("Enter number 2:"); int b = sc.nextInt();
		 * System.out.println("Enter number 3:"); int c = sc.nextInt();
		 * 
		 * if(a>b) { if(a>c) { System.out.println("No1 is max:"+a); } else {
		 * System.out.println("No3 is max:"+c); } } else if(b>c) { if(b>a) {
		 * System.out.println("No2 is max:"+b); } else {
		 * System.out.println("No1 is max:"+a); } } else if(c>a) { if(c>b) {
		 * System.out.println("No3 is max:"+c); } else {
		 * System.out.println("No2 is max:"+b); } }
		 */

		
		//3
		
		/*
		 * System.out.println("Enter the No:"); int a= sc.nextInt(); if(a>0) {
		 * System.out.println("The no is Positive"); } else if(a<0) {
		 * System.out.println("The number is Negative"); } else {
		 * System.out.println("The number is Zero"); }
		 */
		
		//4
		/*
		 * System.out.println("Enter no1:"); int a=sc.nextInt();
		 * 
		 * if(a%5==0) { System.out.println("Divisible by 5"); } else {
		 * System.out.println("Not divisible by 5"); }
		 */
		
		//5
		/*
		 * System.out.println("Enter no1:"); int a=sc.nextInt();
		 * 
		 * if(a%3==0 & a%11==0) { System.out.println("No is divisible by 3 and 11"); }
		 * else { System.out.println("No is not divisble by 3 and 11"); }
		 */
		
		//6
		/*
		 * System.out.println("Enter no1:"); int a=sc.nextInt();
		 * 
		 * if(a%2==0) { System.out.println("No is even"); } else {
		 * System.out.println("No is Odd"); }
		 */
		
		//7
		/*
		 * System.out.println("Enter year:"); int a=sc.nextInt();
		 * 
		 * if(((a%4==0) && (a%100!=0)) || (a%400==0)) {
		 * System.out.println("It is leap year"); } else {
		 * System.out.println("Not a leap year"); }
		 */
		 
		
		//8
		/*
		 * System.out.println("Enter Char:"); char n1=sc.next().charAt(0);
		 * 
		 * if((n1>='a' && n1<='z') || (n1>='A' && n1<='Z')) {
		 * System.out.println("It Char"); } else { System.out.println("Not a char"); }
		 */
		
		//9
		/*
		 * System.out.println("Enter the Char:"); char n1= sc.next().charAt(0); int
		 * asciiVal = (int)n1;
		 * 
		 * // Check whether String contains special character or not if ((asciiVal >= 32
		 * && asciiVal <= 47) || (asciiVal >= 58 && asciiVal <= 64) || (asciiVal >= 91
		 * && asciiVal <= 96) || (asciiVal >= 123 && asciiVal <= 126)) {
		 * System.out.println("It is a special Char"); } else if((n1>='a' && n1<='z') ||
		 * (n1>='A' && n1<='Z')) { System.out.println("It is a Char"); } else {
		 * System.out.println("It is a number"); }
		 */
	
		//10
		
		/*
		 * System.out.println("Enter week day:"); int a=sc.nextInt();
		 * 
		 * if(a==1) { System.out.println("Monday"); } else if(a==2) {
		 * System.out.println("Tuesday"); } else if(a==3) { System.out.println("Wed"); }
		 * else if(a==4) { System.out.println("Thur"); } else if(a==5) {
		 * System.out.println("Fri"); } else if(a==6) { System.out.println("Sat"); }
		 * else if(a==7) { System.out.println("Sun"); } else {
		 * System.out.println("Invalid input"); }
		 */
		
		//11
		
		/*
		 * int note100=0,note500=0,note10=0,note1=0,note50=0,note20=0,note5=0,note2=0;
		 * System.out.println("Enter total amount:"); int amount=sc.nextInt();
		 * 
		 * if(amount >= 500) { note500 = amount/500; amount -= note500 * 500; }
		 * if(amount >= 100) { note100 = amount/100; amount -= note100 * 100; }
		 * if(amount >= 50) { note50 = amount/50; amount -= note50 * 50; } if(amount >=
		 * 20) { note20 = amount/20; amount -= note20 * 20; } if(amount >= 10) { note10
		 * = amount/10; amount -= note10 * 10; } if(amount >= 5) { note5 = amount/5;
		 * amount -= note5 * 5; } if(amount >= 2) { note2 = amount /2; amount -= note2 *
		 * 2; } if(amount >= 1) { note1 = amount; }
		 * 
		 * System.out.println(" Not 500 :" +note500); System.out.println(" Not 100 :"
		 * +note100); System.out.println(" Not 50  :" +note50);
		 * System.out.println(" Not 20  :" +note20); System.out.println(" Not 10  :"
		 * +note10); System.out.println(" Not 5   :" +note5);
		 * System.out.println(" Not 2   :" +note2); System.out.println(" Not 1   :"
		 * +note1);
		 */
		
		
		//12
		
		  int a,b,c;
		  
		  System.out.println("Enter x2 co-efficient:"); a=sc.nextInt();
		  System.out.println("Enter x1 co-efficient:"); b=sc.nextInt();
		  System.out.println("Enter x0 co-efficient:"); c=sc.nextInt(); int d=
		  b*b-(4*a*c); int sqrd = (int) Math.sqrt(d); if(d>0) { int alpha,beta;
		  alpha=(-b+sqrd)/2*a; beta=(-b-sqrd)/2*a; System.out.println("Alpa: "+alpha);
		  System.out.println("Beta: "+beta); } else {
		  System.out.println("Roots are negative"); }
		 

		//13
		/*
		 * System.out.println("Enter Cost Price:"); int cp=sc.nextInt();
		 * 
		 * System.out.println("Enter Selling Price:"); int sp=sc.nextInt();
		 * 
		 * if(sp-cp>0) { System.out.println("Profit");
		 * 
		 * } else if(cp-sp>0) { System.out.println("Loss"); } else if(sp==cp) {
		 * System.out.println("No profit no loss"); }
		 */
		
	}

}
