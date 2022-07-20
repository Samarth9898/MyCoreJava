
class A
{
	void show()
	{
			System.out.println("Class A");
	}
}
interface B
{
	abstract public void show();
}
public class C extends A implements B 
{
	public void show()
	{
		super.show();
		System.out.println("Class B");
	
	}
	public static void main(String[] args)
	{
		C aa = new C();
		aa.show();
		C bb =  (C) new A();
		bb.show();
	}
}
