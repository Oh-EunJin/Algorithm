import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class 회사에있는사람 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        // List<String> list = new ArrayList<>();
        Map<String, String> list = new LinkedHashMap();
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String state = st.nextToken();
            // if(state.equals("enter")) {
            //     list.add(name);
            // } else if(state.equals("leave") && list.contains(name)) {
            //     list.remove(list.indexOf(name));
            // }
            if(list.containsKey(name) && state.equals("leave")) {
                list.remove(name);
            } else {
                list.put(name, state);
            }
        }

        // list.sort(new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {

        //         return o2.compareTo(o1);
        //     }
        // });

        List<String> result = new ArrayList<String>(list.keySet());
        Collections.sort(result, Collections.reverseOrder());
        
        for(String name : result) {
            System.out.println(name);
        }

        if(br != null) br.close();
    }
}
