class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []A = new int[2];
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i],i);
        }
        for(int i=0; i<n; i++){
           int complement = target - nums[i];
           if(map.containsKey(complement) && map.get(complement)!=i){
            A[0] = i;
            A[1] = map.get(complement);
            break;
           }
        }
        return A;
    }
}
