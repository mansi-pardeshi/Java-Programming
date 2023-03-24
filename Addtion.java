import java.io.BufferedReader;
import java.io.InputStreamReader;

class Addition
{
	public static void main(String args[])throws Exception
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter First Number");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Second Number");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("Addition is "+(a+b));
	}
}