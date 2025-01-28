import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // n 바구니, m 반복, i부터 j까지 역순

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        } // 배열 채우고

        for (int a = 0; a < m; a++) { //m만큼 반복한다는말
            int i = input.nextInt(); //왼쪽 바구니
            int j = input.nextInt(); // 오른쪽 바구니

            for (int b = i - 1, c = j - 1; b <= c; b++, c--) {
                int temp = 0;

                temp = arr[b];
                arr[b] = arr[c];
                arr[c] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }


}