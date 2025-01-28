import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] num;

        int numInt = scanner.nextInt(); // 정수 개수 받고
        num = new int[numInt];

        for (int i = 0; i < numInt; i++) { //개수만큼 입력
            num[i] = scanner.nextInt();
        }

        int num2 = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < numInt; i++) {
            if (num[i] == num2) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}