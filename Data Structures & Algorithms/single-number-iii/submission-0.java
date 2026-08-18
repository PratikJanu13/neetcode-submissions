class Solution {
    public int[] singleNumber(int[] nums) {
        int xor_all = 0;

        for(int val : nums){
            xor_all ^= val;
        }
        //get the rightmost set bit which makes he diff
        int diff_bit = xor_all & -(xor_all);
        //divide numbers which have  the diff_bit set and not set
        int a = 0;
        int b = 0;
        for(int val : nums){
            if((val & diff_bit) != 0) a ^= val;
            else b ^= val;
        }

        int []res = new int[2];
        res[0] = a;
        res[1] = b;
        
        return res;
    }
}