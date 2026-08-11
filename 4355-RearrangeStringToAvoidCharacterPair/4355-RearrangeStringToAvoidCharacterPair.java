// Last updated: 8/11/2026, 2:13:56 PM
class Solution {
    public String rearrangeString(String s, char x, char y) {
        int xCount = 0;
        int yCount = 0;
        for(char ch : s.toCharArray()){
            if(ch==x){
                xCount++;
            }
            else if(ch==y){
                yCount++;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch!=x && ch!=y){
                ans.append(ch);
            }
        }
        for(int i=0;i<yCount;i++){
            ans.append(y);
        }
        for(int i=0;i<xCount;i++){
            ans.append(x);
        }
        return ans.toString();
    }
}