class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length)
        {
            if(nums[i] < nums.length && nums[i] != nums[nums[i]])
            {
                swap(nums, i , nums[i]);
            }
            else
            {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++)
        {
            if(nums[i] != i)
                return i;
        }
        return nums.length;
    }
    private void swap(int[] nums, int first, int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}