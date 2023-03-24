public class Add_n_num 
{
    public static void main(String arg[])
    {
        int sum = 0;
        int n = Integer.parseInt(arg[0]);
        int i;
        for(i=0 ; i<=n ; i++)
        {
            sum = sum+i;
        }
        System.out.println("Addition of first "+n+" is :"+sum);
    }
}
