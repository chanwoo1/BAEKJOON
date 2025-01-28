import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 바구니 N개, 바구니에 공 1개씩 들어있음, 공이랑 바구니 번호 같음, M번 공 바꾸기


        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }// 배열 채워놓고

        for (int a = 0; a < M; a++) {
            int i = input.nextInt();
            int j = input.nextInt();

            int temp = 0;

            temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;

        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }


}