class TicTacToe {
    private int n;
    private int[] rows;
    private int[] cols;
    private int diag, antiDiag;

    public TicTacToe(int n) {
        this.n = n;
        rows = new int[n];
        cols = new int[n];
    }

    // player 1 -> +1, player 2 -> -1
    public int move(int row, int col, int player) {
        int add = (player == 1) ? 1 : -1;

        rows[row] += add;
        cols[col] += add;

        if (row == col) diag += add;
        if (row + col == n - 1) antiDiag += add;

        if (Math.abs(rows[row]) == n ||
                Math.abs(cols[col]) == n ||
                Math.abs(diag) == n ||
                Math.abs(antiDiag) == n) {
            return player; // winner
        }

        return 0; // no winner yet
    }
}

public class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(3);

        System.out.println(game.move(0, 0, 1)); // 0
        System.out.println(game.move(0, 2, 2)); // 0
        System.out.println(game.move(1, 1, 1)); // 0
        System.out.println(game.move(0, 1, 2)); // 0
        System.out.println(game.move(2, 2, 1)); // 1 -> Player 1 wins!
    }
}
