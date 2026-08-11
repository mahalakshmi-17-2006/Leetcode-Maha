// Last updated: 8/11/2026, 2:14:24 PM
class Solution {
    public int minLights(int[] lights) {
        int n=lights.length;
        int[] diff=new int[n+1];
        for(int i=0;i<n;i++){
            int v=lights[i];
            if(v>0){
                int start=Math.max(0,i-v);
                int end=Math.min(n-1,i+v);
                diff[start]++;
                if(end+1 < n){
                    diff[end+1]--;
                }
            }
            
        }
        boolean[] visible = new boolean[n];
        int active =0;
        for(int i=0;i<n;i++){
            active +=diff[i];
            if(active>0){
                visible[i]=true;
            }
        }
        int ans=0;
        int i=0;
        while(i<n){
            if(visible[i]){
                i++;
                continue;
            }
            ans++;
            int bulbPos=Math.min(i+1,n-1);
            int start = Math.max(0,bulbPos-1);
            int end = Math.min(n-1,bulbPos+1);
            for(int j=start ;j<=end;j++){
                visible[j]=true;
            }
            i=end+1;
        }
        return ans;
    }
}