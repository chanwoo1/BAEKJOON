import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[9];

        int cnt = 0;
        int max = 0; //
        for (int i = 0; i < 9; i++) {
            int num = input.nextInt();
            arr[i] = num;
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < 9; i++) {
            cnt++;
            if (max == arr[i]) {
                System.out.println(max + " " + cnt);
            }
        }


    }
}