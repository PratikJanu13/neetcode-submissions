class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        generate(0,candidates,0,target, new ArrayList<>(), result);
        return result;
    }


    public void generate(int index, int[]candidates,int sum, int target,List<Integer>subset, List<List<Integer>> result){
        //Base Case
        if(sum == target){
            result.add(new ArrayList<>(subset));
            return;
        }
        //base case 2
        if(index == candidates.length || sum > target){
            return;
        }
        //pick
        subset.add(candidates[index]);
        generate(index+1, candidates, sum+candidates[index], target, subset, result);
        //backtrack
        subset.remove(subset.size()-1);
        //not pick
        int nextIndex = index;
        while (nextIndex < candidates.length && candidates[nextIndex] == candidates[index]) {
            nextIndex++;
        }
        generate(nextIndex, candidates, sum, target, subset,result);
    }
}
