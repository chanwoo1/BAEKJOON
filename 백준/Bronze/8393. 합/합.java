
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); //반복 수 받고

        int sum = 0;

        for (int i = 1; i <= t; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}