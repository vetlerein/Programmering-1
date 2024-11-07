import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrangementRegister {
    
    static ArrayList<Arrangement> arrangements = new ArrayList<Arrangement>();
    static ArrayList<Arrangement> sortedDateList = new ArrayList<Arrangement>();
    static ArrayList<Arrangement> sortedPlaceList = new ArrayList<Arrangement>();
    static ArrayList<Arrangement> sortedTypeList = new ArrayList<Arrangement>();
    //new Arrangement(1, "2024121218", "Interstellar show", "Trondheim", "Hans Zimmer", "Konsert")
    
    public static void addEvent(Scanner scanner){
        
        scanner.nextLine();

        int i = 4;
        int arrangementNumber = i;
        i++;
        System.out.println("Hva heter arrangementet?");
        String arrangementName = scanner.nextLine();
        System.out.println("Når skjer det? (Format: YYYYMMDDHH)");
        String arrangementDate = scanner.nextLine();
        System.out.println("Hvor er det?");
        String arrangementPlace = scanner.nextLine();
        System.out.println("Hvem er arrangøren?");
        String arrangementOrganizer = scanner.nextLine();
        System.out.println("Hva slags arrangement er det? (Konsert, Barneteater, Foredrag, osv.)");
        String arrangementType = scanner.nextLine();
        
        arrangements.add(new Arrangement(arrangementNumber, arrangementDate, arrangementName, arrangementPlace, arrangementOrganizer, arrangementType));
        //  [(1, 2024.07.19.23(00), Star Wars, Nidarosdommen, Per Jensen, Kinovisning), (, , , , ), ( , , , ,), ( , , , ,)]
    }

    public static void findEventByPlace(Scanner scanner){

        scanner.nextLine();

        System.out.println("Hvilket sted søker du etter?");
        String requestedPlace = scanner.nextLine();
        boolean find = false;
        for (Arrangement number : arrangements) {
            String place = number.getSted();
            if ((requestedPlace.toLowerCase()).equals(place.toLowerCase())){
                find = true;
                System.out.println(number.getNavn()+" har et arrangement, på tidspunktet "+number.getTidspunkt());
            }     
        }
        if(find == false){
            System.out.println("Finner ingen arrangementer på dette stedet.");
            }
    }

    public static void findEventByDate(Scanner scanner){
        //Datoen er slik: YYYYMMDDHH, 1820122024, kl 18. 20 desember, 2024
        scanner.nextLine();
        System.out.println("Hvilken dato søker du etter? (Format: YYYYMMDD)");
        String requestedDate = scanner.nextLine(); 
        boolean find = false; 
        for (Arrangement item : arrangements) {
            String date = (item.getTidspunkt());
            if ((date.substring(0,8)).equals(requestedDate)){
                System.out.println(item.getNavn()+" har et arrangement denne dagen.");
                find = true; 
            }
        }
        if(find == false){
            System.out.println("Finner ingen arrangementer på datoen "+requestedDate);
        }
    }

    public static void findEventIntervalDates(Scanner scanner){

        scanner.nextLine();
        System.out.println("Fra hvilken dato søker du? (Format = YYYYMMDDHH)" );
        String requestedDateFrom = scanner.nextLine();
        System.out.println("Til hvilken dato søker du? (Format = YYYYMMDDHH)");
        String requestedDateTo = scanner.nextLine();

        for (Arrangement number : arrangements) {           
            sortedDateList.add(number);
        }
        Collections.sort(sortedDateList, new SortByDate());   
        boolean find = false; 
        for (Arrangement item : sortedDateList){
            if ( Integer.parseInt(requestedDateFrom) <= Integer.parseInt(item.getTidspunkt()) && Integer.parseInt(requestedDateTo) >= Integer.parseInt(item.getTidspunkt())){
                find = true;
                System.out.println(item.getTidspunkt()+": "+item.getNavn()+" i "+item.getSted());
            }
        }
        if(find == false){
            System.out.println("Finner ingen arrangementer mellom disse datoene.");
        }
        sortedDateList = new ArrayList<Arrangement>();
    }

    public static void listOfAllEvents(Scanner scanner){

        scanner.nextLine();
        System.out.println("Vil du stortere etter sted, type eller tidspunkt?");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("sted")){

            for (Arrangement number : arrangements) {           
                sortedPlaceList.add(number);
            }

            Collections.sort(sortedPlaceList, new SortByPlace());
           
            for(Arrangement arrangement : sortedPlaceList){
                System.out.println(arrangement.getSted()+": "+arrangement.getNavn()+" på datoen: "+arrangement.getTidspunkt()); 
            }

            sortedPlaceList = new ArrayList<Arrangement>();

        } else if (choice.equals("type")){

            for (Arrangement number : arrangements) {           
                sortedTypeList.add(number);
            }
            Collections.sort(sortedTypeList, new SortByType());

            for(Arrangement arrangement : sortedTypeList){
                System.out.println(arrangement.getNavn()+" er et "+ arrangement.getType()+ " og er i " + arrangement.getSted()+" på tidspunktet "+arrangement.getTidspunkt()); 
            }
            
            sortedTypeList = new ArrayList<Arrangement>();

        } else if (choice.equals("tidspunkt")) {

            for (Arrangement number : arrangements) {           
                sortedDateList.add(number);
            }

            Collections.sort(sortedDateList, new SortByDate());

            for(Arrangement arrangement : sortedDateList){
                System.out.println(arrangement.getTidspunkt()+": "+arrangement.getNavn()+" i "+arrangement.getSted()); 
            }

            sortedDateList = new ArrayList<Arrangement>();
        }
    }
}