class Solution {
    public int maxArea(int[] height) {
        int maxWater=0;
        int lp=0;
        int rp=height.length-1;

        while(lp<rp){
           final int minheight=Math.min(height[lp],height[rp]);
  //          int h=Math.min(height[lp],height[rp]);
//int currWater=w*h;
            maxWater=Math.max(maxWater,minheight*(rp-lp));
            if(height[lp]<height[rp]){
                ++lp;
            }
            else{
                --rp;
            }
            
            }
        return maxWater;
    }
}