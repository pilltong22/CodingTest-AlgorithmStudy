import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception{

        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        int x,y;
        int[][] arr= new int[N][2];
        int [] rank = new int[N];
        int k=1;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            arr[i][0]=x;
            arr[i][1]=y;
            rank[i]=k;
        }

        for(int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if(arr[i][0]>arr[j][0] && arr[i][1]>arr[j][1]){
                    rank[j]++;
                }
            }
        }

        for(int i=0; i<N; i++) {
            System.out.print(rank[i]+" ");
        }


    }
}
