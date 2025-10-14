import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Scanner sc = new Scanner(System.in);
        int N;
        N= Integer.parseInt(sc.next());
        for(int i=0; i<N;i++) {
            int t = sc.nextInt();
            if(t==0 && pq.isEmpty()) {
                System.out.println("0");
            }
            else if(t==0) {
                System.out.println(pq.poll());
            }

            else {
                pq.offer(t);
            }
        }
    }
}
