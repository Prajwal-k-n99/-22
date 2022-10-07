class MyThread1 extends java.lang.Thread{
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("My cooking Thread is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class MyThread2 extends java.lang.Thread{
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("My cooling Thread is delayed");
            System.out.println("I am sad!");
            i++;
        }
    }
}
public class Thread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        t1.setPriority(7);
        t2.setPriority(3);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
