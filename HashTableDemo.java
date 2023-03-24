import java.util.Hashtable;
import java.util.Scanner;
public class HashTableDemo 
{
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("How many number of Students you want to insert");
            int n = sc.nextInt();
            Hashtable ht = new Hashtable<String,Integer>();
            
            for(int i=0;i<n;i++)
            { 
                System.out.println("Enter "+(i+1)+" Student Name");
                String temp = sc.next();
                System.out.println("Enter mobile number of "+temp);
                double temp2 = sc.nextDouble();
                ht.put(temp,temp2);
            }
            System.out.println(ht);
            
        }
}