class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max_sum = Integer.MIN_VALUE;
        int curr_max = 0;
        for(int i=0; i<n; i++){

            curr_max = Math.max(curr_max+nums[i], nums[i]);
            max_sum = Math.max(max_sum, curr_max);
        }
        return max_sum;
    }
}
