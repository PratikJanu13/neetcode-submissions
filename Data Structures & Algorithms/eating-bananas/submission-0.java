class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxel = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxel = Math.max(maxel, piles[i]);
        }
        int l = 1;
        int r = maxel;
        int res = maxel; //max banana koko can per hr
        while(l <= r){
            int k = Math.floorDiv((l+r),2);

            int hours = 0;
            for(int p : piles){
                hours += Math.ceil((double) p/k);
            }
            if(hours <= h){
                res = Math.min(res, k);
                r = k-1;
            }
            else l = k+1;
        }
        return res;
    }
}
