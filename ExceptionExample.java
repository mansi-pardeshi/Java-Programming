import java.util.Scanner;

class invalidAmountException extends Exception
{
	invalidAmountException()
	{
		super();
	}
	invalidAmountException(String msg)
	{
		super(msg);
	}
}

class insufficientFundException extends Exception
{
	insufficientFundException()
	{
		super();
	}
	insufficientFundException(String msg)
	{
		super(msg);
	}
}

interface Bank
{
	void deposit(int amount) throws invalidAmountException;
	void withdraw(int amount) throws invalidAmountException,insufficientFundException;
	void balanceEnquiry();
}

class HDFC implements Bank
{
	static int balance = 2000;
	public void deposit(int amount) throws invalidAmountException
	{
		if(amount < 0)
		{
			throw new invalidAmountException("Inavlid Amount");
		}
		else
		{
			this.balance = this.balance+amount;
		}
	}
	
	public void withdraw(int amount) throws invalidAmountException,insufficientFundException
	{
		if(amount < 0)
		{
			throw new invalidAmountException("Inavlid Amount");
		}
		else if(amount > this.balance)
		{
			throw new insufficientFundException("Insufficient Balance");
		}
		else
		{
			this.balance = this.balance-amount;
		}
	}
	
	public void balanceEnquiry()
	{
		System.out.println("Balane : "+this.balance);
	}
	
}

class Transaction
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("1.Deposit Cash");
			System.out.println("2.Withdraw Cash");
			System.out.println("3.Check Balance");
			System.out.println("0.Exit");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			
			switch(choice) 
			{
				case 1: 
				HDFC hdfc = new HDFC();
				System.out.println("Enter Amount");
				int amount = sc.nextInt();
				try
				{
					hdfc.deposit(amount);
				}
				catch(invalidAmountException iae)
				{
					iae.printStackTrace();
				}
				break;
				case 2: 
				HDFC hdfc2 = new HDFC();
				System.out.println("Enter Amount");
				int amount2 = sc.nextInt();
				try
				{
					hdfc2.withdraw(amount2);
				}
				catch(invalidAmountException iae)
				{
					iae.printStackTrace();
				}
				catch(insufficientFundException ife)
				{
					ife.printStackTrace();
				}
				break;
				case 3: 
				HDFC hdfc3 = new HDFC();
				hdfc3.balanceEnquiry();
				break;
				case 0: 
				System.exit(0);
				break;
			}
		}while(choice != 0);
	}
}