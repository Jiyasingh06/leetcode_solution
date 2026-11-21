class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
       //conevert to lower case
       s = s.toLowerCase();

       //remove non aplhanumeric characters
       s = s.replaceAll("[^a-z0-9]", "");
       //two pointers check if all matches return true else false
       int right =s.length()-1;
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)!=s.charAt(right)) return false;
        right--;
       }
       return true;
    }
}