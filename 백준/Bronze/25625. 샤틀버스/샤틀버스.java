
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    int x =0;
    int y =0;
    Scanner sc = new Scanner(System.in);

    x=sc.nextInt();
    y=sc.nextInt();

    if(x>= y)
    {
        System.out.println(x+y);
    }
    else {
        System.out.println(y-x);
    }

    }
}
