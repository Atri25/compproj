import java.util.Scanner;

public class Main3 {
    public void volume1(double s)
    {
        System.out.println(s*s*s);
    }
    public void volume2(double l, double b, double h)
    {
        System.out.println(l*b*h);
    }
    public void volume3(double r)
    {
        System.out.println((4/3)*3.14*r);
    }
    public static void main(String args[]){
        double r,l,b,h,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        System.out.println("1)volume of cube");
        System.out.println("2)volume of cuboid");
        System.out.println("3)volume of cylinder");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("enter side");
            s= sc.nextDouble();
            Main3 obj1 = new Main3();
            obj1.volume1(s);
        }else if(choice==2){
            System.out.println("enter length");
            l= sc.nextDouble();
            System.out.println("enter breath");
            b= sc.nextDouble();
            System.out.println("enter height");
            h= sc.nextDouble();
            Main3 obj2 = new Main3();
            obj2.volume2(l,b,h);
        }else if(choice==3){
            System.out.println("enter radius");
            r= sc.nextDouble();
            Main3 obj3 = new Main3();
            obj3.volume3(r);
        }


    }
}
