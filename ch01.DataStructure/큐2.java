import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        String command = "";
        String last = "";
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();

            switch (command) {
                case "push":
                    last = st.nextToken();
                    queue.add(last);
                    break;
                case "pop":
                    if(queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.poll() + "\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size() + "\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1" : "0");
                    sb.append("\n");
                    break;
                case "front":
                    if(queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.peek() + "\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(last + "\n");
                    }
                    break;
            }
        }

        System.out.println(sb.toString());

        if(br != null) br.close();
    }
}
