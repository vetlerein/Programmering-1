public class Tekstbehandling {
    
    private String tekst;
    public Tekstbehandling(String tekst){
        this.tekst = tekst;
    }

    public int antallOrd() {
        String[] ord = tekst.split("\\s+");
        return ord.length;
    }

    public double gjennomsnittligOrdlengde() {
        String[] ord = tekst.split("\\s+");
        int sumLengde = 0;
        for (String ordet : ord) {
            sumLengde += ordet.length();
        }
        return (double) sumLengde / ord.length;
    }

    public double gjennomsnittligOrdPerPeriode() {
        String[] perioder = tekst.split("[.!?:]");
        int ordTeller = antallOrd();
        return (double) ordTeller / perioder.length;
    }

    public String erstattOrd(String gammeltOrd, String nyttOrd) {
        return tekst.replaceAll("\\b" + gammeltOrd + "\\b", nyttOrd);
    }

    public String utenEndring(){
        return tekst;
    }

    public String capitalizeAlt(){
        return tekst.toUpperCase();
    }
}
