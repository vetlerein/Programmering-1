import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        EiendomRegister eiendomsListe = new EiendomRegister();

        eiendomsListe.addEiendom("Gloppen", "Jens Olsen", "", 1445, 77, 631, 1017.6);
        eiendomsListe.addEiendom("Gloppen", "Nicolay Madsen", "Syningom", 1445, 77, 131, 661.3);
        eiendomsListe.addEiendom("Gloppen", "Evilyn Jensen", "Fugletun", 1445, 75, 19, 650.6);
        eiendomsListe.addEiendom("Gloppen", "Elsa Indregård", "Høiberg", 1445, 69, 47, 1339.4);

        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("\n=====Eiendomsregister=====");
            System.out.println(" 1. Legge til en eiendom");
            System.out.println(" 2. Skrive ut alle eiendommer");
            System.out.println(" 3. Søke etter eiendom");
            System.out.println(" 4. Se gjennomsnittsareal på alle eiendommer");
            System.out.println("Hva velger du?");
            int choice = scanner.nextInt();

            if(choice == 1){
                scanner.nextLine();
                System.out.println("I hvilken kommune er det?");
                String inputKommuneNavn = scanner.nextLine();
                System.out.println("Hva heter eieren av eiendommen?");
                String inputEierNavn = scanner.nextLine();
                System.out.println("Hva er bruksnavnet på eiendommen?");
                String inputBruksnavn = scanner.nextLine();
                System.out.println("Hva er kommune nummeret?");
                int inputKommuneNr = scanner.nextInt();
                System.out.println("Hva er gårdsnummeret?");
                int inputGårdsnummer = scanner.nextInt();
                System.out.println("Hva er bruksnummeret?");
                int inputBruksnummer = scanner.nextInt();
                System.out.println("Hva er arealet til tomta? (Oppgitt i m^2)");
                double inputAreal = scanner.nextDouble();        
        
                eiendomsListe.addEiendom(inputKommuneNavn, inputEierNavn, inputBruksnavn, inputKommuneNr, inputGårdsnummer, inputBruksnummer, inputAreal);
           
            }else if(choice == 2){
                EiendomRegister.listeEiendommer();
            }else if(choice == 3){
                EiendomRegister.eiendomSøk(scanner);
            }else if(choice == 4){
                EiendomRegister.arealBeregning();
            }else{
                System.out.println("hæ");
            }
        }
    }
}
