public class Board {

    private Cell[][] board;
    private int height;
    private int width;

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
        this.board = new Cell[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                board[x][y] = new Cell();
            }
        }
    }

    public void updateValue(int height, int width, int value) {
        this.board[width - 1][height - 1].setValue(value);
    }

    public void printBoard() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(board[x][y].getValue());
            }
            System.out.print("\n");
        }
    }

    public Cell getCell(int y, int x) {
        return board[x - 1][y - 1];
    }
}
