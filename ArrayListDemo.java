import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo 
{
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("How many number of cities you want to insert");
            int n = sc.nextInt();
            ArrayList al = new ArrayList(n);
            
            for(int i=0;i<n;i++)
            { 
                System.out.println("Enter "+(i+1)+" Name");
                String temp = sc.next();
                al.add(temp);
            }
            System.out.println(al);

            for(int i=0;i<n-1;i++)
            { 
                al.remove(i);
            }
            System.out.println("Array List after removing elemnts");
            System.out.println(al);
            
        }
}