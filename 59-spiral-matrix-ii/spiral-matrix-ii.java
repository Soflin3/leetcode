class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n-1;
        int top = 0;
        int bot = n-1;
        int num = 1;
        while(left<=right && top<=bot){
            for(int i = left ; i<= right ;i++){
                 matrix[top][i] = num++;
            }
            top++;
            for(int i = top ; i <= bot ; i++){
                matrix[i][right] = num++;
            }
            right--;
            for(int i = right ; i>=left ; i--){
                matrix[bot][i] = num++;
            }
            bot--;
            for(int i = bot ; i >=top ; i--){
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix;
    }
}