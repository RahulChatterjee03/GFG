class Solution {
    public String getLongestPal(String s) {
        // code here
        
        int start = 0;
        int end = 0;
        int maxlen = 1;
        
        for(int i = 0; i < s.length(); i++){
            int len1 = expandfromcenter(s, i, i);
            
            int len2 = expandfromcenter(s, i, i+1);
            
            int len = Math.max(len1, len2);
            
	            if(len > maxlen) {
	            	maxlen = len;
	            
	                start = i - (len - 1) / 2;
	                end = i + len / 2;
	            }
        }
        
        return s.substring(start, end + 1);
        
        
    }
    
    static int expandfromcenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        return right - left - 1;
    }
}