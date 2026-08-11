// Last updated: 8/11/2026, 2:15:50 PM
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            String word=words[i];
            int n= word.length();
            
            if((word.charAt(0) =='a' || word.charAt(0) =='e' || word.charAt(0) =='o' || word.charAt(0) =='i' || word.charAt(0)=='u')&&(word.charAt(n - 1) == 'a'||word.charAt(n - 1)=='e'||word.charAt(n - 1)=='i'||word.charAt(n - 1)=='o'||word.charAt(n - 1)=='u' )){
                    c++;
                
            }
        }
            return c;
            
        }
    
}