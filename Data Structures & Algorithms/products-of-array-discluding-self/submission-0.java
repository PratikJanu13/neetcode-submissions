class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int []ans = new int[n];
        int prodleft = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                prodleft = prodleft * nums[j];
            }
            ans[i] = prodleft;
            prodleft = 1;
        }
        int prodright = 1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                prodright = prodright * nums[j];
            }
            int temp = ans[i];
            ans[i] = temp * prodright;
            prodright=1;
        }
        return ans;
    }
}  
