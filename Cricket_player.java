import java.util.Scanner;
public class Cricket_player 
{
    String name;
    int num_inn;
    int num_notout;
    int tot_run;
    int bat_avg;

    void setdata(String name , int num_inn , int num_notout , int tot_run , int bat_avg)
    {
        this.name = name;
        this.num_inn = num_inn;
        this.num_notout = num_notout;
        this.tot_run = tot_run;
        this.bat_avg = bat_avg;
    }

    void display()
    {
        System.out.println(this.name+"\t"+this.num_inn+"\t"+this.num_notout+"\t"+this.tot_run+"\t"+ this.bat_avg);
    }

    int batavg(int  num_inn ,  int num_notout , int tot_run)
    {
        return (tot_run / (num_inn - num_notout));
    }

    void sort(Cricket_player a[] , int n)
    {
        int i,j;
        Cricket_player temp = new Cricket_player();
        for(i=0 ; i<n ; i++)
        {
            for(j=i+1 ; j<n ; j++)
            {
                if(a[i].bat_avg < a[j].bat_avg)
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
        int n , i;
        System.out.println("Enter number of players");
        n = input.nextInt();
        Cricket_player cp[] = new Cricket_player[n];
        for(i=0 ; i<n ; i++)
        {
            cp[i] = new Cricket_player();
            System.out .println("Enter"+(i+1)+"player details");
            System.out.println("Enter name of cricekt player :");
            String pn = input.nextLine();
            System.out.println("Enter number of innnings :");
            int in = input.nextInt();
            System.out.println("Enter how number of times not out :");
            int no = input.nextInt();
            System.out.println("Enter total runs of :");
            int tr = input.nextInt();
           // System.out.println("Enter bat average :");
            int ba;
            ba = batavg(in , no , tr);
        }
        System.out.println("Cricket players records are :");
        System.out.println("Name\tNumber of innings\tNumber of not outs\tNumber of runs\tBatting average");
        for(i=0 ; i<n ; i++)
        {
            cp[i].display();
        }

        Cricket_player.sort(ba , n);
        System.out.println("Sorted Cricket players details are :");
        System.out.println("Name\tNumber of innings\tNumber of not outs\tNumber of runs\tBatting average");
        for(i=0 ; i<n ; i++)
        {
            cp[i].display();
        }
    }
}
