import java.util.*;
public class demoTable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int a = sc.nextInt();
		int i = 1;
		int b =a;
		while(i<=10){
		b=a*i;
		System.out.println(b);
		i++;
		}
	}		
}