public class SudokuSolver {

    public static void solveSudoku(char[][] board) {
        solve(board);
    }

    private static boolean solve(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {

                    for (char c = '1'; c <= '9'; c++) {

                        if (isValid(board, i, j, c)) {

                            board[i][j] = c;

                            if (solve(board)) return true;

                            board[i][j] = '.'; // backtrack
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {

        for (int i = 0; i < 9; i++) {

            // row
            if (board[row][i] == c) return false;

            // column
            if (board[i][col] == c) return false;

            // 3x3 box
            int boxRow = (row / 3) * 3 + i / 3;
            int boxCol = (col / 3) * 3 + i % 3;

            if (board[boxRow][boxCol] == c) return false;
        }

        return true;
    }

    // print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Original Sudoku:");
        printBoard(board);

        solveSudoku(board);

        System.out.println("\nSolved Sudoku:");
        printBoard(board);
    }
}