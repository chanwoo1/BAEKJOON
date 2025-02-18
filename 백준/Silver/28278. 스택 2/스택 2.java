import java.io.*;

class MyStack {
    int index;
    int[] box;

    public MyStack() {
        index = 0;
        box = new int[2];
    }

    public void push(int num) {

        if (index == box.length) {
            int[] temp = new int[box.length * 2];
            System.arraycopy(box, 0, temp, 0, box.length);
            box = temp;
        }
        box[index++] = num;
    }

    public int pop() {
        if (index != 0) {
            return box[--index];
        } else {
            return -1;
        }
    }

    public int size() {
        return index;
    }

    public int empty() {

        if (index == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int top() {

        if (index != 0) {
            return box[index - 1];
        } else {
            return -1;
        }
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        MyStack stack = new MyStack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String repeat = br.readLine(); // 반복수 문자열로 받음

        for (int i = 0; i < Integer.parseInt(repeat); i++) {

            String[] s = br.readLine().split(" ");

            switch (s[0]) {
                case "1":
                    stack.push(Integer.parseInt(s[1]));
                    break;
                case "2":
                    bw.write(stack.pop() + "\n");
                    break;
                case "3":
                    bw.write(stack.size() + "\n");
                    break;
                case "4":
                    bw.write(stack.empty() + "\n");
                    break;
                case "5":
                    bw.write(stack.top() + "\n");
                    break;
            }
        }
        bw.flush();
    }
}