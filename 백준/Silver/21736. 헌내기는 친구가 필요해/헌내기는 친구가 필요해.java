
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static char[][] map;
    static boolean[][] visit;
    static int[] dirX = {1, 0, -1,0};
    static int[] dirY = {0, 1, 0, -1};
    static int N, M;
    static int cnt=0;
    public static void main(String[] args) throws IOException {

        int startX=0;
        int startY=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        visit = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j);
                if(map[i][j] == 'I') {
                    startX=i;
                    startY=j;
                }
            }
        }

        dsf(startX,startY);

        if(cnt==0) {
            System.out.println("TT");
        } else {
            System.out.println(cnt);
        }
    }

    static public void dsf(int x,int y) {

        visit[x][y] = true;

        if(map[x][y]=='P') {
            cnt++;
        }

        for(int i=0;i<4; i++) {
            int nx = x+dirX[i];
            int ny = y+dirY[i];
            //System.out.println("x= "+x + " y= "+y + " nx= "+nx+" ny = "+ ny);
            if(nx>=0 && ny>=0 && nx<=N-1 && ny<=M-1 && !visit[nx][ny] && map[nx][ny]!='X') {

                dsf(nx,ny);
            }

        }

    }
}
