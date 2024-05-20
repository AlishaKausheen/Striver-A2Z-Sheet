public class FindTheNumberThatAppearOnce {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(brute(arr));
        System.out.println(better(arr));
        System.out.println(optimal(arr));
    }
    //tc:o(n*n) sc:o(1)
    static int brute(int[] arr){
         int ans=-1;
        for (int i=0;i< arr.length;i++){
            int num= arr[i];
            int count=0;
            for (int j=0;j< arr.length;j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if(count==1){
                ans= num;
            }
        }
        return ans;
    }
    //tc: o(n+n+n) sc: o(maxi+1)
    static int better(int[] arr){
        int maxi=0;
        int ans=-1;
        for(int i=0;i< arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        int[] hash = new int[maxi+1];
        for(int i=0;i< arr.length;i++){
            hash[arr[i]]++;
        }
        for (int i=0;i< arr.length;i++){
            if(hash[arr[i]]==1)
                ans=arr[i];
        }
        return ans;
    }
    //tc:o(n) sc: o(1)
    static  int optimal(int[] arr){
        int xor =0;
        for (int i=0;i< arr.length;i++){
            xor = xor^arr[i];
        }
        return xor;
    }
}
