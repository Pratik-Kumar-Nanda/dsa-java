class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val1 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int val2 = Integer.MIN_VALUE;
        int cnt2 = 0;
        
        for(int num : nums)
        {
            if(cnt1 == 0 && num != val2)
            {
                cnt1 = 1;
                val1 = num;
            }
            else if (cnt2 == 0 && num != val1)
            {
                cnt2 = 1;
                val2 = num;
            }
            else if (val1 == num)
            {
                cnt1++;
            }
            else if (val2 == num)
            {
                cnt2++;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;

        for(int num : nums)
        {
            if(num == val1)
            {
                cnt1++;
            }
            if(num == val2)
            {
                cnt2++;
            }
        }
        
        int minfreq = nums.length/3;

        if(cnt1 > minfreq)
        {
            ans.add(val1);
        }
        if(cnt2 > minfreq)
        {
            ans.add(val2);
        }
        return ans;
    }
}