import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.next(); //크로아티아 단어 영어로 받기

        // = , - , j 들어가있으면 조건 보기

        int cnt = 0;
        int i1 = 1;


        for (int i = 0; i < str.length(); i++) { //단어 뜯어서 보기
            cnt++;

            if (i >= 2 && (str.charAt(i) == '-') && (str.charAt(i - 1) == 'c' || (str.charAt(i - 1) == 'd'))) { // c- or d- 면
                cnt--;
            } else if (i >= 2 && (str.charAt(i) == 'j') && (str.charAt(i - 1) == 'l' || (str.charAt(i - 1) == 'n'))) { //lj, nj
                cnt--;
            } else if (i >= 2 && (str.charAt(i) == '=') && (str.charAt(i - 1) == 'c' || (str.charAt(i - 1) == 's') || (str.charAt(i - 1) == 'z'))) {

                if ((str.charAt(i - 1) == 'z') && str.charAt(i - 2) == 'd') {
                    cnt -= 2;
                } else
                    cnt--;
            }

            //i=0,1,2 일때 따로 하기
            if (i == i1 && (str.charAt(i) == '-') && (str.charAt(0) == 'c' || (str.charAt(0) == 'd'))){ // i = 1이고 c-,d-일때
                cnt--;
            }else if(i == i1 && (str.charAt(i) == 'j') && (str.charAt(0) == 'l' || (str.charAt(0) == 'n'))){ // i = 1이고, lj, nj일때
                cnt--;
            }else if (i == i1 && (str.charAt(i) == '=') && (str.charAt(0) == 'c' || (str.charAt(0) == 's') || (str.charAt(0) == 'z'))) {
                cnt--;
            }


        }
        System.out.println(cnt);
    }

}



