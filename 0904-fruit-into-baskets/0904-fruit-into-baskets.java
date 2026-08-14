class Solution {
    public int totalFruit(int[] fruits) {

        int fruit1 = fruits[0];
        int fruit2 = -1;

        int last1 = 0;
        int last2 = -1;

        int maxlen = 0;
        int left = 0;

        for (int right = 0; right < fruits.length; right++)
        {
            if(fruits[right] == fruit1)
            {
                last1 = right;
            }
            else if(fruits[right] == fruit2)
            {
                last2 = right;
            }
            else
            {
                if(last1 < last2)
                {
                    left = last1 + 1;
                    fruit1 = fruits[right];
                    last1 = right;
                }
                else
                {
                    left = last2 + 1;
                    fruit2 = fruits[right];
                    last2 = right;
                }
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}