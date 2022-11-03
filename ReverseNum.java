import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int result = 0;
        while(num>0){
            result =result * 10 + num%10;
            num /=10;
        }
        System.out.println("Your number is reverse :" +original+ " = " +result);
    }
}
