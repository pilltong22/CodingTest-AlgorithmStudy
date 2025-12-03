import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int N;
    static int K;
    static int MAX=100000;


    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[MAX+1];
        int[] dist = new int[MAX+1];
        q.offer(start);
        visited[start] = true;
        dist[start] = 0;

        while (!q.isEmpty()) {
            int x = q.poll();

            if(x == K) {
                System.out.println(dist[x]);
                return;
            }

            int[] next = {x-1, x+1, x*2};

            for (int i=0; i<3; i++) {
                int nx = next[i];

                if(nx >=0 && nx<=MAX && !visited[nx]) {
                    visited[nx] = true;
                    dist[nx] = dist[x]+1;
                    q.add(nx);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        bfs(N);


    }
}
