import java.io.*;
public class FileReverse 
{
    public static void main(String args[])
    {
        try{
            FileReader fin = new FileReader("demo.txt");
            BufferedReader br = new BufferedReader(fin);
            String ch;
            String[] strarray = null;
            do
            {
                ch = br.readLine();
                //System.out.print(ch);
                 strarray = ch.split(" ");
            }while(ch != null);

            for(int i=0 ; i<strarray.length ; i++)
            {
                System.out.print(strarray[i]);
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
