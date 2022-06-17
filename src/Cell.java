import java.util.HashSet;
import java.util.Set;

public class Cell {

    private int value = 0;
    private Set<Integer> ineligibles = new HashSet<>();

    public Cell() {}

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void addIneligible(Integer ineligible) {
        ineligibles.add(ineligible);
    }

}
