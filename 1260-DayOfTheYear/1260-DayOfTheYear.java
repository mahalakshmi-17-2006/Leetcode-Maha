// Last updated: 8/11/2026, 2:18:27 PM
class Solution {
    public int dayOfYear(String date) {
        String[] str=date.split("-");
        int y = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int d = Integer.parseInt(str[2]);
        
        for(int i=1;i<m;i++){
            if(i==1 || i==3 || i== 5 || i== 7 || i==8 || i== 10 || i==12){
                d+=31;
            }
            else if(i==4 || i== 6 || i==9 || i== 11){
                d+=30;
            }
            else if(i==2){
                if(y%400 ==0 || y%100!=0 && y%4==0)
                d+=29;
                else 
                d+=28;
            }
        }
        return d;
    }
}