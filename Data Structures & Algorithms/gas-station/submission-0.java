class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        if(Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) return -1;
        //an answer definately exists
        int tank = 0;
        int res = 0;
        for(int i=0; i<n; i++){
            tank += gas[i] - cost[i];

            if(tank < 0){ // yahan se aage badhna not possible
              tank = 0; //reset tank
              res = i+1;
            }
        }
        return res;
    }
}
