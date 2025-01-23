
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int num1 = scanner.nextInt();

        //m은 1000분까지, 시간 변환한만큼 h 오르게

        int change = (m + num1) / 60;

        //m+num1 <60 or 60>=
        if (m + num1 < 60) {
            System.out.println(h + " " + (m + num1));
        } else if (m + num1 >= 60) {
            if (h + change >= 24) {
                System.out.println(((h + change) - 24) + " " + (m + num1 - (change * 60)));
            } else {
                System.out.println((h + change) + " " + (m + num1 - (change * 60)));
            }
        }


    }
}