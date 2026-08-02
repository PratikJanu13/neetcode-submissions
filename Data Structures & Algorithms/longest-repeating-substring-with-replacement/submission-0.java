class Solution {
    public int characterReplacement(String s, int k) {
        HashMap <Character, Integer> map = new HashMap<>();
        int n = s.length();
        int low = 0;
        int res = 0;
        //using sliding window
        for(int high = 0; high < n; high++){
            char c = s.charAt(high);
            map.put(c, map.getOrDefault(c,0)+1);
            int len = high - low + 1;
            int maxcnt = helper(map);
            int diff = len - maxcnt;
            //galat hai
            while( diff > k){
                map.put(s.charAt(low) , map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low)) == 0) map.remove(s.charAt(low));
                low ++;
                maxcnt = helper(map);
                len = high - low + 1;
                diff = len - maxcnt;
            }
            //sahi hai
            len = high - low + 1;
            res = Math.max(res, len);
        }
        return res;

    }

    public int helper(HashMap<Character, Integer> map){
        int ans = -1;
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > ans) ans = entry.getValue();
        }
        return ans;
    }
}
