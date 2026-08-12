class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m-1;
        int bestRow = -1;
        while(top <= bottom){
            int mid = top + (bottom - top) / 2;
            if(target >= matrix[mid][0] && target <= matrix[mid][n-1]){
                bestRow = mid;
                break;
            }
            else if(target < matrix[mid][0]) bottom = mid-1;
            else top = mid+1;
        }

        if(bestRow == -1) return false;

        int l=0;
        int r=n-1;
        while(l<=r){
            int mid = l + (r-l) / 2;
            if(target == matrix[bestRow][mid]) return true;
            else if(target > matrix[bestRow][mid]) l = mid+1;
            else r = mid-1;
        }
        return false;
    }
}
