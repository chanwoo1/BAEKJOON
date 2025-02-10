import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine(); // 공백 포함 다받기

        int t = s.length();
        int word = 1;
        int n = 0;
        int sum = 0;

        for (int i = 0; i < t; i++) { //글자 끝까지

            if (s.charAt(i) == ' ') { //공백 있으면
                word++;
            }
        }

        if (s.charAt(0) != ' ' && s.charAt(t - 1) != ' ') {
            sum = word;
            System.out.println(sum);
        } else if (s.charAt(0) == ' ' && s.charAt(t - 1) != ' ') {
            n--;
            sum = word + n;
            System.out.println(sum);
        } else if (s.charAt(0) != ' ' && s.charAt(t - 1) == ' ') {
            n--;
            sum = word + n;
            System.out.println(sum);
        } else if (s.charAt(0) == ' ' && s.charAt(t - 1) == ' ') {
            n = -2;
            sum = word + n;
            System.out.println(sum);
        }
    }
}