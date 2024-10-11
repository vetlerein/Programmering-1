import java.util.Scanner;

public class Øving1{
}

class Oppgave1{   
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange centimeter?");
        double centimeter = scanner.nextDouble();
        // får input av bruker

        double tomme = centimeter * 2.54;
        System.out.println(centimeter + "cm" + " er " + tomme + " tommer");
        //gjør om cm til tommer

        scanner.close();
    }
}

class Oppgave2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange timer?");
        int timer = scanner.nextInt();
        
        System.out.println("Hvor mange minutter?");
        int min = scanner.nextInt();

        System.out.println("Hvor mange sekunder?");
        int sek = scanner.nextInt();
        //får input av bruker

        int total;
        total = timer*3600 + min*60 + sek;
        //regner om til et totalt antall sekunder

        System.out.println("\n"+
            timer + " timer, " + min + " minutter, og " + sek + " sekunder er: " + total + " sekunder \n");
        //printer ut svaret

        scanner.close();
    }
}

class Oppgave3{
    public static void main(String[] args) {
 
    Scanner scanner = new Scanner(System.in);

    //får input av bruker
    System.out.println("Hvor mange sekunder var det?");
    int sekunderTotal = scanner.nextInt();
    
    //definerer variablene
    int timer;
    int minutter;
    int sekunder;

    //Regner om sekunder til timer, minutter og sekunder
    timer = sekunderTotal/3600;
    int a = sekunderTotal%3600;
    minutter = a/60;
    int b = a%60;       
    sekunder = b;
    //regner først ut antall timer, regner så ut antall minutter med resten fra timene, 
    //så resten fra minuttene blir da i sekunder.

    //printer ut svaret
    System.out.println(
        sekunderTotal+" sekunder er "+timer+" timer "+minutter+" minutter og "+sekunder+" sekunder.");

    scanner.close();
    }
}
