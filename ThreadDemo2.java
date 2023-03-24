public class ThreadDemo2 extends Thread
{
    public void run()
    {
        try{
            for(int i=0;i<10;i++)
            {
                System.out.println("COVID19");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        try{
            for(int i=0;i<20;i++)
            {
                System.out.println("LOCKDOWN2020");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Thread3 extends Thread
{
    public void run()
    {
        try{
            for(int i=0;i<30;i++)
            {
                System.out.println("VACCINATED2021");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Main2
{
    public static void main(String args[])
    {
        ThreadDemo2 t1 = new ThreadDemo2();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.start();
        t2.start();
        t3.start();
    }
}