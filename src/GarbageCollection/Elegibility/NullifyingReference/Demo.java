package GarbageCollection.Elegibility.NullifyingReference;

public class Demo {
    // this finalized function will only get called when System.gc() is called
    //But that too it depends on JVM when to collect garbage and when to leave
    //so we cant predict that how many times the garbage is collectd
    public void finalize(){
        System.out.println("Garbage Collection");
    }

    public static void main(String[] args){
        for(int i=0; i<10000; i++){
                Demo obj = new Demo();
                obj=null;
        }
        System.gc();//call Garbage collector
    }
}
