 /*Algorithm:
Trim the String (Optional but Safe):

Remove leading and trailing spaces using s.trim().

Split by Dot ("."):

Use s.split("\\.") to break the string into an array of words.

The regex "\\." ensures you're splitting by literal dot (. is a special regex character).

Filter Empty Strings:

Iterate through the split parts.

If a part is not empty (!part.isEmpty()), add it to a List<String> called store.

This removes unwanted empty strings caused by consecutive dots or dots at the beginning/end.

Reverse the List:

Use a two-pointer approach (start and end) to reverse the list in place.

Join the List into Final String:

Use String.join(".", store) to join all reversed words with a single dot between them.

This avoids adding a dot at the end.

*/
class Solution {
    public String reverseWords(String s) {
        // Trim input and split by literal dot
        String[] store = s.trim().split("\\.");
        
        List<String> words = new ArrayList<>();
        
        for(String str : store){
            if(!str.isEmpty()){
                words.add(str);
            }
        }

        int start = 0;
        int end = words.size() - 1;

       
        while (start < end) {
            String temp = words.get(start);
            words.set(start, words.get(end));
            words.set(end, temp);

            start++;
            end--;
        }
        
        return String.join(".", words);
    }

        
    
}


