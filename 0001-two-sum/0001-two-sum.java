import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int container;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            container = target - nums[i];
            if(map.containsKey(container))
                return new int[] {map.get(container),i};

            map.put(nums[i],i);
        }
        return new int[] {};
    }
}