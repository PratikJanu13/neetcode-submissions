class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            arr.add(new int[] {entry.getValue() , entry.getKey()});  //adding frequency and number
        }
        arr.sort((a,b) -> b[0]-a[0]); //sorting the arraylist according to the first element i.e. frequency

        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = arr.get(i)[1];  //putting the second element from each array into the result
        }
        return res;
    }
}
