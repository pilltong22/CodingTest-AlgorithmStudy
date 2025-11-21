import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static int cnt_white=0;
    static int cnt_blue=0;

    static public boolean finish(int [][]arr, int start_x,  int start_y, int end_x, int end_y,int size){

        //System.out.println(start_x+","+start_y+","+end_x+","+end_y+","+size);

        int color = arr[start_y][start_x];

        for(int i=start_y;i<=end_y;i++) {
            for(int j=start_x;j<=end_x;j++) {

                if(color!=arr[i][j]) {
                    return false;
                }
            }
            }



        if(arr[start_y][start_x]==1) {  // 파란색일때
            cnt_blue++;
        }
        else {
            cnt_white++;
        }

        return true;
    }

    static public void cut(int [][]arr, int start_x,  int start_y, int end_x, int end_y,int size) {
        if(size<=1) {
            if(arr[start_y][start_x]==1) {
                cnt_blue++;
            }
            else {
                cnt_white++;
            }
            return;
        }
        else {
            if (finish(arr, start_x, start_y, end_x, end_y, size) == true) {
                return;
            }
        }

        int mid_x = start_x+ (end_x-start_x)/2;
        int mid_y = start_y+ (end_y-start_y)/2;


        cut(arr,start_x,start_y,mid_x,mid_y,size/2);
        cut(arr,mid_x+1,start_y,end_x,mid_y,size/2);
        cut(arr,start_x,mid_y+1,mid_x,end_y,size/2);
        cut(arr,mid_x+1,mid_y+1,end_x,end_y,size/2);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [][]arr = new int[N][N];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cut(arr,0,0,N-1,N-1,arr.length);

        System.out.println(cnt_white);
        System.out.println(cnt_blue);
    }
}
