import java.util.Comparator;

public class SortByType implements Comparator<Arrangement> {

    @Override
    public int compare(Arrangement a1, Arrangement a2) {
        return a1.getType().compareTo(a2.getType());
    }
} 