import java.io.*;
import java.util.*;

public class Main {

    static boolean[] visit;
    static int[][] arr;
    static int node, line, start;
    static Queue<Integer> que = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node + 1][node + 1];
        visit = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        dfs(start);
        sb.append('\n');

        Arrays.fill(visit, false);
        bfs(start);

        System.out.print(sb.toString());
    }

    private static void dfs(int v) {
        visit[v] = true;
        sb.append(v).append(' ');
        for (int i = 1; i <= node; i++) {
            if (arr[v][i] == 1 && !visit[i]) dfs(i);
        }
    }

    private static void bfs(int s) {
        que.offer(s);
        visit[s] = true;
        while (!que.isEmpty()) {
            int cur = que.poll();
            sb.append(cur).append(' ');
            for (int i = 1; i <= node; i++) {
                if (arr[cur][i] == 1 && !visit[i]) {
                    visit[i] = true;      // enqueue 시 방문체크
                    que.offer(i);
                }
            }
        }
    }
}
