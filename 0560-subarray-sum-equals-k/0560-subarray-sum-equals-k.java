class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        ans.put(0,1);
        int preSum = 0;
        int count = 0;

        for(int num : nums)
        {
            preSum += num;
            count += ans.getOrDefault(preSum-k,0);
            ans.merge(preSum, 1, Integer::sum);
        }
        return count;
    }
}