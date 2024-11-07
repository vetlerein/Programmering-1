public class Meny {
    
    private Rett forrett;
    private Rett hovedrett;
    private Rett dessert;
    private String menyNavn;
    
    public Meny(String menyNavn, Rett forrett, Rett hovedrett, Rett dessert) {
        this.forrett = forrett;
        this.hovedrett = hovedrett;
        this.dessert = dessert;
        this.menyNavn = menyNavn;
    }

    public String getMenyNavn(){
        return this.menyNavn;
    }
    public Rett getForrett() {
        return this.forrett;
    }
    public Rett getHovedrett() {
        return this.hovedrett;
    }
    public Rett getDessert() {
        return this.dessert;
    }

    @Override
    public String toString() {
        String str = "";
        str = getMenyNavn()+" "+getForrett()+" "+getHovedrett()+" "+getDessert();
        return str;
    }

    public static void main(String[] args) {
        Rett forrett = new Rett("Pizza", "Forrett", 90);
        Rett hovedrett = new Rett("Biff", "Hovedrett", 200);
        Rett dessert = new Rett("Iskrem", "Dessert", 80);


        Meny meny = new Meny("Kul meny",forrett, hovedrett, dessert);
        System.out.println(meny);
    }
}


/**
          
        ArrayList<Rett> retter = new ArrayList<Rett>();


        public Meny(Rett ... retter){
        this.retter.stream().toArray(Rett[]::new);
        System.out.println(this.retter);
    }
 
     */
