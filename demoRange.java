import java.util.*;
public class demoRange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
System.out.println("enter the lower range");
int l = sc.nextInt();
System.out.println("enter the upper range");
int u = sc.nextInt();

for(int j =l;j<=u;j++){
if(j%2 ==0){
System.out.println(j);
}
}
}
}