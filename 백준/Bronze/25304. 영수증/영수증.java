
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int result = scanner.nextInt(); // 물건 값 총합

        int n = scanner.nextInt(); // 산 물건 개수

        for (int i = 1; i <= n; i++) {
            int money = scanner.nextInt();// 가격
            int how = scanner.nextInt(); // 개수

            sum += money * how;
        }

       //System.out.println("sum = " + sum);
        if(result == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}