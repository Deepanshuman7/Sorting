public static boolean staircaseSearch(int[][] arr, int target) {
    int rows = arr.length;
    int cols = arr[0].length;
    
    // Starting from the top-right corner of the matrix
    int row = 0;
    int col = cols - 1;
    
    while (row < rows && col >= 0) {
        if (arr[row][col] == target) {
            return true;
        } else if (arr[row][col] < target) {
            // If the current element is smaller than the target,
            // move down to the next row
            row++;
        } else {
            // If the current element is larger than the target,
            // move left to the previous column
            col--;
        }
    }
    
    // If the target is not found, return false
    return false;
}
