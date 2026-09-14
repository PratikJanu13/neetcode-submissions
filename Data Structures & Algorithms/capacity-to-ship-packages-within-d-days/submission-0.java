class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int res = 0;
        for(int val : weights){
            res = Math.max(res, val);
        }

        while(true){
            int ships = 1;
            int cap = res;

            for(int weight : weights){
                if(cap - weight < 0){
                    ships++;
                    cap = res;
                }
                cap -= weight;
            }
            if(ships <= days){
                return res;
            }
            res ++;
        }
    }
}