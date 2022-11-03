import java.util.Scanner;

public class SumAllDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int original=num;
        while(num>0){
            sum+=num%10;
            num = num/10;
        }
        System.out.println("your number is " + original + "=" + sum);
    }
}
