
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visit;
    static int[][] map;
    static int count;
    static int node, edge;

    public static void main(String[] args) {

        //count = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            node = Integer.parseInt(br.readLine());
            edge = Integer.parseInt(br.readLine()); //노드,간선 입력
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        map = new int[node +1][node +1];
        visit = new boolean[node +1];

        for(int i=1; i<= edge ; i++) {
            StringTokenizer st2 =null;
            try {
                st2 = new StringTokenizer(br.readLine()," ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

           map[b][a]= map[a][b] = 1;
        }

        dsf(1);

        System.out.println(count);
    }

    private static void dsf(int start) {

        visit[start] = true;

        for(int i=1 ; i<=node ; i++) {
            if(map[start][i] == 1 && !visit[i]) {
                dsf(i);
                count++;
            }
        }

    }

}
