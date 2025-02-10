import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1 = input.next();
        String s2 = input.next();

        if (s1.charAt(2) > s2.charAt(2)) {
            System.out.print(s1.charAt(2) + "" + s1.charAt(1) + "" + s1.charAt(0));
        } else if (s1.charAt(2) < s2.charAt(2)) {
            System.out.print(s2.charAt(2) + "" + s2.charAt(1) + "" + s2.charAt(0));
        } else if (s1.charAt(2) == s2.charAt(2)) {

            if (s1.charAt(1) > s2.charAt(1)) {
                System.out.print(s1.charAt(2) + "" + s1.charAt(1) + "" + s1.charAt(0));
            } else if (s1.charAt(1) < s2.charAt(1)) {
                System.out.print(s2.charAt(2) + "" + s2.charAt(1) + "" + s2.charAt(0));
            } else if (s1.charAt(1) == s2.charAt(1)) {

                if (s1.charAt(0) > s2.charAt(0)) {
                    System.out.print(s1.charAt(2) + "" + s1.charAt(1) + "" + s1.charAt(0));
                } else if (s1.charAt(0) < s2.charAt(0)) {
                    System.out.print(s2.charAt(2) + "" + s2.charAt(1) + "" + s2.charAt(0));
                }
            }
        }
    }
}