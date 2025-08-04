// User function Template for Java

class Sol {
    Boolean checkBinary(String s) {
        // your code here
        int start = -1;
        int end = -1;
        
        boolean isValid = true;
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '1'){
                start = i;
                break;
            }
        }
        
        
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '1'){
                end = i;
                break;
            }
        }
        
        if (start == -1) {
            return true;
        }
        
        for(int i = start; i <= end; i++){
            if(s.charAt(i) == '0'){
               return false;
            }
        }
        
        return true;
        
        
    }
}
