// Last updated: 8/11/2026, 2:14:29 PM
class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<int[]>[] g = new ArrayList[n];
        for(int i=0;i<n;i++)
            g[i]=new ArrayList<>();

        for(int[] e: edges){
            g[e[0]].add(new int[]{e[1],e[2]});
          //  g[e[1]].add(new int[]{e[0],e[2]});
                
        }
        int[][] dist = new int[n][k+1];
        for(int[] row : dist)
            Arrays.fill(row,Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.offer(new int[]{0,0,1});
        dist[0][1]=0;
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int d=cur[0],u=cur[1],cnt=cur[2];

            if(u==n-1)return d;
            if(d!=dist[u][cnt]) continue;

            for(int[] nb : g[u]){
                int v=nb[0],w=nb[1];
                int nc = labels.charAt(u)==labels.charAt(v)?cnt+1:1;

                if(nc<= k && d+w < dist[v][nc]){
                    dist[v][nc]=d+w;
                    pq.offer(new int[]{d+w,v,nc});
                }
            }
        }
        return -1;
    }
}