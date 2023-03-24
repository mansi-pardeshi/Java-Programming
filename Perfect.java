import java.util.Scanner;
class Perfect 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int  sum = 0;
        int copy = num;

        for(int i=1 ; i<num ; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == copy)
        {
            System.out.println("Given number is perfect number");
        }
        else
        {
            System.out.println("Given number is not an perfect number");
        }
    }
}
