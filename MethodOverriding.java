class Employee
{
	private String name;
	private int id;
	private int age;
	protected static double salary;
	
	static 
	{
		salary = 20000;
	}
	Employee(String name,int id,int age)
	{
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	void setId(int id)
	{
		this.id = id;
	}
	void setAge(int age)
	{
		this.age = age;
	}
	
	String getName()
	{
		return this.name;
	}
	int getId()
	{
		return this.id;
	}
	int getAge()
	{
		return this.age;
	}
	
	double calculateSalary()
	{
		return this.salary;
	}
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("ID : "+id);
		System.out.println("Basic salary : "+salary);
	}
}

class Manager extends Employee
{
	private double bonus;
	
	Manager(String name,int id,int age,double bonus)
	{
		super(name,id,age);
		this.bonus = bonus;
	}
	
	void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	double getBonus()
	{
		return this.bonus;
	}
	
	double calculateSalary()
	{
		return this.salary + this.bonus;
	} 
	
	void display()
	{
		System.out.println("------Manager Details-----");
		super.display();
		System.out.println("Bonus : "+bonus);
		System.out.println("Total salary : "+calculateSalary());
	}
}

class Salesman extends Employee
{
	private double insentive;
	
	Salesman(String name,int id,int age,double insentive)
	{
		super(name,id,age);
		this.insentive = insentive;
	}
	
	void setInsentive(double insentive)
	{
		this.insentive = insentive;
	}
	double getInsentive()
	{
		return this.insentive;
	}
	
	double calculateSalary()
	{
		return this.salary + this.insentive;
	} 
	
	void display()
	{
		System.out.println("------Salesman Details-----");
		super.display();
		System.out.println("Bonus : "+insentive);
		System.out.println("Total salary : "+calculateSalary());
	}
}

class Developer extends Employee
{
	private double increment;
	
	Developer(String name,int id,int age,double increment)
	{
		super(name,id,age);
		this.increment = increment;
	}
	
	void setIncrement(double increment)
	{
		this.increment = increment;
	}
	double getIncrement()
	{
		return this.increment;
	}
	
	double calculateSalary()
	{
		return this.salary + this.increment;
	} 
	
	void display()
	{
		System.out.println("------Developer Details-----");
		super.display();
		System.out.println("Bonus : "+increment);
		System.out.println("Total salary : "+calculateSalary());
	}
}

class Main
{
	public static void main(String args[])
	{
		Employee e[] = new Employee[4];
		
		e[0] = new Manager("Mansi",11,20,20000);
		e[1] = new Developer("Shreya",22,19,10000);
		e[2] = new Salesman("Harshda",33,22,5000);
		e[3] = new Developer("Vaishnavi",44,20,20000);
		
		for(int i=0 ;i<=3 ; i++)
		{
			e[i].display();
		}
	}
}
