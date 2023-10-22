package Arrays.FindNumberOccurredOnce;

public class Better {
    public static void main(String args[]){
        int[] arr={1,1,2,3,3,4,4};
        int max=0;
        for(int i=0;i< arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int[] hash = new int[max+1];
        for(int i=0;i< arr.length;i++){
            hash[arr[i]]+=1;
        }
        for(int i=0;i< arr.length;i++){
            if(hash[arr[i]]==1){
                System.out.print(arr[i]+ " occurred only once");
            }
        }
    }
}
