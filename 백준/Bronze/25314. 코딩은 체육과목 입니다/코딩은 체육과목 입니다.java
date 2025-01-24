
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //4바이트 늘때마다 long 추가

        int bite = scanner.nextInt();

        int how = bite / 4;

        for (int i = 1; i <= how; i++) {
            System.out.print("long ");
        }

        if(bite % 4 >0){
            System.out.print("long ");
        }

        System.out.println("int");
    }
}