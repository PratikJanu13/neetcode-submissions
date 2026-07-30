class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] ans = new int[2];
        int n = numbers.length;
        int l = 0; 
        int r = n-1;        
        while(l<r){
            int sum = numbers[l] + numbers[r];
            if(sum < target) l++;
            else if(sum > target) r--;
            else {
                ans[0] = l+1;
                ans[1] = r+1;
                break;

            }
        }
        return ans;
    }
}
