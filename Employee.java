import java.util.Scanner;
class Emp
{
    int id;
    String name;
    Double salary;

    Emp(int id , String name , Double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    

    void display()
    {
        System.out.println(id+"\t"+name+"\t"+salary);
    }
}



class Employee
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many Employee details you want to enter : ");
        int n = input.nextInt();

        Emp e[] = new Emp[n];

        for(int i=0 ; i<n ; i++)
        {
            System.out.println("Enter Employee Details for "+(i+1)+" Emplyee : ");
            System.out.println("Enter ID : ");
            int id = input.nextInt();
            System.out.println("Enter Name : ");
            String name = input.next();
            System.out.println("Enter Salary : ");
            double sal = input.nextDouble();
            e[i] = new Emp(id , name , sal);
        }

        System.out.println("******Employee Details*******");
        System.out.println("ID\tName\tSalary");
        for(int i=0 ; i<n ; i++)
        {
            e[i].display();
        }
    }
}