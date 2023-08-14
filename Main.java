interface Myinterface{
	void abstract_func(int x,int y);
	default void default_Fun(){
		System.out.println("This is default method");
		}
}

class Main{
public static void main(String args[]){
//lambda expression
Myinterface fobj =(int x,int y) -> System.out.println(x+y);
fobj.abstract_func(5,5);
fobj.default_Fun();
}}