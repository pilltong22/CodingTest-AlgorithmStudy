import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        boolean[] returned = new boolean[N + 1]; // 1~N
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < R; i++) {
            int num = Integer.parseInt(st.nextToken());
            returned[num] = true;
        }

        StringBuilder sb = new StringBuilder();
        boolean allReturned = true;
        for (int i = 1; i <= N; i++) {
            if (!returned[i]) {
                sb.append(i).append(" ");
                allReturned = false;
            }
        }

        if (allReturned) {
            System.out.println("*");
        } else {
            System.out.println(sb.toString());
        }
    }
}
