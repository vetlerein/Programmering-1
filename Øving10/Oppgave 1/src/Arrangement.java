public class Arrangement {
    
    private int nummer;
    private String tidspunkt;
    private String navn;
    private String sted; 
    private String arrangør;
    private String type;

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getNummer() {
        return this.nummer;
    }

    public String getTidspunkt() {
        return this.tidspunkt;
    }

    public String getNavn() {
        return this.navn;
    }

    public String getSted() {
        return this.sted;
    }

    public String getArrangør() {
        return this.arrangør;
    }

    public String getType() {
        return this.type;
    }

    public Arrangement(int nummer, String tidspunkt, String navn, String sted, String arrangør, String type){
        this.nummer = nummer;
        this.tidspunkt = tidspunkt;
        this.navn = navn;
        this.sted = sted;
        this.arrangør = arrangør;
        this.type = type;

    }

    @Override
    public String toString() {
        String str = "";
        str = getNummer()+" "+getTidspunkt()+" "+getNavn()+" "+getSted()+" "+getArrangør()+" "+getType();

        return str;
    }
}
