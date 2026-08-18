class Solution {
    public int hammingWeight(int n) {
        // we use Brain Kernighan's Algo i.e n & (n-1)-

        int counter = 0;
        while(n > 0){
            n = n & (n-1);
            counter++;
        }
        return counter;
    }
}
