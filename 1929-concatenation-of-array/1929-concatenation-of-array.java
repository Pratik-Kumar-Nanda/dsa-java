class Solution {
    public int[] getConcatenation(int[] nums) {
        int length=nums.length;
        int[] res = new int[2*length];
        for(int i = 0;i < length;i++)
        {
            res[i]=nums[i];
            res[length+i]=nums[i];
        }
        return res;
    }
}