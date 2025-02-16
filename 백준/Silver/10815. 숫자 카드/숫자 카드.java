import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) { // n만큼 숫자 받기
            set.add(sc.nextInt());
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) { //m까지 돌릴건데

            int a = sc.nextInt();

            if (set.contains(a) == true) {
                System.out.print("1 ");
            } else if (set.contains(a) == false) {
                System.out.print("0 ");
            }
        }
    }
}