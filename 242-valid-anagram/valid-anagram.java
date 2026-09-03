import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;   // quick reject, avoids sorting mismatched lengths

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);   // compares char arrays directly — no String conversion needed
    }
}