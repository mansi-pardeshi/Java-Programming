import java.util.*;
class Armstrong
{
  public static void main(String args[])
  {
    Int i, n, rem, temp, sum = 0, pow, cnt=0;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: "); 
    n = sc.nextInt();

    temp = n;
    While(temp != 0)
    {
      temp = temp/ 10;
      cnt++;
    }
    
    temp = n;
    while(temp > 0)
    {
      rem = temp %10;
      pow = 1;
      for(i=0; i<cnt; i++)
      {
        pow = pow * rem;
      }
      sum = sum + pow;
      temp = temp/10;
    }
    
    if(n == sum)
    {
      System.out.println("given number is armstrong");  
    }
    else
    {
      System.out.println("given number is not armstrong");
    }
  }
}


