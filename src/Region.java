import java.util.HashSet;
import java.util.Set;

public class Region {

    private Set<Cell> cells = new HashSet<>();
    private int size;

    public Region(int number) {
        this.size = number;
    }

    public void addCell(Cell cell) {
        cells.add(cell);
    }

}
