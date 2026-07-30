class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n==0) return 0;

        Arrays.sort(nums);
        int counter = 1;
        int ans = 1;
        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]) continue;
            ans = Math.max(ans, counter);
            if(nums[i+1] == nums[i]+1) counter++;
            else  counter = 1; //reset
        }

        return Math.max(ans,counter);

    }
}
