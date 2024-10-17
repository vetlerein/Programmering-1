public class App {
    public static void main(String[] args) throws Exception {
        NyString nyString = new NyString("Denne setningen kan forkortes");
        Tekstbehandling enTekst = new Tekstbehandling("Hei! Hvordan går det med deg? Dette er en enkel test for tekstbehandling.");
        


        System.out.println(nyString.forkort());
        System.out.println(nyString.fjernTegn('e'));

        System.out.println("    ");

        System.out.println(enTekst.antallOrd());
        System.out.println(enTekst.gjennomsnittligOrdlengde());
        System.out.println(enTekst.gjennomsnittligOrdPerPeriode());
        System.out.println(enTekst.erstattOrd("tilfeldig", "dårlig"));
        System.out.println(enTekst.utenEndring());
        System.out.println(enTekst.capitalizeAlt());
        
        
    }
}

