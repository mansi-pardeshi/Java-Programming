interface Sim
{
	void call();
	void sms();
}

class Mobile
{
	void insertSim(Sim s)
	{
		s.call();
		s.sms();
	}
}

class Jio implements Sim
{
	public void call()
	{
		System.out.println("Jio Calling...");
	}
	public void sms()
	{
		System.out.println("Jio SMS...");
	}
}

class Airtel implements Sim
{
	public void call()
	{
		System.out.println("Airtel Calling...");
	}
	public void sms()
	{
		System.out.println("Airtel SMS...");
	}
}

class Idea implements Sim
{
	public void call()
	{
		System.out.println("Idea Calling...");
	}
	public void sms()
	{
		System.out.println("Idea SMS...");
	}
}

class MobileUser
{
	public static void main(String args[])
	{
		Mobile mi = new Mobile();
		mi.insertSim(new Jio());
		//mi.insertSim(new Airtel());
		//mi.insertSim(new Idea());
	}
}

