class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int traverse = 0;
        int longestSubStr = 0;
        
        while(traverse < s.length())
        {
            char ch = s.charAt(traverse);
            Integer prev = map.get(ch);
            if(prev != null)
            {
                left = Math.max(left, prev + 1);
            }

            map.put(ch, traverse);
            longestSubStr = Math.max(longestSubStr, traverse - left + 1);

            traverse++;
        }

        return longestSubStr;
    }
}