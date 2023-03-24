public class ThreadDemo extends Thread
{
    public void run()
    {
        try{
            for(int i=100;i>0;i--)
            {
                System.out.println(i);
                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }   
}
class Main
{
    public static void main(String args[])
    {
        ThreadDemo td = new ThreadDemo();
        td.start();
        System.out.println("Thread Name Before Changing : "+td.getName());
        td.setName("Mansi");
        System.out.println("Thread Name After Changing : "+td.getName());
    }
}

