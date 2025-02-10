import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        int time = 0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C'){
                time = time + 2 + 1;
            }else if(s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F'){
                time = time + 2 + 2;
            }else if(s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I'){
                time = time + 2 + 3;
            }else if(s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L'){
                time = time + 2 + 4;
            }else if(s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O'){
                time = time + 2 + 5;
            }else if(s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S'){
                time = time + 2 + 6;
            }else if(s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V'){
                time = time + 2 + 7;
            }else if(s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z'){
                time = time + 2 + 8;
            }
        }
        System.out.println(time);
    }
}
