/*Que. Check number is positive or negative*/

public class Check_pos_neg 
{
    public static void main(String arg[])
    {
        int a = Integer.parseInt(arg[0]);
        if(a < 0)
        {
            System.out.println("Given number is negative");
        }
        else if(a > 0)
        {
            System.out.println("Given number is positive");
        }
        else 
        {
            System.out.println("Given number is zero");
        }
    }
}
