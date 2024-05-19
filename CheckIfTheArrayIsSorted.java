public class CheckIfTheArrayIsSorted {
    public  static void  main(String [] args){
        boolean ans= true;
        int[] arr = {1,2,1,3,4};
        for(int i=1;i< arr.length;i++){
            if(arr[i]>= arr[i-1]){
            }else{
                ans= false;
            }
        }
        System.out.println(ans);
    }
}
