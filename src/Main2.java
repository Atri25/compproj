import java.util.Scanner;

public class Main2 {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter name");
        String name= sc.nextLine();
        System.out.println("enter income");
        double taxincome= sc.nextDouble(), tax;
        if(taxincome<=100000)
        {
            tax=0.0;
        }
        else if(taxincome<=150000)
        {
            tax=1*(taxincome-100000);
        }
        else if(taxincome<=250000)
        {
            tax=5000 + 2*(taxincome-150000);
        }
        else
        {
            tax=25000 + 3*(taxincome-250000);
        }
        System.out.println(name+"\t" +taxincome+"\t"+tax);
    }
}
