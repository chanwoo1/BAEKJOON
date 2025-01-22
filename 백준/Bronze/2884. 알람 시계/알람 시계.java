
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (0 < h && h <= 23 && 0 <= m && m < 45) { // 00시보다 크고 45분보다 적을때
            System.out.println((h - 1) + " " + (60 - (45 - m)));
        } else if (h == 0 && 0 <= m && m < 45) { //00시고 45분보다 적을때
            System.out.println((h + 23) + " " + (60 - (45 - m)));
        } else
            System.out.println(h + " " + (m - 45));
    }
}