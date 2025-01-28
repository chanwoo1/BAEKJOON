import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //10개 랜덤값 받고 3으로 나눈 나머지 중에 서로 다른값 몇갠지 구하기

        Scanner input = new Scanner(System.in);


        int[] arr1 = new int[10];
        int[] arr2 = new int[42];

        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();

            int n = num % 42;
            arr1[i] = n;
        }

        // arr 배열에 나머지 다 들어있음

        for (int i = 0; i < 42; i++) {
            for (int k = 0; k < 10; k++) {
                if (arr1[k] == i) {// 첫번째 나머지가 0이면?
                    arr2[i]++;
                }
            }
        }

        int cnt = 0;

        for (int i = 0; i < 42; i++) {
            if(arr2[i] !=0){
                cnt++;
            }
        }
        /*
        for (int i = 0; i < 42; i++) {
            System.out.print(arr2[i] + " ");
        }
         */



        System.out.println(cnt);

    }


}