public class Result 
{
    public static void main(String arg[])
    {
        float per;
        int a = Integer.parseInt(arg[0]);
        int b = Integer.parseInt(arg[1]);
        int c = Integer.parseInt(arg[2]);
        int d = Integer.parseInt(arg[3]);
        int e = Integer.parseInt(arg[4]);
        int f = Integer.parseInt(arg[5]); 
        
        
        int total = a+b+c+d+e+f;
        System.out.println("Total Marks are "+total);

        per = (total/600)*100;
        System.out.println("Percentage is "+per);

       /* if(per > 90)
        {
            System.out.println("A Grade");
        }
        if(per > 80 && per <90)
        {
            System.out.println("B Grade");
        }if(per > 70 && per < 80)
        {
            System.out.println("C Grade");
        }
        else
        {
            System.out.println("D Grade");
        }*/
    }
}
