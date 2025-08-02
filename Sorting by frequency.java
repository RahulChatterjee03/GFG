// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        
        Map<Integer, Integer> freqmap = new HashMap<>();
        
        for(int num : arr){
            freqmap.put(num, freqmap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }
        
        Collections.sort(list, (a, b) -> {
            int freqA = freqmap.get(a);
            int freqB = freqmap.get(b);
            
            if(freqA == freqB){
                return a - b;
            }
            else{
                return freqB - freqA;
            }
        });
        
        return  new ArrayList<>(list);
    }
}