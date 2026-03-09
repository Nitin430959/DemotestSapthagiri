package Threads1.Synchronization;

class Counter{
    static int count=0;
     synchronized static void increment(){
        count++;
    }
}
class Mythread extends Thread{
    public void run(){
        for(int i=1; i<1000; i++){
            Counter.increment();
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        t1.start();
        t2.start();
        try {

            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        System.out.println("Final Count:" + Counter.count);
    }
}
