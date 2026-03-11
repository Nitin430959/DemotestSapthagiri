package SearchingSorting;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr={10,2,7,1,18,20,11};
        int find=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==18){
                System.out.println("found num is:"+i);
            }
        }
    }
}
