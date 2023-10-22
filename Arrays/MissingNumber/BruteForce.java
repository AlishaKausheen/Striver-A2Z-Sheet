package Arrays.MissingNumber;

public class BruteForce {
    public static void main(String args[]){
        int arr[] = {1,2,4,5};
        for(int i=1;i< arr.length;i++){
            int flag=0;
            for (int j=0;j< arr.length;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.print(i+" is missing");
        }
    }
}
