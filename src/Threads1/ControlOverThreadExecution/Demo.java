package Threads1.ControlOverThreadExecution;

class Mythread extends Thread{
    public void run(){
        for(int i=1;i<=10; i++){
            System.out.println("thread is running");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}

public class Demo {
    public static void main(String[] args){
        Mythread t1 = new Mythread();
        t1.start();
        try{
            t1.join();

        }catch(Exception e){}
        for(int i=1; i<=10;i++){
            System.out.println("Main Thread is Running"+i);
            try{
                Thread.sleep(5000);

            }catch(Exception e){}
        }




    }
}
