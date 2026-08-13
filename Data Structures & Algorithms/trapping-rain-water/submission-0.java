class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l=0;
        int r=n-1;
        int l_max = Integer.MIN_VALUE;
        int r_max = Integer.MIN_VALUE;
        int water = 0;

        while(l<=r){
            if(height[l] < height[r]){
                if(height[l]>l_max) l_max = height[l];
                else water += l_max - height[l];
                l++;
            }
            else{
                if(height[r]>r_max) r_max = height[r];
                else water += r_max - height[r];
                r--;
            }            
        }
        return water;
    }
}
