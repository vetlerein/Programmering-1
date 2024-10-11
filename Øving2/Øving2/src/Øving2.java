import static javax.swing.JOptionPane.*;
import java.util.Scanner;

public class Øving2 {
}

class Oppgave1{
    public static void main(String[] args) throws Exception {
        int aarstall = Integer.parseInt(showInputDialog("Hvilket år er det snakk om?"));

        if (aarstall % 4 == 0 && aarstall % 100 != 02 || aarstall % 400 == 0) {
            showMessageDialog(getRootFrame(), "Det er et skuddår.");    
        } else {
            showMessageDialog(getRootFrame(), "Det er ikke et skuddår.");
        }
    }
}

class Oppgave2{
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hva veier kjøttdeig A?");
        double vektKDeigA = scanner.nextDouble();
        System.out.println("Hva koster kjøttdeig A?");
        double prisKDeigA = scanner.nextDouble();
        
        System.out.println("Hva veier kjøttdeig B?");
        double vektKDeigB = scanner.nextDouble();
        System.out.println("Hva veier kjøttdeig B?");
        double prisKDeigB = scanner.nextDouble();

        scanner.close();

        double forholdA = prisKDeigA/vektKDeigA;
        double forholdB = prisKDeigB/vektKDeigB;

        if (forholdA<forholdB) {
            System.out.println("Kjøttdeig A er billigere enn B");
        } else if (forholdB<forholdA) {
            System.out.println("Kjøttdeig B er billigere enn A");
        } else {
            System.out.println("De koster like mye..");
        }
    }
}