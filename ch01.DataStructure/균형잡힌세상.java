import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        while(!str.equals(".")) {
            Stack<Character> stack = new Stack<>();
            Boolean flag = true;

            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if(ch == '(') {
                    stack.push('(');
                } else if(ch == '[') {
                    stack.push('[');
                } else if(ch == ')') {
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
                } else if(ch == ']') {
                    if(stack.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        if(stack.peek() == '[') {
                            stack.pop();
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
            }

            if(stack.isEmpty() && flag) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");

            str = br.readLine();
        }

        System.out.println(sb.toString());

        if(br != null) br.close();
    }
}
