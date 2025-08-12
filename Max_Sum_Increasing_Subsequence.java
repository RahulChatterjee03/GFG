// User function Template for Java

class Solution {
    public int maxSumIS(int arr[]) {
        // code here.
        int n = arr.length;
        int[] dp = new int[n];
        
        for(int i = 0; i < dp.length; i++){
            dp[i] = arr[i];
        }
        
        for(int i = 1; i < n; i++){
            for(int prev = 0; prev < i; prev++){
                if(arr[i] > arr[prev]){
                    dp[i] = Math.max(dp[i], dp[prev] + arr[i]);
                }
            }
        }
        
        int max = 1;
        for(int sum : dp){
            max = Math.max(sum, max);
        }
        
        return max;
        
        
        
    }
}