public class Brok {
    int nevner;
    int teller;

    public Brok(int teller, int nevner){
        if( nevner == 0 ){
            throw new IllegalArgumentException("Nevneren kan ikke være = 0");
        } else {
        this.teller = teller;
        this.nevner = nevner;
        }
    }
    public Brok(int teller){
        this.nevner = 1; 
    }

    public int getTeller() {
        return teller;
    }
    public int getNevner() {     
        return nevner;
    }   

    public void Summere(int teller2, int nevner2){
        this.teller = this.teller * nevner2 + teller2 * this.nevner;
        this.nevner = this.nevner * nevner2;
    }
    public void Subtrahere(int teller2, int nevner2){
        this.teller = this.teller * nevner2 - teller2 * this.nevner;
        this.nevner = this.nevner * nevner2;
    }
    public void Mulitplisere(int teller2, int nevner2){
        this.teller = this.teller * teller2;
        this.nevner = this.nevner * nevner2;
    }
    public void Dividere(int teller2, int nevner2){
        this.teller = this.teller * nevner2;
        this.nevner = this.nevner * teller2;
    }

    public static void main(String[] args) {
        Brok brok = new Brok(4, 0);
        brok.Dividere(2, 4);
        System.out.println(brok.getTeller()+ "/" + brok.getNevner());
    }
}
