class Solution {
    public int countPrimes(int n) {
        int count = 1;

        if(n <= 2)
        {
            return 0;
        }

        boolean[] isPrime = new boolean[n/2];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;

        for(int num = 3; num * num < n; num += 2)
        {
            if(isPrime[num/2])
            {
                for(int multiple = num * num; multiple < n; multiple += 2 * num)
                {
                    isPrime[multiple/2] = false;
                }
            }
        }

        for(int i = 1; i < isPrime.length; i++)
        {
            if(isPrime[i])
            {
                count++;
            }
        }
        return count;
    }
}