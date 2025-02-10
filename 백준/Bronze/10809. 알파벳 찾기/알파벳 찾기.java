import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //알파벳 26개

        String s = input.next(); // 단어를 받아

        int[] arr = new int[26]; // 알파벳을 넣을 거야

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) { //단어 길이만큼

            for (int j = 0; j < 26; j++) { // 같은 단어 확인

                if (s.charAt(i) == (97 + j) && arr[j] == -1) {
                    arr[j] = (i);
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}