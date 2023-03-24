class HashCode
{
	int a;
	HashCode(int a)
	{
		this.a = a;
	}
	
	public int hash()
	{
		return super.hashCode();
	}
	
}
class Main
{
	public static void main(String args[])
	{
		HashCode hc = new HashCode(10);
		System.out.println(hc.hash());
		int b = System.identityHashCode(hc);
		System.out.println(b);
	}
}