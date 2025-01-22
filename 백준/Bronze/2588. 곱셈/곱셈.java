
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intNum1 = scanner.nextInt(); //1
        int intNum2 = scanner.nextInt(); //2

        int num100 = (intNum2 / 100);
        int num10 = (intNum2 % 100) / 10;
        int num1 = ((intNum2 % 100) % 10);


        System.out.println(intNum1 * num1); //3
        System.out.println(intNum1 * num10); //4
        System.out.println(intNum1 * num100); //5

        System.out.println((intNum1 * num1) + (intNum1 * num10 * 10) + (intNum1 * num100 * 100));


    }
}