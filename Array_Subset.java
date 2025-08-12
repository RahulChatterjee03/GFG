
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i = 0;
        int j = 0;
        
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                i++;
            }
            
            else if(a[i] == b[j]){
                i++;
                j++;
            }
            
            else{
                return false;
            }
        }
        
        
        return j == b.length;
        
        
        
        
        
    }
}
