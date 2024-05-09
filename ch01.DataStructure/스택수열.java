import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열 {
    static int N;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        for(int i = 0; i < arr.length; i++) {
            int su = arr[i];

            if(su >= num) {
                while(su >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int n = stack.pop();
                if(n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }

        if(result) {
            System.out.println(sb.toString());
        }

        // 틀린 풀이...

        // Stack stack = new Stack<>();
        // boolean stop = false;
        // boolean success = true;

        // int num = 0;
        // int add = 1;
        // stack.push(add);
        // sb.append("+");

        // for(int i = 0; i < N; i++) {
        //     num = Integer.parseInt(br.readLine()); //4

        //     while(!stop) {
        //         if(stack.empty()) {
        //             stop = true;
        //             success = false;
        //             break;
        //         }
        //         if((int)stack.peek() != num) {
        //             add++;
        //             stack.push(add);
        //             sb.append("\n");
        //             sb.append("+");
        //         } else {
        //             stack.pop();
        //             sb.append("\n");
        //             sb.append("-");
        //             stop = true;
        //         }
        //     }

        //     if(stop && !success) {
        //         stack.push(0);
        //         break;
        //     }
        //     stop = false;
        // }

        // if(stack.empty()) {
        //     System.out.println(sb.toString());
        // } else {
        //     System.out.println("NO");
        // }

        if(br != null) br.close();
    }
}
