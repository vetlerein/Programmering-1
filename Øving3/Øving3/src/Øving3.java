import java.util.Scanner;
import static javax.swing.JOptionPane.*;

public class Øving3 {
}

class Oppgave1{
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hvilket tall vil du starte med?");
        int startVerdi = scanner.nextInt();
        System.out.println("Hvilket tall vil du slutte med?");
        int sluttVerdi = scanner.nextInt();
        int checkInnerLoop = 1;

        while (startVerdi<=sluttVerdi) {
            System.out.println(startVerdi + "-gangen:");
            do{ 
                System.out.println(startVerdi + " x " + checkInnerLoop + " = " + startVerdi*checkInnerLoop );
                checkInnerLoop++;
            } while (checkInnerLoop<= 10);
            System.out.println("");
            checkInnerLoop = 1;
            startVerdi++;
        }
        scanner.close();
    }
}



class Oppgave2{
    public static void main(String[] args) {
        int tall = Integer.parseInt(showInputDialog("Skriv inn et heltall"));
      
        double max_tall = Math.sqrt(tall);  
        int sjekk = 1;
        boolean resultat = true; 
        
        if(tall < 1){
           resultat = false;
        } else if(tall == 1){
            resultat = false;
        } else if (tall == 2) {
            resultat = true;
        } else if (tall % 2 == 0) {
            resultat = false;
        } else {
            do{
                sjekk+=2;
                if(tall % sjekk == 0){
                    resultat = false;   
                }
            }while( sjekk < max_tall);
        }
        if(resultat == true)
            System.out.println("Det er et primtall.");
        else if( resultat == false){
           System.out.println("Det er ikke et primtall");
        } else {
            System.out.println("?");
        }
    }
}