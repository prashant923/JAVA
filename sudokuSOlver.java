public class sudokuSOlver {
    public static boolean isSafe(char[][] board, int row, int col, int number) {
        // column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
        }
  
        // row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == (char) (number + '0')) {
                return false;
            }
        }
  
        // grid
        int sr = 3 * (row / 3);
        int sc = 3 * (col / 3);
  
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
  
        return true;
    }
  
    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
  
        int nrow = 0;
        int ncol = 0;
  
        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }
  
        if (board[row][col] != '.') {
            if (helper(board, nrow, ncol)) {
                return true;
            }
        } else {
  
            // fill the place
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol))
                        return true;
                    else
                        board[row][col] = '.';
                }
            }
        }
  
        return false;
    }
  
    public static void main(String[] args) {
        char[][] board = {
                {'3', '8', '5', '0', '0', '0', '0', '0', '0'},
                {'9', '2', '1', '0', '0', '0', '0', '0', '0'},
                {'6', '4', '7', '0', '0', '0', '0', '0', '0'},
                {'0', '0', '0', '1', '2', '3', '0', '0', '0'},
                {'0', '0', '0', '7', '8', '4', '0', '0', '0'},
                {'0', '0', '0', '6', '9', '5', '0', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '8', '7', '3'},
                {'0', '0', '0', '0', '0', '0', '9', '6', '2'},
                {'0', '0', '0', '0', '0', '0', '1', '4', '5'}
        };
        helper(board, 0, 0);
    }
}
