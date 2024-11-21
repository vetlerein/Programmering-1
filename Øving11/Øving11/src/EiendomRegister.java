import java.util.ArrayList;
import java.util.Scanner;

public class EiendomRegister {
    
    private static ArrayList<Eiendom> eiendomsListe;
        
    public EiendomRegister() {
        this.eiendomsListe = new ArrayList<>();
    }
    
    public void addEiendom(String inputKommuneNavn, String inputEierNavn, String inputBruksnavn, int inputKommuneNr, int inputGårdsnummer, int inputBruksnummer, double inputAreal){
        eiendomsListe.add(new Eiendom(inputKommuneNavn, inputEierNavn, inputBruksnavn, inputKommuneNr, inputGårdsnummer, inputBruksnummer, inputAreal));
    }

    public static void listeEiendommer(){
        for(Eiendom item : eiendomsListe){
            System.out.println(item);
        }
    }

    public static void eiendomSøk(Scanner scanner){
        scanner.nextLine();
        System.out.println("Hva er Kommunenummeret?");
        int inputKnr = scanner.nextInt();
        System.out.println("Hva er Gårdsnummeret?");
        int inputGnr = scanner.nextInt();
        System.out.println("Hva er Bruksnummeret?");
        int inputBnr = scanner.nextInt(); 

        for(Eiendom item : eiendomsListe){

            if(item.getKommuneNr()==inputKnr && item.getGnr()==inputGnr && item.getBnr()==inputBnr){
                System.out.println(item);
            }else{
                System.out.println("Finner ingen match");
            }
        }
    }

    public static void arealBeregning(){
        double totalAreal = 0;
        for(Eiendom item : eiendomsListe){
            totalAreal += item.getAreal();  
        }
        System.out.println("\nAlle eiendommene i registret har tilsammen "+totalAreal+"m^2.");
    }
}
