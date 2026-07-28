class Solution {
    public boolean isAnagram(String s, String t) {
      int []hash1 = new int[123];
      int []hash2 = new int[123];
      int n= s.length();
      int m = t.length();
      //for first string
      for(int i=0; i<n; i++){
        hash1[s.charAt(i)]++;
      }
      //for second string
      for(int i=0; i<m; i++){
        hash2[t.charAt(i)]++;
      }

      //now comparing both hash-tables
      for(int i=0; i<123; i++){
        if(hash1[i] != hash2[i]) return false;
      }
      return true;
    }
}
