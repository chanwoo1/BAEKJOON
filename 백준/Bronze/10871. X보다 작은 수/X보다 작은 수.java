import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // N, X 받고 N개 정수 중에 X보다 작은거 다시 나열

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int X = input.nextInt();

        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        int count = 0;

        for (int i = 0; i < N; i++) {
            arr1[i] = input.nextInt(); // 배열 돌리고
            if (arr1[i] < X) {
                arr2[count++] = arr1[i];
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr2[i] + " ");
        }


    }
}