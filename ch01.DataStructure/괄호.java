import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String parenthesis = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            parenthesis = br.readLine();
            Boolean flag = true;

            for(int j = 0; j < parenthesis.length(); j++) {
                char ch = parenthesis.charAt(j);

                if(ch == '(') {
                    stack.push('(');
                } else {
                    if(stack.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        if(stack.peek() == '(') {
                            stack.pop();
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
            }

            if(stack.isEmpty() && flag) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

        if(br != null) br.close();
    }
}
