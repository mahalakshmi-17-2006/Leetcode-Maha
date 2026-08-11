// Last updated: 8/11/2026, 2:14:32 PM
import java.util.*;
class Solution {
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        List<Integer>[] tree=new ArrayList[n];
        for(int i=0;i<n;i++){
            tree[i]=new ArrayList<>();
            
        }
        for(int[] edge : edges){
            tree[edge[0]].add(edge[1]);
        }
        return dfs(0,tree,baseTime);
    }    
        
        private long dfs(int node,List<Integer>[] tree,int[] baseTime){
            if(tree[node].isEmpty()){
                return baseTime[node];
            }
            long earliest = Long.MAX_VALUE;
            long latest = Long.MIN_VALUE;

            for(int child : tree[node]){
                long finish = dfs(child,tree,baseTime);
                earliest = Math.min(earliest,finish);
                latest = Math.max(latest,finish);
            }
            long ownDuration = (latest - earliest)+ baseTime[node];
            return latest + ownDuration;
                
        }
}
        /*public long finishTime(int n,int[][] edges ,int[] baseTime){
            this.baseTime = baseTime;
            tree =new ArrayList[n];
            for(int i=0;i<n;i++){
                tree[i]=new ArrayList<>();
            }
            for(int[] egde : edges){
                tree[edge[0]].add(edge[1]);
            }
            return dfs(0);
        }
    
}*/