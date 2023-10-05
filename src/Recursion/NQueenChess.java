package Recursion;

public class NQueenChess {

    public boolean canPlace(int[][] board, int n, int x, int y) {
        // Column
        for (int k = 0; k < x; k++) {
            if (board[k][y] == 1) {
                return false;
            }
        }

        // Left diagonal
        int i = x;
        int j = y;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }

        // Right diagonal
        i = x;
        j = y;
        while (i >= 0 && j < n) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    public void printBoard(int n, int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean solveQueen(int n, int[][] board, int i) {
        // Base case
        if (i == n) {
            // Print the board
            printBoard(n, board);
            return true;
        }

        // Recursive case
        // Try to place the queen in every row
        for (int j = 0; j < n; j++) {
            // Whether current i, j is safe or not
            if (canPlace(board, n, i, j)) {
                board[i][j] = 1;
                boolean success = solveQueen(n, board, i + 1);
                if (success) {
                    return true;
                }

                // Backtrack
                board[i][j] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        NQueenChess nQueen = new NQueenChess();
        int n = 4; // Change this to the desired board size
        int[][] board = new int[n][n];

        if (!nQueen.solveQueen(n, board, 0)) {
            System.out.println("No solution found.");
        }
    }
}


