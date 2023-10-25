package Practice;
 class T 
{
	public void m1()
	{
		System.out.println("nadia tela");
	}
	}
class B extends T
{
	public void m2()
	{
		System.out.println("kiye neigala");
	}
	}
public class A
{
	public static void main(String args[])
	{
		B b=new B();
		b.m2();
		T t=new T();
		t.m1();
	}
}
	
