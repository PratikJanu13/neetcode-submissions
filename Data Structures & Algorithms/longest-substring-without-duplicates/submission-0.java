class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap <Character, Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        int res = 0;
        //we're using the sliding window technique

        for(high = 0; high<n; high++){
            
            while(map.containsKey(s.charAt(high))){
                map.remove(s.charAt(low));
                low++;
            }
            map.put(s.charAt(high),1);
            int len = (high-low)+1;
            res = Math.max(res,len);
            
        }
        return res;
    }
}
