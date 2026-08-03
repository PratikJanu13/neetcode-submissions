class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List <List<Integer>> result = new ArrayList<>();
        generate(0,new ArrayList<>(),nums,result);
        return result;
    }
    //Pick / Not Pick approach-

    public void generate(int index, List<Integer> subset, int[]nums, List<List<Integer>> result){
        //Base Case
        if(index == nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        //Pick
        subset.add(nums[index]);
        generate(index+1, subset, nums, result);
        //BackTrack
        subset.remove(subset.size()-1);
        //Not Pick
        generate(index+1, subset, nums, result);
    }
}
