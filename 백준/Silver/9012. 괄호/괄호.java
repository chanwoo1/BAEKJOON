import java.io.*;

class MyStack {
    int index;
    String[] stack;

    MyStack() {
        index = 0;
        stack = new String[50];
    }

    public void push(String item) {
        stack[index++] = item;
    }

    public void pop() {
        --index;
    }

    public int size() {
        return index;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        for (int i = 0; i < repeat; i++) {
            String[] str = br.readLine().split("");
            MyStack stack = new MyStack();
            boolean flag = true;

            for (int j = 0; j < str.length; j++) {

                if (str[j].equals("(")) {
                    stack.push(str[j]);
                } else if (str[j].equals(")")) {
                    stack.pop();
                    if (stack.size() < 0) {
                        bw.write("NO\n");
                        flag = false;
                        break;
                    }
                }
            }
            if (stack.size() == 0) {
                bw.write("YES\n");
            } else if (flag == true) {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}