class Thread1 extends Thread
{
	int n;
	Thread1(int n)
	{
		this.n = n;
	}
	
	public void run()
	{
		int sum = 100;
		for(int i=0 ; i<=this.n ; i++)
		{
			sum= sum + i;
			System.out.println("sum : "+sum);
		}
		
	}
}

class Thread2 extends Thread
{
	int n;
	Thread2(int n)
	{
		this.n = n;
	}
	
	public void run()
	{
		int sub = 100;
		for(int i=this.n ; i>=0 ; i--)
		{
			sub = sub - i;
            System.out.println("substraction : "+sub);
		}
		
	}
}

class Main
{
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1(10);
		t1.start();
		
		Thread2 t2 = new Thread2(10);
		t2.start();
	}
}