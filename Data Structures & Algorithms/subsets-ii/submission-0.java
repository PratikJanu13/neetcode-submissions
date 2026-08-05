class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        generate(nums, 0, res, new ArrayList<>());
        return res;
    }
    public void generate(int[]nums, int index, List<List<Integer>> res, List<Integer> subset ){
        //Base Case
        if(index == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        //pick
        subset.add(nums[index]);
        generate(nums, index+1, res, subset);
        //backtrack
        subset.remove(subset.size()-1);
        //not pick but skip adjacent equal elements
        int nextIndex = index;
        while(nextIndex < nums.length && nums[nextIndex] == nums[index]){
            nextIndex++;
        }
        generate(nums, nextIndex, res, subset);

    }
}
