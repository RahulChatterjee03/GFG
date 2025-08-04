// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        Set<Character> exist = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(!exist.contains(c)){
                res.append(c);
                exist.add(c);
            }
        }
        
        return res.toString();
    }
}
