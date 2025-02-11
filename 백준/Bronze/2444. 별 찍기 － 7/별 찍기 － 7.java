import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt(); // 정수 받고

        for (int i = 1; i <= 2 * num - 1; i++) { // 전체 줄 수


            if ((2 * num - 1) / 2 > i - 2) {
                for (int j = num - 1; j > i - 1; j--) { // 공백 역순
                    System.out.print(" ");
                }

                for (int k = 1; k <= 2 * i - 1; k++) { //별 수
                    System.out.print("*");
                }
                System.out.println();
            } else if ((2 * num - 1) / 2 <= i - 2) {

                for (int j = num; j <= i - 1; j++) {
                    System.out.print(" ");
                }

                for (int k = 2 * num - 1; k > 2 * i - 2 * num; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }


}
