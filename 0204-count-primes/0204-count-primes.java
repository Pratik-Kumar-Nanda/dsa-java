class Solution {
    public int countPrimes(int n) {
        int count = 0;

        if(n < 2)
        {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int num = 2; num * num < n; num++)
        {
            if(isPrime[num])
            {
                for(int multiple = num * num; multiple < n; multiple += num)
                {
                    isPrime[multiple] = false;
                }
            }
        }

        for(int i = 2; i < n; i++)
        {
            if(isPrime[i])
            {
                count++;
            }
        }
        return count;
    }
}