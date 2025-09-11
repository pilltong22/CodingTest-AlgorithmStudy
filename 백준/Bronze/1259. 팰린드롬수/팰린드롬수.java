

import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag=false;

        while(true) {
            int i=0;
            String r = input.nextLine();
            if(r.equals("0"))
                return;

            while(true) {
                if(r.charAt(i) != r.charAt(r.length()-i-1)) {
                    System.out.println("no");
                    flag=false;
                    break;
                }
                if(i>= r.length()-i-1) {
                    System.out.println("yes");
                    break;
                }
                i++;
            }

        }



    }
}

