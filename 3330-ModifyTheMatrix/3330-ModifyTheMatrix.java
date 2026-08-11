// Last updated: 8/11/2026, 2:14:42 PM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] answer = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1){
                    int v=j;
                    int max=matrix[0][j];
                    for(int k=1;k<n;k++){
                        if(matrix[k][j]>max){
                            max=matrix[k][j];
                        }
                        answer[i][j]=max;
                    }
                }
                else{
                    answer[i][j]=matrix[i][j];
                }
            }
        }
        return answer;
    }
}