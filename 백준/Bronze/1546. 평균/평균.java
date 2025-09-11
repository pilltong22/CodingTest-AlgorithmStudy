

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    int N;
    ArrayList<Double> score=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    N=sc.nextInt();


    for(int i=0;i<N;i++)
    {
        score.add(sc.nextDouble());
    }

    double M = Collections.max(score);

    for(int i=0;i<N;i++)
    {
        double k = (((double)score.get(i))/M)*(100);
        score.set(i,k);
    }

    double avg =0.0;
    double sum = 0.0;

    for(int i=0;i<N;i++)
    {
        sum+=score.get(i);
    }

        System.out.println(sum/N);

    }
}
