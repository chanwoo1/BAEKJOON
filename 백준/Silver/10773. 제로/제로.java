import java.io.*;

class MyStack {

    int index;
    int sum;
    int[] box;

    public MyStack(int num) {
        index = 0;
        box = new int[num];
    }

    public void push(int num) {

        if (num == 0) {
            pop();
        } else { //num=0이면 0 저장 안하고 그 전 정수 없애기
            box[index++] = num;
        }
    }

    public void pop() {
        --index;
    }
    /*
    index = 0, box[0] = 2
    index = 1, box[1] = 3
    index = 2, box[2] 에 0이면 --index 하고 index는 1부터 시작
    index = 1, box[1] 에 0이면 --index하고 index는 0부터 시작
    index = 0, box[0]= 1이면 다시 저장
    */

    public int sum() {
        for (int i = 0; i < index; i++) {
            sum += box[i];
        }

        return sum;
    }

}


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String repeat = br.readLine(); // 반복횟수 받기
        MyStack stack = new MyStack(Integer.parseInt(repeat)); // 절로 넘김

        for (int i = 0; i < Integer.parseInt(repeat); i++) {
            String s = br.readLine();
            stack.push(Integer.parseInt(s));
        }

        bw.write(stack.sum() + "\n");
        bw.flush();
    }
}