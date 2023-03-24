import java.util.Scanner;

class invalidAgeException extends Exception
{
	invalidAgeException()
	{
		super();
	}
	invalidAgeException(String msg)
	{
		super(msg);
	}
}

class Marriage
{
	public void check(int m , int n) throws invalidAgeException
	{
		if(m > 21 && n > 21)
		{
			System.out.println("Both can marry...");
		}
		else if(m < 21 && n > 21)
		{
			throw new invalidAgeException("It's too early for boy...");
		}
		else if(m > 21 && n < 21)
		{
			throw new invalidAgeException("It's too early for girl...");
		}
		else if(m > 60 && n > 21)
		{
			throw new invalidAgeException("It's too late for boy...");
		}
		else if(m > 21 && n > 60)
		{
			throw new invalidAgeException("It's too late for girl...");
		}
	}
	
}

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Boy's Age :");
		int m = sc.nextInt();
		
		System.out.println("Enter Girl's Age :");
		int w = sc.nextInt();
		
		Marriage mg = new Marriage();
		
		try
		{
			mg.check(m,w);
		}
		catch(invalidAgeException iae)
		{
			iae.printStackTrace();
		}
	}	
}