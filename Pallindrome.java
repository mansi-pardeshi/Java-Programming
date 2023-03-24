public class Pallindrome 
{
    public static void main(String arg[])
    {
        int rev = 0;
        int mod;
        int num = Integer.parseInt(arg[0]);

        int n = num;

        while(num > 0)
        {
            mod = num % 10;
            rev = rev * 10 + mod;
            num = num / 10;
        }
        
        if(rev == n)
        {
            System.out.println("Given number is pallindrome");
        }
        else
        {
            System.out.println("Given number is not pallindrome");
        }
    }
}
