
public class Valuta{
    private double nokVerdi;        //Konstruktør
    public Valuta(double nokVerdi){
        this.nokVerdi = nokVerdi;
    
    }

    public double tilNorskeKroner(double valutaVerdi) {     // Metode/funksjon fra Valuta til NOK
        return valutaVerdi*nokVerdi;
    } 

    public double fraNorskeKroner(double valutaVerdi) {     // Metode/funksjon fra NOK til Valuta
        return valutaVerdi/nokVerdi;
    }
       
}
