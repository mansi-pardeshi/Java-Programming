import java.util.Scanner;

abstract class EmployeeInheritance
{
	private String name;
	private int id;
	protected static double salary;
	protected static String company;
	Address adr;
	
	static
	{
		salary = 20000;
		company = "Accenture";
	}
	
	EmployeeInheritance(String name , int id , Address adr)
	{
		this.name = name;
		this.id = id;
		this.adr = adr;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	
	void setId(int id)
	{
		if(id<=0)
		{
			System.out.println("Invalid ID");
		}
		else
		{
			this.id = id;
		}
	}
	
	String getName()
	{
		return this.name;
	}
	
	int getId()
	{
		return this.id;
	}
	
	void display()
	{
		System.out.println("Company Name : "+company);
		System.out.println("Basic Salary : "+salary);
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Address :"+this.adr.getLane()+","+this.adr.getStreet()+","+this.adr.getCity()+","+this.adr.getState()+","+this.adr.getCountry());
	}
}

class ManagerInheritance extends EmployeeInheritance
{
	private float bonus;
	
	ManagerInheritance(String name , int id ,Address adr , float bonus)
	{
		super(name , id , adr);
		this.bonus = bonus;
	}
	
	void setBonus(float bonus)
	{
		this.bonus = bonus;
	}
	float getBonus()
	{
		return this.bonus;
	}
	double income()
	{
		return this.salary+this.bonus;
	}
	
	void display()
	{
		super.display();
		System.out.println("Bonus : "+bonus);
		System.out.println("Total Income : "+income());
	}
}

class DeveloperInheritance extends EmployeeInheritance
{
	private float increment;
	
	DeveloperInheritance(String name , int id ,Address adr , float increment)
	{
		super(name , id ,adr);
		this.increment = increment;
	}
	void setIncrement(float increment)
	{
		this.increment = increment;
	}
	float getIncrement()
	{
		return this.increment;
	}
	double income()
	{
		return this.salary+this.increment;
	}
	
	void display()
	{
		super.display();
		System.out.println("Increment : "+increment);
		System.out.println("Total Income : "+income());
	}
}

class TesterInheritance extends EmployeeInheritance
{
	TesterInheritance(String name , int id , Address adr)
	{
		super(name , id , adr);
	}
	
	double income()
	{
		return this.salary;
	}
	
	void display()
	{
		super.display();
		System.out.println("Total Income : "+income());
	}
}

class SalesmanInheritance extends EmployeeInheritance
{
	private float insentive;
	
	SalesmanInheritance(String name , int id , Address adr , float insentive)
	{
		super(name , id , adr);
		this.insentive = insentive;
	}
	void setInsentive(float insentive)
	{
		this.insentive = insentive;
	}
	float getInsentive()
	{
		return this.insentive;
	}
	
	double income()
	{
		return this.salary+this.insentive;
	}
	
	void display()
	{
		super.display();
		System.out.println("Insentive : "+insentive);
		System.out.println("Total Income : "+income());
	}
	
}

class Address
{
	 private int lane_no;
	 private String street_name;
	 private String city_name;
	 private String state_name;
	 private static String country_name;
	
	static
	{
		country_name = "India";
	}
	
	Address(int lane_no , String street_name , String city_name , String state_name)
	{
		this.lane_no = lane_no;
		this.street_name = street_name;
		this.city_name = city_name;
		this.state_name = state_name;
	}
	
	void setLane(int lane_no)
	{
		this.lane_no = lane_no;
	}
	
	void setStreet(String street_name)
	{
		this.street_name = street_name;
	}
	
	void setCity(String city_name)
	{
		this.city_name = city_name;
	}
	
	void setState(String state_name)
	{
		this.state_name = state_name;
	}
	
	int getLane()
	{
		return this.lane_no;
	}
	
	String getStreet()
	{
		return this.street_name;
	}
	
	String getCity()
	{
		return this.city_name;
	}
	
	String getState()
	{
		return this.state_name;
	}
	
	String getCountry()
	{
		return country_name;
	}
}

final class EmployeeInheritanceMain
{
	public static void main(String args[])
	{
		Address sadr = new Address(12 , "M.G.Road" ," Pune" , "Maharashtra");
		Address madr = new Address(76 , "Main Road" ,"Jaipur" , "Rajasthan");
		Address dadr = new Address(13 , "Atal Road" ," Banglore" , "Karnataka");
		Address tadr = new Address(56 , "Nagar Road" ,"Surat" , "Gujrat");
		
		SalesmanInheritance si = new SalesmanInheritance("Harshada" , 34 , sadr ,1000);
		ManagerInheritance mi = new ManagerInheritance("Mansi" , 34 , madr,10000);
		DeveloperInheritance di = new DeveloperInheritance("Shreya" , 67 ,dadr , 5000);
		TesterInheritance ti = new TesterInheritance("Vaishnavi" , 56 , tadr);
		
		System.out.println(" ");
		
		System.out.println("-----Manager Details-----");
		mi.display();
		System.out.println(" ");
		
		System.out.println("-----Developer Details-----");
		di.display();
		System.out.println(" ");
		
		System.out.println("-----Tester Details-----");
		ti.display();
		System.out.println(" ");
		
		System.out.println("-----Salesman Details-----");
		si.display();
	}
}