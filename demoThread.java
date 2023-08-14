class demo extends Thread{
public void run(){
System.out.println("Hi! I am Thread");
}
}
class demoThread{
public static void main(String arg[]){
demo d1= new demo();
d1.start();
System.out.println(d1.getName());
}}
