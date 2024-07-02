public class TrappingRainWater {
    public int basic(int[] height) {
        int trapWater=0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int[] minLR= new int[height.length];
        maxLeft[0]=height[0];
        maxRight[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            maxLeft[i]= Math.max(height[i],maxLeft[i-1]);
        }
        for(int i=height.length-2;i>=0;i--){
            maxRight[i]= Math.max(height[i],maxRight[i+1]);
        }
        for(int i=0;i<height.length;i++){
            minLR[i]= Math.min(maxLeft[i],maxRight[i]);
            if(minLR[i]-height[i]>0)
                trapWater+=(minLR[i]-height[i]);

        }


        return trapWater;
    }
    public int optimal(int[] height) {
        int l=0,r=height.length-1;
        int leftMax=height[l],rightMax=height[r];
        int trapWater=0;
        while(l<r){
            if(leftMax<rightMax){
                l+=1;
                leftMax=Math.max(leftMax,height[l]);
                trapWater+=(leftMax-height[l]);
            }else{
                r-=1;
                rightMax=Math.max(rightMax,height[r]);
                trapWater+=(rightMax-height[r]);
            }
        }
        return trapWater;
    }
}
