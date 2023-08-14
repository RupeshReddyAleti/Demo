import java.util.*;
public class DemoAdd{
	static public void main(String Arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String s = sc.nextLine();
		System.out.println("Your name is "+s);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		int c = a+b;
		System.out.print("Addition of "+a+" and "+b+" = "+c);
	}
} 