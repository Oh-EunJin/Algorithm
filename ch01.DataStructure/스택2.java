import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "1":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    if(!stack.empty()) {
                        sb.append(stack.pop());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case "3" :
                    sb.append(stack.size());
                    sb.append("\n");
                    break;
                case "4" :
                    if(stack.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case "5":
                    if(!stack.empty()) {
                        sb.append(stack.peek());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
            }
        }

        System.out.println(sb.toString());

        if(br != null) br.close();
    }
}
