interface DemoInt{
 void show();
}
public class DemoLF{
public static void main(String args[]){
DemoInt di = ()-> System.out.println("Hi Welcome to session");
di.show();
}
}