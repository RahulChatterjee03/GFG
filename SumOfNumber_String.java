class Solution {
    public int findSum(String s) {
        // code here
        String temp = "0";
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(Character.isDigit(c)){
                temp += c;
            }
            
            else{
                sum += Integer.parseInt(temp);
                
                temp = "0";
            }
        }
        
        return sum + Integer.parseInt(temp);
        
    }
}