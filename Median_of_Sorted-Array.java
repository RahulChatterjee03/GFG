// User function Template for Java

class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        int n = a.length + b.length;
        int[] merge = new int[n];
        
        for(int i = 0; i < a.length; i++){
            merge[i] = a[i];
        }
        
        for(int i = a.length; i < n; i++){
            merge[i] = b[i - a.length];
        }
        
        Arrays.sort(merge);
        
        int start = 0; 
        int end = merge.length;
        int mid = start + (end - start) / 2;
        int smid = mid - 1;
        double m1 = (double) ((merge[mid] + merge[smid]) / 2.0);
        double m2 = (double) (merge[mid] / 2.0);
        
        if(merge.length % 2 == 0){
            return m1;
        }
        else{
            return m2;
        }
    }
}