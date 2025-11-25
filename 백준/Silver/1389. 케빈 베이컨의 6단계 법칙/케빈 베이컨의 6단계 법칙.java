import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int N;
    static int M;
    static int[][] graph;

    // start번 사람의 케빈 베이컨 수(거리 합) 계산

    static int bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[N+1];
        int[] dist = new int[N+1];
        q.offer(start);
        visited[start] = true;
        dist[start] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            // 현재 노드에서 연결된 모든 노드 탐색
            for(int i=1; i<=N; i++) {
                if(graph[cur][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    dist[i] = dist[cur] + 1;
                    q.offer(i);
                }
            }
        }

        int sum=0;
        for(int i=1; i<=N; i++) {
            sum+=dist[i];
        }

        //System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int a,b;


        graph = new int[N+1][N+1];

        for(int i=1; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());

            graph[a][b]=1;
            graph[b][a]=1;
        }


        int min=Integer.MAX_VALUE;
        int ans=0;

        for(int i=1; i<=N; i++){
            int sum = bfs(i);
            if(sum<min) {
                min = sum;
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
