

public class ArbTaker {
    
    private Person personalia;
    private int arbtakenr;
    private int ansettelsesår;
    private double månedslønn;
    private int skatteprosent;

    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    int år = kalender.get(java.util.Calendar.YEAR);

    public ArbTaker(Person personalia, int arbtakenr, int ansettelsesår, int månedslønn, int skatteprosent){
        this.personalia = personalia;
        this.arbtakenr = arbtakenr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
    }

    public Person getPersonalia(){
        return this.personalia;
    }
    public int getArbtakenr(){
        return this.arbtakenr;
    }
    public int getAnsettelsesår(){
        return this.ansettelsesår;
    }
    public double getMånedslønn(){
        return this.månedslønn;
    }
    public int getSkatteprosent(){
        return this.skatteprosent;
    }
    public void setMånedslønn(int newMånedslønn) {
        this.månedslønn = newMånedslønn;
    }
    public void setSkatteprosent(int newSkatteprosent) {
        this.skatteprosent = newSkatteprosent;
    }

    public double mndSkatt(){
        System.out.println(this.månedslønn);
        System.out.println(this.skatteprosent);
        return this.månedslønn*(this.skatteprosent/100.0);
    }
    public double årsLønn(){
        return this.månedslønn*12;
    }
    public double årsSkatt(){
        return this.månedslønn*this.skatteprosent*10.5;
    }
    public String printNavn(Person personalia){
        return personalia.getEtternavn()+", "+personalia.getFornavn();
    }
    public String printAlder(Person personalia){
        return personalia.getFornavn()+" er "+(år-personalia.getFødselsår())+" år.";
    }
    public String årAnsatt(){
        return personalia.getFornavn()+"ble ansatt i "+(år-this.ansettelsesår);
    }
    public int ansattMerEnn(int userInput){
        return (år - userInput);

    }
}
