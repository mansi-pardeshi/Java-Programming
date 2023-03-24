public class Prime 
{
    public static void main(String arg[])
    {
        int flag = 0;
        int num = Integer.parseInt(arg[0]);

        for(int i=2 ; i<num ; i++)
        {
            if(num % i == 0)
            {
                flag = 1;
            }
        }

        if(flag == 1)
        {
            System.out.println("Given number is not prime number");
        }
        else
        {
            System.out.println("Given number is a prime number");
        }
    }
}
