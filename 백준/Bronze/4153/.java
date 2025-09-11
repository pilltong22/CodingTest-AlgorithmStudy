import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) continue;
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            int[] arr = {a, b, c};
            Arrays.sort(arr); // arr[0] <= arr[1] <= arr[2]
            int x = arr[0], y = arr[1], z = arr[2];

            if (x * x + y * y == z * z) sb.append("right\n");
            else sb.append("wrong\n");
        }

        System.out.print(sb.toString());
    }
}
