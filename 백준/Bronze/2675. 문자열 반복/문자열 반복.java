import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();


        for (int i = 0; i < t; i++) {// t
            int num = input.nextInt(); //반복수
            String s = input.next(); // 단어

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println(" ");
        }
    }
}