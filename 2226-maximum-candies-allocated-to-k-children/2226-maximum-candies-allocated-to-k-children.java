class Solution {
    public int maximumCandies(int[] candies, long k) {

        long total = 0;
        int start = 1;
        int end = 0;

        for (int candy : candies) 
        {
            total += candy;
            end = Math.max(end, candy);
        }

        if (total < k)
        {
            return 0;
        }

        while (start <= end) 
        {
            int mid = start + (end - start) / 2;

            if (canWeDivide(candies, k, mid)) 
            {
                start = mid + 1;
            } else 
            {
                end = mid - 1;
            }
        }

        return end;
    }

    private boolean canWeDivide(int[] candies, long k, int divide) 
    {
        long count = 0;
        for (int candy : candies) 
        {
            count += candy / divide;

            if (count >= k)
            {
                return true;
            }
        }
        return false;
    }
}