package Arrays.MaximumConsecutiveOnes;

public class Solution {
    public static void main(String args[]){
        int[] arr = {1,1,0,1,1,1,0,1,1};
        int max=0;
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                count++;
                max=Math.max(count,max);
            }
            else{
                count=0;
            }
        }
        System.out.print(max+" is the maximum numbber of times 1 occurred consecutively in the array");
    }
}
