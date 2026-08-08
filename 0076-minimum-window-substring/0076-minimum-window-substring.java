class Solution {
    public String minWindow(String s, String t) {

        if(t.length() > s.length())
        {
            return "";
        }

        int[] freq = new int[256];
        int minlength = Integer.MAX_VALUE;
        int startIndex = -1;
        int right = 0;
        int count = 0;
        int left = 0;

        for(char ch : t.toCharArray())
        {
            freq[ch]++;
        }

        while(right < s.length())
        {
            char ch = s.charAt(right);

            if(freq[ch] > 0)
            {
                count++;
            }
            freq[ch]--;

            while(count == t.length())
            {
                if(right - left + 1 < minlength)
                {
                    minlength = right - left + 1;
                    startIndex = left;
                }

                char chr = s.charAt(left);

                freq[chr]++;

                if(freq[chr] > 0)
                {
                    count--;
                }
                
                left++;
            }
            right++;
        }

        if (startIndex == -1) 
        {
            return "";
        }

        return s.substring(startIndex, startIndex + minlength);
    }
}