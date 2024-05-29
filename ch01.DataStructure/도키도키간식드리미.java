import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 도키도키간식드리미 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine())+1;
        st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int line = 1;

        while(st.hasMoreTokens()) {
            num = Integer.parseInt(st.nextToken());

            if(num == line) {
                line++;
                while(!stack.isEmpty()) {
                    if(stack.peek() == line) {
                        stack.pop();
                        line++;
                    } else {
                        break;
                    }
                }
            } else {
                stack.add(num);
            }
        }

        while(!stack.isEmpty()) {
            if(stack.peek() == line) {
                stack.pop();
                line++;
            } else {
                break;
            }
        }

        if(stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
        
        if(br != null) br.close();
    }
}