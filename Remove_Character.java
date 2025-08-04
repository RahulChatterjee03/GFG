// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        boolean[] check = new boolean[26];
        StringBuilder store = new StringBuilder();
        
        for(char c : str2.toCharArray()){
            check[c - 'a'] = true;
        }
        
        for(char c : str1.toCharArray()){
            if(check[c - 'a'] == false){
                store.append(c);
            }
        }
        
        String ans = store.toString();
        return ans;
    }
}