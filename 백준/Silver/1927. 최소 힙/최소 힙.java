import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());


        for(int i = 0; i < N; i++){
            int tmp =  Integer.parseInt(br.readLine());
            if(tmp>=1) {
                pq.offer(tmp);
            }
            else if(tmp == 0) {
                if(pq.isEmpty()){
                    System.out.println("0");
                }
                else {
                    System.out.println(pq.poll());
                }
            }
        }

        
    }
}
