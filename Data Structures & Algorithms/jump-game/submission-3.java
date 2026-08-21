class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max_reach = 0;
        for(int i=0; i<n; i++){
            //if i crosses the maximum reach of previous jumps return false
            if(i > max_reach) return false; 
            //update max reach
            max_reach = Math.max(max_reach, i + nums[i]);

            if(i >= n-1) return true;
        }
        return false;
    }
}
