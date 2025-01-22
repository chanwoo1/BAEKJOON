import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intValue1 = scanner.nextInt();
        int intValue2 = scanner.nextInt();
        System.out.println((double)intValue1 / (double)intValue2);

    }
}