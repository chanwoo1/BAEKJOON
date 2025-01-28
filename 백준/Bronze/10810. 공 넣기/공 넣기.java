import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // N = 바구니 수, M = 공넣기 반복, i j = i부터 j까지, k = K숫자 공 넣기
        //5 4 <- 바구니 5개 4번 반복
        // 2 5 6 <- 2번부터 5번 바구니까지 6번 공 하나씩 넣기

        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // 바구니 수 N
        int M = input.nextInt(); // 공넣기 반복 M

        int[] arr = new int[N];

        for (int a = 0; a < M; a++) {
            int i = input.nextInt();// i 바구니부터
            int j = input.nextInt();// j 바구니까지
            int k = input.nextInt();// k숫자 공 넣기

            //arr[i]~arr[j] k넣기
            for (int b = i; b <= j; b++) {
                arr[b-1] = k;
            }
        }

        for (int a = 0; a < N; a++) {
            System.out.print(arr[a] + " ");
        }

    }
}