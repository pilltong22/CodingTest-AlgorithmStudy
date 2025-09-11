import java.io.*;
import java.util.*;

public class Main {
    static int N, M, R;
    static List<Integer>[] g;
    static boolean[] vis;
    static int[] order;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        g = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) g[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            g[a].add(b);
            g[b].add(a);
        }

        // 정점 번호가 작은 것부터 방문
        for (int i = 1; i <= N; i++) Collections.sort(g[i]);

        vis = new boolean[N + 1];
        order = new int[N + 1];

        bfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) sb.append(order[i]).append('\n');
        System.out.print(sb.toString());
    }

    static void bfs(int start) {
        int seq = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        vis[start] = true;
        order[start] = ++seq;
        q.add(start);

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : g[u]) {
                if (!vis[v]) {
                    vis[v] = true;
                    order[v] = ++seq; // “정점 v의 방문 순서”
                    q.add(v);
                }
            }
        }
    }
}
