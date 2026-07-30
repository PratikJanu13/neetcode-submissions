class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;

        while(l<r){
            Character leftchar = s.charAt(l);
            Character rightchar = s.charAt(r);

            if(!Character.isLetterOrDigit(leftchar)) l++;
            else if(!Character.isLetterOrDigit(rightchar)) r--;
            else{
                if(Character.toLowerCase(leftchar) != Character.toLowerCase(rightchar)) return false;
                l++;
                r--;
            }
        }

        return true;
    }
}
