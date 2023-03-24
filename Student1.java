import java.util.Scanner;
public class Student1 
{
    int rno;
    String sname;
    double per;

    void setdata(int rno , String sname , double per)
    {
        this.rno = rno;
        this.sname = sname;
        this.per = per;
    }

    void display()
    {
        System.out.println(this.rno + "\t\t" + this.sname + "\t\t"+ this.per);
    }

    static void sort(Student1 a[] , int n)
    {
        int i,j;
        Student1 temp = new Student1();
        for(i=0 ; i<n-1 ; i++)
        {
            for(j=1 ; j<n ; j++)
            {
                if(a[i].per < a[j].per)
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n,i;
        System.out.println("enter number of students :");
        n = input.nextInt();

        Student1 s[] = new Student1[n];

        for(i=0 ; i<n ; i++)
        {
            s[i] = new Student1();

            System.out.println("enter"+(i+1)+"student data");

            System.out.println("enter rol no :");
            int rn = input.nextInt();
            input.nextLine();

            System.out.println("Enter student name :");
            String sn = input.nextLine();
            System.out.println("Enter perscentage");
            double per = input.nextDouble();
            s[i].setdata(rn,sn,per);
        }
        System.out.println("Students records are :");
        System.out.println("Roll no \t Student name \tPercentage");

        for(i=0;i<n;i++)
        {
            s[i].display();
        }

        System.out.println("Sorted Students records are :");
        Student1.sort(s,n);
        for(i=0;i<n;i++)
        {
            s[i].display();
        }
    }
}
