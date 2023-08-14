class demo implements Runnable {
public void run(){
System.out.println("Hi! I am Thread");
}
}
class demoRunnable{
public static void main(String arg[]){
demo d1= new demo();
Thread t1 = new Thread(d1
d1.start();
System.out.println(d1.getName());
}}