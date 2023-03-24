import java.io.*;
public class FileDemo 
{
    public static void main(String args[])
    {
        try{
            FileInputStream fin = new FileInputStream("demo.txt");
            //FileInputStream fin = new FileInputStream(args[0]);
            int ch = fin.read();//reads the first byte from file
            while(ch != -1)
            {
                System.out.print((char)ch);
                ch = fin.read();
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
