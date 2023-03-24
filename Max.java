class Max
{
	public static void main(String args[])
	{
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		
		if(n1 > n2 && n1 > n3)
		{
			System.out.println(n1+" is Maximum");
		}
		else if(n2 > n1 && n2 > n3)
		{
			System.out.println(n2+" is Maximum");
		}
		else if(n3 > n2 && n3 > n1)
		{
			System.out.println(n3+" is Maximum");
		}
	}
}