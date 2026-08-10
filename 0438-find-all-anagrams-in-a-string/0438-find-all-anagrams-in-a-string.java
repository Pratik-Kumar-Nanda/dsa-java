class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] freq = new int[256];

        for (char ch : p.toCharArray()) 
        {
            freq[ch]++;
        }

        int left = 0;
        int right = 0;
        int count = p.length();

        while (right < s.length()) 
        {
            char ch = s.charAt(right);

            if (freq[ch] > 0) {
                count--;
            }

            freq[ch]--;
            right++;

            if (right - left > p.length()) 
            {

                char remove = s.charAt(left);

                if (freq[remove] >= 0) 
                {
                    count++;
                }

                freq[remove]++;
                left++;
            }

            if (right - left == p.length() && count == 0) 
            {
                result.add(left);
            }
        }

        return result;
    }
}