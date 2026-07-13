class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = PivotElement(nums);
        if(pivot == -1)
        {
            return BinarySearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target)
        {
            return true;
        }
        if(target >= nums[0])
        {
            return BinarySearch(nums, target, 0, pivot-1);
        }
        return BinarySearch(nums, target, pivot+1, nums.length-1);
    }

    public boolean BinarySearch(int[] nums, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(nums[mid] > target)
            {
                end = mid - 1;
            }
            else if (nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }

    public int PivotElement(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;

        while(start < end)
        {
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid+1])
            {
                return mid;
            }
            else if(mid > start && nums[mid] < nums[mid-1])
            {
                return mid-1;
            }
            else if (nums[start] == nums[mid] && nums[mid] == nums[end])
            {
                if(start < end && nums[start] > nums[start+1])
                    return start;
                start++;
                if(end > start && nums[end] < nums[end-1])
                    return end-1;
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
        return -1;
    }
}