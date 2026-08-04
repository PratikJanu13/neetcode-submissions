class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        generate(nums, 0, res);
        return res;
    }

    public void generate(int[]nums, int index, List<List<Integer>>result){
        //Base case
        if(index == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                ds.add(nums[i]);
            }
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index; i<nums.length; i++){
            swap(nums, index, i);
            generate(nums, index+1, result);
            swap(nums, index, i);
        }
    }
    public void swap(int []nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
