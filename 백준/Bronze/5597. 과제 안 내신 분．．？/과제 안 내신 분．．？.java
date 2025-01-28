import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[30]; // 전체 명단
        int[] arr2 = new int[30]; // 받은 명단

        for (int i = 0; i < 30; i++) {
            arr1[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            int num = input.nextInt();
            arr2[i] = num;
        }// 명단 다받음

        for (int i = 0; i < 30; i++) {

            for (int j = 0; j < 28; j++) {

                if(arr1[i] == arr2[j]){
                    arr1[i] = 0;
                }
            }

            if(arr1[i] != 0){
                System.out.println(arr1[i]);
            }
        }
    }


}