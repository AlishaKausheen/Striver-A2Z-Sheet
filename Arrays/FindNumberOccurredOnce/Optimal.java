package Arrays.FindNumberOccurredOnce;

public class Optimal {
    public static void main(String args[]){
        int[] arr ={1,1,2,3,3,4,4};
        int XOR=0;
        for(int i=0;i<arr.length;i++){
            XOR=XOR^arr[i];
        }
        System.out.print(XOR+" is the element that occurred once");
    }
}
