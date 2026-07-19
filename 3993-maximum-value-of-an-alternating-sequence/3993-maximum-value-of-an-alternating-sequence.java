class Solution {
    public long maximumValue(int n, int s, int m) {
        long k = n / 2;
        return s + k * m - Math.max(0, k-1);
    }
}