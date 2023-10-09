import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),digit,sum=0;
        int temp = num;

        while(num!=0){
            digit = num % 10;
            sum = sum +digit;
            num = num /10;
        }
        if(num%sum==0){
            System.out.println(temp+" is divisible by "+ sum);
        }
        else{
            System.out.println(temp+" is not divisible by "+ sum);
        }

    }
}