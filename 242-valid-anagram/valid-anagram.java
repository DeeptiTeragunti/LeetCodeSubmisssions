import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;   // quick reject, avoids sorting mismatched lengths

        int[] cnt = new int[26];
         
        for(int i = 0 ; i < s.length(); i++ )
        {
            cnt[s.charAt(i)-'a']++;
            cnt[t.charAt(i)-'a']--;
        }
         for(int num : cnt)
         {
             if(num != 0 )
             {
                return false;
             }
         }
         return true ; 
    }
}