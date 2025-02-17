import java.io.*;
import java.nio.Buffer;

class MyStack {

    int index = 0;
    int[] stack;

    public MyStack() {
        stack = new int[2];
    }

    public MyStack(int num) {
        stack = new int[num];
    }

    public void push(int num) {
        if (index == stack.length) { //터지면
            int[] temp = new int[stack.length * 2];
            System.arraycopy(stack, 0, temp, 0, stack.length);
            stack = temp;
        }
        stack[index++] = num;

    }

    public int pop() {//스택에서 가장 위에 있는 정수를 빼고,그거 출력. if 스택에 정수 없으면 -1 출력
        if (index == 0) { //상자 비면
            return -1;
        } else {
            return stack[--index];
        }
    }

    public int size() {// 스택에 들어있는 정수 개수 출력
        return index;
    }

    public int empty() {// 스택 비어있으면 1, 아니면 0 출력
        if (index == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int top() {// 스택 가장 위 정수 출력. 스택 비어있으면 -1 출력
        if (index == 0) {
            return -1;
        } else {
            return stack[index - 1];
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        MyStack myStack = new MyStack();

        //n 으로 정수를 하나 받

        int repeat = Integer.parseInt(br.readLine());

        

        for (int i = 0; i < repeat; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push":
                    myStack.push(Integer.parseInt(input[1]));//push에 int로 줘야돼
                    break;
                case "pop"://스택에서 가장 위에 있는 정수를 빼고,그거 출력
                    bw.write(myStack.pop() + "\n");
                    break;
                case "size":// 스택에 들어있는 정수 개수 출력
                    bw.write(myStack.size() + "\n");
                    break;
                case "empty":
                    bw.write(myStack.empty() + "\n");
                    break;
                case "top":
                    bw.write(myStack.top() + "\n");
                    break;
            }
        }

        bw.flush();
    }
}