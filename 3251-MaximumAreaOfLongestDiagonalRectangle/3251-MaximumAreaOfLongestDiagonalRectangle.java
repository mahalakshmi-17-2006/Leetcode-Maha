// Last updated: 8/11/2026, 2:15:01 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
       int maxdia=0;
       int maxarea=0;
       for(int[] ele : dimensions){
         int len =ele[0];
         int wid =ele[1];

         int dia = len * len + wid * wid;
         int area = len * wid;

       if(dia > maxdia ){
       maxdia = dia;
       maxarea = area;}
       else if ( dia == maxdia){
           maxarea = Math.max(area , maxarea);
       }
       }
       return maxarea;
       
    }
}