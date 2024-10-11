import java.util.Scanner;

public class ValutaKalkulator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vil du konvertere fra eller til norske kroner?");
        System.out.println("1. Til NOK\n2. Fra NOK\n");
        int valgKonverte = scanner.nextInt();

        System.out.println("\nVelg en av disse:\n1. Dollar\n2. Euro\n3. Svenske kroner\n4. Avslutte programmet\n");
        int valgValuta = scanner.nextInt();
        
        do{
            if (valgValuta == 1){
                if (valgKonverte == 1){
                    
                    System.out.println("Hvor mye vil du konvertere til NOK?");
                    double pengeMengde = scanner.nextDouble();
                    Valuta USD = new Valuta(10.83);
                    System.out.println("Det er "+USD.tilNorskeKroner(pengeMengde)+ "NOK");

                } else if(valgKonverte == 2){

                    System.out.println("Hvor mye vil du konvertere til USD?");
                    double pengeMengde = scanner.nextDouble();
                    Valuta USD = new Valuta(10.83);
                    System.out.println("Det er "+USD.fraNorskeKroner(pengeMengde)+ "USD");
                }
                
            } else if( valgValuta == 2){
                if (valgKonverte == 1){
                    
                    System.out.println("Hvor mye vil du konvertere til NOK?");
                    double pengeMengde = scanner.nextDouble();
                    Valuta EUR = new Valuta(11.94);
                    System.out.println("Det er "+EUR.tilNorskeKroner(pengeMengde)+ "NOK");

                } else if(valgKonverte == 2){

                    System.out.println("Hvor mye vil du konvertere til EUR?");
                    double pengeMengde = scanner.nextDouble();
                    Valuta EUR = new Valuta(11.94);
                    System.out.println("Det er "+EUR.fraNorskeKroner(pengeMengde)+ "EUR");
                }

            } else if( valgValuta == 3){
                if (valgKonverte == 1){
                    
                    System.out.println("Hvor mye vil du konvertere til NOK?");
                    double pengeMengde = scanner.nextDouble();
                    Valuta SEK = new Valuta(1.04);
                    System.out.println("Det er "+SEK.tilNorskeKroner(pengeMengde)+ "NOK");

                } else if(valgKonverte == 2){

                    System.out.println("Hvor mye vil du konvertere til SEK?");
                    double pengeMengde = scanner.nextDouble();
                    Valuta SEK = new Valuta(1.04);
                    System.out.println("Det er "+SEK.fraNorskeKroner(pengeMengde)+ "SEK");
                }

            } else if( valgValuta == 4){
                System.out.println("Program slutt.");

            } else {
                System.out.println("Du må skrive et tall");
            }
        }while(valgValuta<4);
        scanner.close();
    } 
}

