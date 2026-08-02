class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int []s1count = new int[26];
       int []windowcnt = new int [26];

       if(s1.length() > s2.length()) return false;

       for(int i=0; i< s1.length(); i++){
        s1count[s1.charAt(i) - 'a']++;
        windowcnt[s2.charAt(i) - 'a']++;
       }
       if(Arrays.equals(s1count, windowcnt)) return true;
       int low = 0;

       for(int i=s1.length(); i<s2.length(); i++){
        windowcnt[s2.charAt(i) - 'a']++;
        windowcnt[s2.charAt(low) - 'a']--;
        low++; 
        
        if(Arrays.equals(s1count, windowcnt)) return true;
       }

       return false;
    }
}
