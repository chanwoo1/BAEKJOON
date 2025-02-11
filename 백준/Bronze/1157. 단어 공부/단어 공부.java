import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[1000000]; //알파벳을 아스키코드로 받음
        char[] arr2 = new char[1000000]; //알파벳 배열 대문자로 다시 넣는곳

        int[] arr3 = new int[26]; // 아스키코드로 다 들어감
        int[] arr4 = new int[26]; // 대문자 카운트 하게

        int max = 0;
        int where = 0;
        int a = 0;
        //그냥 받은걸 다시 대문자로 싹 받아버리기


        String s = input.next(); //단어 하나 받고

        for (int i = 0; i < 26; i++) {
            arr3[i] = 65 + i;
            arr4[i] = 0;
        }

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                arr1[i] = s.charAt(i) - 32;
                arr2[i] = (char) arr1[i];
            } else {
                arr1[i] = s.charAt(i);
                arr2[i] = (char) arr1[i];
            }


        }//arr2에 받은 단어가 대문자로 들어감


        for (int i = 0; i < s.length(); i++) {//총 글자

            for (int j = 0; j < 26; j++) { //알파벳

                if (arr2[i] == (char) arr3[j]) {//대문자로 변환한 단어 하나랑 전체 알파벳 아스키코드랑 같으면
                    arr4[j] += 1;
                }
            }
        }// 이제 나오는데, 같은수가 여러개면 ? 나오고, 하나면 그 번지에 맞는 대문자값 나오게끔

        for (int i = 0; i < 26; i++) {//arr4 값중에서 큰거 뽑고, 중복이면 ? 나오게, 큰거 뽑을때 위치도 기억하게 위치 변수

            if (arr4[i] > max) {
                max = arr4[i];
                where = i;
            } else if (arr4[i] == max) {
                a = arr4[i];
                continue;
            }
        }

            if(max == a){
                System.out.println("?");
                return;
            }
            
        System.out.println((char) arr3[where]);

    }

}



