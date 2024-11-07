import java.util.ArrayList;
import java.util.List;

public class Rett {

    private String typeNavn;
    private String navn;
    private final ArrayList<String> validTypes = new ArrayList<String>(List.of("Forrett", "Hovedrett","Dessert"));

    private int pris;
    
    public String getNavn() {
        return navn;
    }
    public String getTypeNavn() {
        return typeNavn;
    }
    public int getPris() {
        return pris;
    }

    public Rett(String navn, String typeNavn, int pris) {
        if (this.validTypes.contains(typeNavn)){
            this.typeNavn = typeNavn;
        } else {
            throw new IllegalArgumentException("Du må bruke en av typene");
        }
        this.pris = pris;
        this.navn = navn;
    }

    @Override
    public String toString() {
        String str = "";
        str = getNavn()+" "+getTypeNavn()+" "+getPris();
        return str;
    }

    public static void main(String[] args) {
        Rett rett = new Rett("Pizza", "Hovedrett", 100);
        System.out.println(rett);
    }
}
