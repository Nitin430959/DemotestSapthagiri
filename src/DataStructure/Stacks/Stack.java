package DataStructure.Stacks;




public class Stack {
    int[] arr;
    int top;
    int size;


    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;

    }

    void push(int val){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top]=val;
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow!");
            return;
        }
        top--;
    }
    int Top(){
        if(top==-1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top];

    }

    boolean isEmpty(){
        return top==-1;
    }

}


class Driver{
    public static void main(String[] args){
        Stack st = new Stack(5);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(100);



        System.out.println(st.Top());
        st.push(5);
        st.push(6);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();

    }
}
