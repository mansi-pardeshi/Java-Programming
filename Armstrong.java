public class Armstrong 

{
    public static void main(String arg[])
    {
        int sum = 0;
        int num = Integer.parseInt(arg[0]);
        int copy = num;
        while(num > 0)
        {
            int mod = num % 10;
            sum = sum + (mod*mod*mod);
            num = num / 10;
        }

        if(sum == copy)
        {
            System.out.println("Given number is an armstrong number");
        }
        else
        {
            System.out.println("Given number is not an armstrong number");
        }
    }
}
