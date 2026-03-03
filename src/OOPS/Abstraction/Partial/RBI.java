package OOPS.Abstraction.Partial;

import java.sql.SQLOutput;

abstract class RBI {
    abstract int ROI();
}
class HDFC extends RBI{
    int ROI(){
        return 4;
    }
}
class SBI extends RBI{
    int ROI(){
        return 5;
    }
}
class hse{
    public static void main(String[] args){
        HDFC a = new HDFC();
        System.out.println("HDFC:"+ a.ROI());
        SBI b = new SBI();
        System.out.println("SBI:"+ b.ROI());

    }
}
