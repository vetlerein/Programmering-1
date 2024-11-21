public class Eiendom {
    private String kommuneNavn, eierNavn, bruksNavn;
    private int kommuneNr, gnr, bnr;
    private double areal;
    
    public Eiendom(String kommuneNavn, String eierNavn, String bruksNavn, int kommuneNr, int gnr, int bnr,
            double areal) {
        this.kommuneNavn = kommuneNavn;
        this.eierNavn = eierNavn;
        this.bruksNavn = bruksNavn;
        this.kommuneNr = kommuneNr;
        this.gnr = gnr;
        this.bnr = bnr;
        this.areal = areal;
    }
    public String getKommuneNavn() {
        return kommuneNavn;
    }
    public String getEierNavn() {
        return eierNavn;
    }
    public String getBruksNavn() {
        return bruksNavn;
    }
    public int getKommuneNr() {
        return kommuneNr;
    }
    public int getGnr() {
        return gnr;
    }
    public int getBnr() {
        return bnr;
    }
    public double getAreal() {
        return areal;
    }
    @Override
    public String toString() {
        String str = "";
        str = "Kommune: "+getKommuneNavn()+"  Eier: "+getEierNavn()+"  Bruksnavn: "+getBruksNavn()+"  Knr: "+
            getKommuneNr()+"  Gnr: "+getGnr()+"  Bnr: "+getBnr()+"  Areal: "+getAreal();
        return str;
    }
}
