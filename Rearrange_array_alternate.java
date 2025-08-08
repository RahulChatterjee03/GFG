class Solution {
    public void rearrange(int arr[]) {
        // code here
        
        Arrays.sort(arr);
        int base = 0;
        int start = 0;
        
        while(base != arr.length){
            reverse(arr, start, arr.length - 1);
            start++;
            base++;
        }
        
    }
    
    static void reverse(int[] arr1, int start, int end){

        
        while(start <= end){
            int temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            
            start++;
            end--;
        }
    }
}
