class Solution {
    public int maxScore(int[] cardPoints, int k) 
    {
        int total = 0;
        int last = cardPoints.length - 1;
        int max = 0;
        for(int i = 0; i < k; i++)
        {
            total += cardPoints[i];
        }
        max = total;
        for(int i = 0; i < k; i++)
        {
            total = total - cardPoints[k-1-i] + cardPoints[last-i];
            max = Math.max(max, total);
        }
        return max;
    }
}