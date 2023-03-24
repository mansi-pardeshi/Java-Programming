
class Customer
{
	private String cust_name;
	private String cust_no;
	private int meter_no;
	LightBill lb;
	Address adr;
	
	Customer(String cust_name, String cust_no, int meter_no,Address adr, LightBill lb)
	{
		this.cust_name = cust_name;
		this.cust_no = cust_no;
		this.meter_no = meter_no;
		this.adr = adr;
		this.lb = lb;
	}
	
	void displayCustomer()
	{
		System.out.println("Name: "+cust_name);
		System.out.println("Contact Number: "+cust_no);
		System.out.println("Meter Number: "+meter_no);
		System.out.println("Bill No: "+this.lb.getBillNo());
		System.out.println("Units: "+this.lb.getUnits());
		System.out.println("Address :"+this.adr.getLane()+","+this.adr.getStreet()+","+this.adr.getCity()+","+this.adr.getState()+","+this.adr.getCountry());
		System.out.println("Total Light Bill Pay: "+this.lb.calculateBill());
	}
}
	
	
final class LightBill
{
	private int billno;
	final private float default_pay = 40;
	private float units;
	
	LightBill(int billno,float units)
	{
		this.billno = billno;
		this.units = units;
	}
	
	void setBillNo(int billno)
	{
		this.billno = billno;
	}
	
	void setUnits(float units)
	{
		this.units = units;
	}
	
	int getBillNo()
	{
		return this.billno;
	}
	
	float getUnits()
	{
		return this.units;
	}
	
	
	float calculateBill()
	{
		float totalpay = 1;
		
		if(units <= 100)
		{
		 totalpay = 40*units;	
		}
		else if(units > 100 && units < 200)
		{
           totalpay = (70*units)+40;
		}
		else if(units > 200 && units < 300)
		{
			 totalpay = (100*units)+40;
		}
		return totalpay;
	}
	
}

	
final class Address
{
   private int lane_no;
   private String street_name;
   private String city_name;
   private static String state_name;
   private static String country_name;
  
  static
  {
    country_name = "India";
	state_name = "Maharashtra";
  }
  
  Address(int lane_no , String street_name , String city_name )
  {
    this.lane_no = lane_no;
    this.street_name = street_name;
    this.city_name = city_name;
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
	
	
	
class Main
{
	public static void main(String args[])
	{
		Address adr = new Address(11 , "M.G.Road" ," Pune" );
        LightBill lb = new LightBill(23, 150);
		Customer c = new Customer("Vaishnavi", "1234567890",02, adr, lb);
		c.displayCustomer();
	}
}