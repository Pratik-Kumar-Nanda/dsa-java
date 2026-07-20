class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;

        for(int weight : weights)
        {
            start = Math.max(start, weight);
            end += weight;
        }

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            int sail = Days_count(weights, mid);

            if(sail <= days)
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

    private int Days_count(int[] weights, int capacity)
    {
        int sum = 0;
        int days = 1;
        for(int weight : weights)
        {
            if(sum + weight > capacity)
            {
                days++;
                sum = weight;
            }
            else
            {
                sum += weight;
            }
        }
        return days;
    }
}