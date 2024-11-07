import java.util.Comparator;

public class SortByDate implements Comparator<Arrangement> {

    @Override
    public int compare(Arrangement a1, Arrangement a2) {
        return a1.getTidspunkt().compareTo(a2.getTidspunkt());
    }
}