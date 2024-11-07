import java.util.ArrayList;
import java.util.Scanner;

public class MenyRegister {
    
    Scanner scanner = new Scanner(System.in);

    static ArrayList<Meny> menyer = new ArrayList<Meny>();
    static ArrayList<Rett> retter = new ArrayList<Rett>();

    public static void addRett(Scanner scanner){
        scanner.nextLine();
        System.out.println("Hva heter retten?");
        String rettNavn = scanner.nextLine();
        System.out.println("Hvilken type er det (f. eks Forrett, Hovedrett, Dessert)");
        String rettType = scanner.nextLine();
        System.out.println("Hva er prisen?");
        int rettPris = scanner.nextInt();

        retter.add(new Rett( rettNavn, rettType, rettPris));

    }

    public static void rettSearchByName(Scanner scanner){

        scanner.nextLine();

        System.out.println("Hvilken rett vil du finne?");
        String requestedRett = scanner.nextLine();

        boolean find = false;
        for(Rett item : retter){
            if(requestedRett.equals(item.getNavn())){
                find = true;
                System.out.println(item.getNavn()+" er en "+item.getTypeNavn()+" og koster "+item.getPris());
            }
        }
        if(find == false){
            System.out.println("Fant ingen treff på "+requestedRett);
        }
    }

    public static void typeSearch(Scanner scanner){
        
        scanner.nextLine(); 
        System.out.println("Hvilken type leter du etter?");
        System.out.println("1. Forrett");
        System.out.println("2. Hovedrett");
        System.out.println("3. Dessert");
        
        int inputChoice = scanner.nextInt();

        if(inputChoice==1){

            boolean find = false;
            for(Rett item : retter){
                if (item.getTypeNavn().equals("Forrett")) {
                    find = true;
                    System.out.println(item.getNavn()+", som koster "+item.getPris());   
                }
            }
            if(find == false){
                System.out.println("Fant ingen foretter");
            }

        }else if(inputChoice==2){

            boolean find = false;
            for(Rett item : retter){
                if (item.getTypeNavn().equals("Hovedrett")) {
                    find = true;
                    System.out.println(item.getNavn()+", som koster "+item.getPris());   
                }
            }
            if(find == false){
                System.out.println("Fant ingen hovedretter");
            }

        }else if(inputChoice==3){

            boolean find = false;
            for(Rett item : retter){
                if (item.getTypeNavn().equals("Dessert")) {
                    find = true;
                    System.out.println(item.getNavn()+", som koster "+item.getPris());   
                }
            }
            if(find == false){
                System.out.println("Fant ingen desserter");
            }

        }else{
            System.out.println("Prøv noe annet da.\n");
        }
    }

    public static void createMeny(Scanner scanner){

        scanner.nextLine();
        
        Rett addForrett = null;
        Rett addHovedrett = null;
        Rett addDessert = null;

        System.out.println("Hva skal menyen hete?");
        String requestedMenyNavn = scanner.nextLine();

        System.out.println("Hvilken forrett vil du ha?");
        for(Rett item : retter){
            if (item.getTypeNavn().equals("Forrett")) {
                System.out.println(item.getNavn()+", som koster "+item.getPris());   
            }
        }
        String requestedForrett = scanner.nextLine();
        for(Rett item : retter){
            if (item.getNavn().equals(requestedForrett)) {
                addForrett = new Rett(item.getNavn(), item.getTypeNavn(), item.getPris());   
            }
        }

        System.out.println("Hvilken hovedrett vil du ha?");
        for(Rett item : retter){
            if (item.getTypeNavn().equals("Hovedrett")) {
                System.out.println(item.getNavn()+", som koster "+item.getPris());   
            }
        }
        String requestedHovedrett = scanner.nextLine(); 
        for(Rett item : retter){
            if (item.getNavn().equals(requestedHovedrett)) {
                addHovedrett = new Rett(item.getNavn(), item.getTypeNavn(), item.getPris());   
            }
        }

        for(Rett item : retter){
            if (item.getTypeNavn().equals("Dessert")) {
                System.out.println(item.getNavn()+", som koster "+item.getPris());   
            }
        }
        String requestedDessert = scanner.nextLine();
        for(Rett item : retter){
            if (item.getNavn().equals(requestedDessert)) {
                addDessert = new Rett(item.getNavn(), item.getTypeNavn(), item.getPris());   
            }
        }
        Meny newMenu = new Meny(requestedMenyNavn, addForrett, addHovedrett, addDessert);
        menyer.add(newMenu);
        System.out.println(newMenu);
    }

    public static void findMenyer(Scanner scanner){
        scanner.nextLine();

        System.out.println("Minstepris?");
        int minPris = scanner.nextInt();

        System.out.println("Makspris?");
        int maxPris = scanner.nextInt(); 

        boolean find = false;

        for(Meny item : menyer){
        
            int totalPris = item.getForrett().getPris()+item.getHovedrett().getPris()+item.getDessert().getPris();
            
            if(minPris<=totalPris && maxPris>=totalPris){
                find = true;
                System.out.println(item.getMenyNavn()+" består av:");
                System.out.println(item.getForrett());
                System.out.println(item.getHovedrett());
                System.out.println(item.getDessert());
                System.out.println("Denne koster: "+(totalPris)+"\n");
            }
        }
        if(find == false){
            System.out.println("Fant ingen menyer innenfor dette intervallet");
        }
    }
}
