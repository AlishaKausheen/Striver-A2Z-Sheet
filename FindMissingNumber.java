public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;
        System.out.println(brute(arr,n));
        System.out.println(better(arr,n));
        System.out.println(optimal1(arr,n));
        System.out.println(optimal2(arr,n));
    }
    //tc: o(n*n) sc: o(1)
    static  int brute(int[] arr, int n){
        int ans=-1;
        for(int i=1;i<n;i++){
            int flag=0;
            for (int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                ans=i;
                return ans;
            }
        }
        return ans;
    }
    //tc:o(n+n) sc: o(n)
    static int better(int[] arr, int n){
        int ans=-1;
        int[] hash = new int[n+1];
        for(int i=0;i<n-1;i++){
            hash[arr[i]]=1;
        }
        for(int i =1;i<=n;i++){
            if(hash[i]==0){
                ans=i;
            }
        }
       return ans;
    }

    //tc:o(n) sc:o(1)
    static  int optimal1(int[] arr, int n){
        int sum=n*(n+1)/2;
        int s2=0;
        for(int i=0;i<n-1;i++){
            s2+=arr[i];
        }
        return sum-s2;
    }

    static int optimal2(int[] arr, int n){
        int xor1=0;
        int xor2=0;
        for (int i=0;i<n-1;i++){
            xor2 = xor2^arr[i];
            xor1 = xor1^(i+1);
        }
        xor1 = xor1^n;
        return xor1^xor2;
    }
}
