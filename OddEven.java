import java.util.*;
public class OddEven{
	public static void main(String Arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num%2 == 0){
			System.out.println("The number is even");
		}
		else{
			System.out.println("The number is odd");
		}
	}
} 