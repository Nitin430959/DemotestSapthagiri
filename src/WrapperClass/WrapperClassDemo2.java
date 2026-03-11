package WrapperClass;

//Primitive into object conversation is called boxing
public class WrapperClassDemo2 {
    public static void main(String[] args){
        int x=10;
        Integer obj=new Integer(x);//manual Boxing
        System.out.println("Primitive Val:"+x);
        System.out.println("Object Val:"+obj);
    }
}

//WHICH IS OLD VERSION BOXING WAY
