package Arrays.LinearSearch;

public class solution {
 public static void main(String args[]){
  int[] arr = {1,6,4,9,2,7,11,5};
  int n= 2;
  for (int i=0;i< arr.length;i++){
   if(arr[i]==n){
    System.out.print("The number "+n+" is present at "+i+ " locationn");
    break;
   }
  }
 }
}
