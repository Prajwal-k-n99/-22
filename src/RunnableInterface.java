class t1 implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}
class t2 implements Runnable{
    public void run(){
        System.out.println("Thread is delayed");
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        t1 obj1 = new t1();
        java.lang.Thread d1 = new java.lang.Thread(obj1);
        t2 obj2 = new t2();
        java.lang.Thread d2 = new java.lang.Thread(obj2);
        d1.start();
        d2.start();
    }
}
