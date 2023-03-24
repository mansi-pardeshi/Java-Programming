/*abstract class Abstract
{
	int a;
	Abstract(int a)
	{
		this.a = a;
	}
	void fun()
	{
		System.out.println("In Abstract parent class fun function");
	}
}

class Child extends Abstract
{
	Child(int a)
	{
		super(a);
	}
	void gun()
	{
		System.out.println("A = "+a);
	}
}*/


interface Abstract
{
	void fun();
}
class Child implements Abstract
{
	public void fun()
	{
		System.out.println("in interface");
	}
}
class Main
{
	public static void main(String args[])
	{
		/*Child c = new Child(100);
		c.gun();
		c.fun();*/
		
		Child c = new Child();
		c.fun();
	}
}