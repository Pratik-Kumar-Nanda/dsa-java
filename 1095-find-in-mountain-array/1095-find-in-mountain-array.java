/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = PeakElement(mountainArr);
        int Ans = FirstHalf(target, mountainArr, peak);
        if(Ans == -1)
            Ans = SecondHalf(target, mountainArr, peak+1);
        return Ans;
    }
    private int PeakElement(MountainArray mountainArr)
    {
        int start = 0;
        int end = mountainArr.length() - 1;

        while(start < end)
        {
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1))
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
    private int FirstHalf(int target, MountainArray mountainArr, int end)
    {
        int start = 0;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < mountainArr.get(mid))
                end = mid-1;
            else if (target > mountainArr.get(mid))
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
    private int SecondHalf(int target, MountainArray mountainArr, int start)
    {
        int end = mountainArr.length() - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target > mountainArr.get(mid))
                end = mid-1;
            else if (target < mountainArr.get(mid))
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
}