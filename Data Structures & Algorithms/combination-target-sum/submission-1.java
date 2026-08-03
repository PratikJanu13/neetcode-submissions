class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, 0, target, result, new ArrayList<>());
        return result;
    }



    public void generate(int[] nums, int index, int amt,List<List<Integer>> result, List<Integer> subset ){
        //Base Case 1 
        if(amt == 0){
            result.add(new ArrayList<>(subset));
            return;
        }
        //Base Case 2 if all coins are exhausted and target not acheived
        if(index == nums.length || amt<0){
            return;//do nothing
        }
        //pick the current element
        subset.add(nums[index]);
        generate(nums, index, amt-nums[index], result, subset);
        //backtrack
        subset.remove(subset.size()-1);
        //move to the next coin
        generate(nums, index+1, amt, result, subset);


    }
}
