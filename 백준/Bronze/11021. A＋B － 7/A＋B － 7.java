
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int how = scanner.nextInt();

        for (int i = 1; i <= how; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println("Case #" + i +": " + (num1+num2));
        }
    }
}