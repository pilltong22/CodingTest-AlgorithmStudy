

import java.util.Stack;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int a=0;
		
		for(int i=0; i<N ; i++)
		{
			String s = sc.next();
			
			switch (s) {
			case "push":
				a = sc.nextInt();
				stack.push(a);
				break;
				
			case "pop":
				if(stack.isEmpty())
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(stack.pop());
				}
				break;
				
			case "size":
				System.out.println(stack.size());
				break;
				
			case "empty":
				if(stack.isEmpty()==true)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("0");
				}
				break;
				
			case "top":
				if(stack.isEmpty())
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(stack.peek());
				}
				break;
			}
		}
		
	}

}
