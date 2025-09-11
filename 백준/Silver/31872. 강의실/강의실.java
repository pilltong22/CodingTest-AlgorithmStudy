
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int N;
        int K;
        int answer=0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        List<Integer> l = new ArrayList<>();
        List<Integer> dis = new ArrayList<>(); //강의실 사이의 거리 배열


        for(int i = 0; i < N; i++){
            l.add(sc.nextInt());
        }
        Collections.sort(l);

        for(int i=0; i < N-1; i++){
            dis.add(l.get(i+1)-l.get(i));
        }

        dis.add(l.get(0));

        Collections.sort(dis,Collections.reverseOrder());

        for(int i=K; i< dis.size(); i++)
        {
            answer += dis.get(i);
        }


        System.out.println(answer);
    }
}
