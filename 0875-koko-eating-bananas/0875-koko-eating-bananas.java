class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;

        for (int nums : piles)
        {
            end = Math.max(end, nums);
        }

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            long time = Total_time(piles, mid);

            if(time <= h)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }  
        }
        return start;
    }

    private long Total_time(int[] piles, int k)
    {
        long hours = 0;
        for (int banana : piles)
        {
            hours += (banana + (long)k - 1) / k;
        }
        return hours;
    }
}