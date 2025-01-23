
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();

        if (dice1 == dice2 && dice2 == dice3) {// 다 같음
            System.out.println(10000 + dice1 * 1000);
        } else if (dice1 == dice2 && dice2 != dice3) {// 1,2 같고 3만 다름
            System.out.println(1000 + dice1 * 100);
        } else if (dice2 == dice3 && dice1 != dice3) {// 2,3 같고 1만 다름
            System.out.println(1000 + dice2 * 100);
        } else if (dice1 == dice3 && dice2 != dice3) {// 1,3 같고 2만 다름
            System.out.println(1000 + dice1 * 100);
        } else if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
            if (dice1 > dice2 && dice1 > dice3) { //dice1이 젤 크면
                System.out.println(dice1 * 100);
            } else if (dice1 < dice2 && dice2 > dice3) { //dice2가 젤 크면
                System.out.println(dice2 * 100);
            } else if (dice3 > dice2 && dice1 < dice3) { //dice3이 젤 크면
                System.out.println(dice3 * 100);
            }
        }

    }
}