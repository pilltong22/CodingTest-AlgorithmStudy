
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        int N = 0;

        Scanner sc = new Scanner(System.in);

        String[] arr= new  String[3];

        for (int i = 0; i < 3; i++) {
            arr[i]=sc.next();
        }


        for (int i = 0; i < 3; i++) {
            if(isNumeric(arr[i]))
            {
                N = Integer.parseInt(arr[i])+(3 -i);
            }
        }


        if(N%3==0 && N%5==0) {
            System.out.println("FizzBuzz");
        }
        else if(N%3==0 || N%5==0){
            if(N%3==0) {
                System.out.println("Fizz");
            }
            else if(N%5==0) {
                System.out.println("Buzz");
            }
        }
        else {
            System.out.println(N);
        }




    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);   // 또는 Double.parseDouble(str)
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

