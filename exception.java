public class exception
{
    public static void main(String args[])
    {
        System.out.println("Start");
        int a = 15 , b = args.length , z;
        try
        {
            z = a/b;
            System.out.println("Z ="+z);
            System.out.println("Value at 4 index in args "+args[4]);
        }
        catch( Exception e)
        {
            System.out.println("Error 1 "+e);
        }
        catch(ArrayIndexOutOfBoundException e)
        {
            System.out.println("Error 2 "+e);
        }
        finally
        {
            System.out.println("In finally block....");
        }
        System.out.println("End....");
    }
}