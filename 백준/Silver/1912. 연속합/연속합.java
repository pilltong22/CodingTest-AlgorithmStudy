

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n= Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] prefix = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        
        int max = arr[0];

        for(int i=0; i<n; i++) {
            if(prefix[i]+arr[i] < arr[i]) {
                prefix[i+1]=arr[i];
            }
            else 
                prefix[i+1] = prefix[i] + arr[i] ;

        }

        for (int i=1; i<= n; i++) {
            if(prefix[i]>max)
                max=prefix[i];
        }


    System.out.println(max);

    }
}
