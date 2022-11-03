import java.util.Scanner;

public class EvenOddProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        for (int i = 1; i <=num; i++) {
            if(i%2==0){
                res -=i;
            }else{
                res +=i;
            }
        }
        System.out.println(res);
    }
}
