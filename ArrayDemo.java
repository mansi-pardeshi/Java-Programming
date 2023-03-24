import java.util.Scanner;
class ArrayDemo
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s[] = new String[5];
    int flag = 0;
    StringBuffer sb;
    String str;
    System.out.println("Enter strings : ");
	
    for(int i = 0 ; i < s.length ; i++)
    {
      s[i] = new String(sc.nextLine());
    }
	
	
    System.out.println();
    System.out.println("Strings are : ");
	
    for(int i = 0 ; i < s.length ; i++)
    {
      System.out.println(s[i]);
    }
    System.out.println();
    System.out.println("Palindrome strings are : ");
	
    for(int i = 0 ; i < s.length ; i++)
    {
      sb = new StringBuffer(s[i]).reverse();
	  str = sb.toString();
	  if(s[i].equals(str) == true)
      {
        System.out.println(str);
        flag = 1;
      }
    }
    if(flag == 0)
      System.out.println("No Palindrome String");
  }
}