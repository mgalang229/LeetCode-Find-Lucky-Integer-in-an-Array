class Solution {
    public int findLucky(int[] arr) {
        int max = 0;
        for (int x : arr) {
            max = Math.max(max, x);
        }
        int[] freq = new int[max+1];
        Arrays.fill(freq, 0);
        for (int x : arr) {
            freq[x]++;
        }
        int ans = -1;
        for (int x : arr) {
            if (freq[x] == x) {
                ans = Math.max(ans, x);
            }
        }
        return ans;
    }
}
