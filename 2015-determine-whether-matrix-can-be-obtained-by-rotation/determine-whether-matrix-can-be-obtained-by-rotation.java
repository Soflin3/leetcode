class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
    for(int k = 0 ; k < 4 ; k++){
        boolean rotate = true;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j] != target[i][j]){
                    rotate = false;
                    break;
                }
            }
        }
        if(rotate) return true;
        int[][] ans = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                ans[j][n-1-i] = mat[i][j];
            }
        }
        mat = ans;
    }
        return false;
    }
}