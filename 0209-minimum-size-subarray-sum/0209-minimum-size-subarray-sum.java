class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int traverse = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        while(sum >= target || traverse < nums.length)
        {
            if(sum >= target)
            {
                min = Math.min(min, traverse - start);
                sum -= nums[start];
                start++;
            }
            else
            {
                sum += nums[traverse];
                traverse++;
            }
        }

        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}