import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ave = input.nextInt();

        double sum = 0;
        double max = 0;

        double[] arr = new double[ave];

        for (int i = 0; i < ave; i++) {
            int num1 = input.nextInt();
            arr[i] = num1;
        }// ave값만큼 점수 받기


        for (int i = 0; i < ave; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
        }//점수 중 최댓값 구함

        for (int i = 0; i < ave; i++) {
            arr[i] = arr[i] / max * 100;
        }// 점수 조작


        for (int i = 0; i < ave; i++) {
            sum += arr[i];
        }

        System.out.println(sum / ave);

    }


}