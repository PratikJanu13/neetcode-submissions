class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        int n = nums.length;
         for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
        int longest = 1;
        if(nums.length == 0) return 0;

        for(int val:set){
            if(!set.contains(val-1)){
                int x = val;
                int cnt = 1;
                while(set.contains(x+1)){
                    cnt ++;
                    x = x+1;
                }
                longest = Math.max(longest, cnt);
            }
            
        }

        return longest;



    }
}
