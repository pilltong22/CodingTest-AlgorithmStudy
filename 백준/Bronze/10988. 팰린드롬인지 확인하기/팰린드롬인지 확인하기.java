

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str=br.readLine();
        String str1;
        str1=str.toUpperCase();

        int lt = 0;
        int rt = str1.length()-1;
        int check=0;

        while(lt<rt){
            if(str1.charAt(lt)!=str1.charAt(rt)){
                System.out.println("0");
                check=1;
                return;
            }
            lt++;
            rt--;
        }
        if(check==0)
            System.out.println("1");

    }
}
