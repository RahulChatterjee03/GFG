// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        String[] word = s.split(" ");
        StringBuilder res = new StringBuilder();
        
        for(String i : word){
            if(!i.isEmpty()){
                res.append(Character.toUpperCase(i.charAt(0)));
                res.append(i.substring(1).toLowerCase());
                res.append(" ");
            }
        }
        
        return res.toString().trim();
    }
}