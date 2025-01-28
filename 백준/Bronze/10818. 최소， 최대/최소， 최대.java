import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < N; i++) {
            int num = input.nextInt();

            if(min > num){
                min = num;
            }else if(max < num){
                max = num;
            }
        }
        System.out.println(min + " " + max);

        ============================================


        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int num1 = N/2;
        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        } //배열 채우고

        for (int i = 0; i < N; i++) {
            if (arr[i] > arr[N - 1]) {
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[N - 1];
                arr[N - 1] = temp;
            }
        }

        for (int i = 0; i < N - 1; i++) {
            if (arr[i] > arr[N - 2]) {
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[N - 2];
                arr[N - 2] = temp;
            }
        }

        for (int i = 0; i < N - 2; i++) {
            if (arr[i] > arr[N - 3]) {
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[N - 3];
                arr[N - 3] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
         */

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int num = input.nextInt();
            arr[i] = num;
        } // 배열 채우고

        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < N; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
            
            if (max <= arr[i]) {
                max = arr[i];
            }
        }


        System.out.println(min + " " + max);
    }
}