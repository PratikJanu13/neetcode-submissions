class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max = Integer.MIN_VALUE;
        int  currCap= 0;
        int l=0; 
        int r=n-1;

        while(l<r){
            currCap = (r-l) * Math.min(heights[l],heights[r]);
            if(heights[l] < heights[r]) l++;
            else if (heights[l] > heights[r]) r--;
            else l++;
            max = Math.max(max, currCap);
        }

        return max;
    }
}
