class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int val = nums[0];
        
        for(int i = 1; i < nums.length; i++)
        {
            if(count == 0)
            {
                count = 1;
                val = nums[i];
            }
            else if(val == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return val;
    }
}