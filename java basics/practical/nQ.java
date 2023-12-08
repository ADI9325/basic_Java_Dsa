public class nQ {

                    public static void solveNQueens(int n) {
                                        int[][] board = new int[n][n];
                                        if (!solveNQueensUtil(board, 0, n)) {
                                                            System.out.println("No solution exists");
                                        } else {
                                                            printBoard(board);
                                        }
                    }

                    public static boolean isSafe(int[][] board, int row, int col, int n) {
                                        // Check if there is a queen in the same column
                                        for (int i = 0; i < row; i++) {
                                                            if (board[i][col] == 1) {
                                                                                return false;
                                                            }
                                        }

                                        // Check the upper left diagonal
                                        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
                                                            if (board[i][j] == 1) {
                                                                                return false;
                                                            }
                                        }

                                        // Check the upper right diagonal
                                        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
                                                            if (board[i][j] == 1) {
                                                                                return false;
                                                            }
                                        }

                                        return true;
                    }

                    public static boolean solveNQueensUtil(int[][] board, int row, int n) {
                                        if (row == n) {
                                                            return true;
                                        }

                                        for (int col = 0; col < n; col++) {
                                                            if (isSafe(board, row, col, n)) {
                                                                                board[row][col] = 1;
                                                                                if (solveNQueensUtil(board, row + 1, n)) {
                                                                                                    return true;
                                                                                }
                                                                                board[row][col] = 0;
                                                            }
                                        }

                                        return false;
                    }

                    public static void printBoard(int[][] board) {
                                        for (int i = 0; i < board.length; i++) {
                                                            for (int j = 0; j < board[i].length; j++) {
                                                                                if (board[i][j] == 1) {
                                                                                                    System.out.print("Q ");
                                                                                } else {
                                                                                                    System.out.print(". ");
                                                                                }
                                                            }
                                                            System.out.println();
                                        }
                    }

                    public static void main(String[] args) {
                                        int n = 4; // Change this to the desired board size
                                        solveNQueens(n);
                    }
}
