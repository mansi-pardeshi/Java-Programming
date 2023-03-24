import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListDemo 
{
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("How many number of friends you want to insert");
            int n = sc.nextInt();
            LinkedList ll = new LinkedList();
            
            for(int i=0;i<n;i++)
            { 
                System.out.println("Enter "+(i+1)+" Name");
                String temp = sc.next();
                ll.add(temp);
            }
            System.out.println(ll);
            
        }
}