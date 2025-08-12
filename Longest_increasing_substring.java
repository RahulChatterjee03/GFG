class Solution {
    static int lis(int arr[]) {
        // code here
        int n = arr.length;
        int[] dp = new int[n];
        
        for(int i = 0; i < dp.length; i++){
            dp[i] = 1;
        }
        
        for(int i = 1; i < n; i++){
            for(int prev = 0; prev < i; prev++){
                if(arr[i] > arr[prev]){
                    dp[i] = Math.max(dp[i], dp[prev] + 1);
                }
            }
        }
        
        int max = 1;
        for(int len : dp){
            max = Math.max(len, max);
        }
        
        return max;
        
        
        
    }
}