import java.util.*;
public class Switch{
	public static void main(String Arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n Select your Option");
		int ch = sc.nextInt();
		int result;
		Loop: switch(ch){
		
		case 1:
		result = num1 + num2;
		System.out.println(result);
		break;

		case 2:
		result = num1 - num2;
		System.out.println(result);
		break;

		case 3:
		result = num1*num2;
		System.out.println(result);
		break;

		case 4:
		result = num1/num2;
		System.out.println(result);
		break;

		default:
		System.out.println("Select the valid option");
		}
goto loop;
	}
} 