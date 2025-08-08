
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
        List<Integer> res = new ArrayList<>();
        
        int start = k - 1;
        int end = arr.size() - k  ;
        
        int temp = arr.get(start);
        arr.set(start, arr.get(end));
        arr.set(end, temp);
    }
}
