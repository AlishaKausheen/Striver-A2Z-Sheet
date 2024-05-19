public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {6,7,9,8,4,1};
        int num = 8;
        int ans=-1;
        for(int i =0;i< arr.length;i++){
            if(arr[i]== num){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
