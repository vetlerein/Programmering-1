import java.util.Comparator;

public class SortByPlace implements Comparator<Arrangement> {

    @Override
    public int compare(Arrangement a1, Arrangement a2) {
        return a1.getSted().compareTo(a2.getSted());
    }
}