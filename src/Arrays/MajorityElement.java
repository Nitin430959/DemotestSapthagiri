package Arrays;

public class MajorityElement {
    public static void main(String[] args){
        int[] arr={2,2,1,1,3,3,2};
        int n=arr.length;
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    count++;
                }if(count>n/2) {
                    System.out.println("Majority Element is:" + arr[i]);
                }else{
                    System.out.println("No Majority Elements Found");
                }
            }
        }
    }
}
