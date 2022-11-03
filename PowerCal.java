import java.util.Scanner;

public class PowerCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = 1;
        for (int i = 1; i <=num2 ; i++) {
            res *=num1;
        }
        System.out.println(res);
    }
}
