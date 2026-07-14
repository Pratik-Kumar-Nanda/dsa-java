class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if(nums[start] < nums[end])
        {
            return nums[start];
        }
        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid+1])
            {
                return nums[mid+1];
            }
            else if (mid > start && nums[mid] < nums[mid-1])
            {
                return nums[mid];
            }
            else if(nums[start] == nums[mid] && nums[mid] == nums[end])
            {
                if(start < end && nums[start] > nums[start+1])
                    return nums[start+1];
                start++;
                if(end > start && nums[end] < nums[end-1])
                    return nums[end];
                end--;
            }
            else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[end] < nums[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return nums[0];
    }
}