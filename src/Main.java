import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<Region> regions = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height, then width");

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        Board gameBoard = new Board(height, width);

        System.out.println("How many regions are there?");

        int numRegions = scanner.nextInt();

        for (int i = 1; i <= numRegions; i++) {
            System.out.println("How big is this region?");
            int size = scanner.nextInt();
            Region region = new Region(size);

            for (int j = 0; j < size; j++) {
                System.out.println("Enter coordinates of the cell. x then y.");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                region.addCell(gameBoard.getCell(y, x));
            }
        }

        System.out.println("How many set values are there");

        int numSetValues = scanner.nextInt();

        for (int i = 0; i < numSetValues; i++) {
            System.out.println("Enter coordinates of the cell. x then y.");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println("Enter value.");
            int value = scanner.nextInt();
            gameBoard.updateValue(y, x, value);
        }

        gameBoard.printBoard();
    }
}
