import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.nextLine().charAt(0); //줄에 첫번째만 받는다는

        int num = (int)ch;

        System.out.println(num);
    }
}