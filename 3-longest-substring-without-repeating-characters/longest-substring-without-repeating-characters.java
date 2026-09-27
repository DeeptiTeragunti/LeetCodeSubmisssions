class Solution {
    public int lengthOfLongestSubstring(String s) {


        // BF APPROACH 
         // CALC LEN ON STRING 
         // MOVE I TO J 
         // J WILL KEEP TRACK OF LENGTH 
         // ITERATE AND FIND SUBSTRING TILL U FOUND DUPLICATE , THEN BREAK THEN MOVE I 
         // USE A HASHMAP OR A SET TO KEEP TRACK IF IN SET BREAK ELSE ADD TO SET 
         //
        int maxLength = 0 ; 

        for( int i = 0 ; i < s.length(); i ++)
        {
             Set<Character> set = new HashSet<>();
            for( int j = i ; j < s.length(); j ++)
            {
                //set 
         
                char ch = s.charAt(j);

            // condition 
               if(set.contains(ch))
            {
                break;
            }
            else
            {
                set.add(ch);
                //update max length 
                maxLength = Math.max(maxLength , j-i+1);
            }
            }
        }

        return maxLength;
    }
}