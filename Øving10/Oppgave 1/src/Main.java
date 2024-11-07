
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {    
    Scanner scanner = new Scanner(System.in);

    ArrangementRegister.arrangements.add(new Arrangement(1, "2024121218", "Halloween", "Trondheim", "Hans Zimmer", "Konsert"));
    ArrangementRegister.arrangements.add(new Arrangement(2, "2024111020", "Pinse", "Oslo", "Kongen", "Bedpres"));
    ArrangementRegister.arrangements.add(new Arrangement(3, "2024122410", "Påske", "Trondheim", "Emanuel", "Foredrag"));

    while(true){
      System.out.println("\n===== Arrangement register ======");
      System.out.println("  Hva vil du gjøre?  ");
      System.out.println(" 1. Registrere nytt arrangement");
      System.out.println(" 2. Søke etter arrangement etter sted");
      System.out.println(" 3. Søke etter arrangement etter dato");
      System.out.println(" 4. Søke etter arrangement etter tidsintervall ved to datoer");
      System.out.println(" 5. Oversikt over alle arrengementer ");
      System.out.println(" Skriv noe annet for å avslutte programmet. \n");
      
      int choice = scanner.nextInt();
      
      if( choice == 1 ){
        ArrangementRegister.addEvent(scanner);
      }else if(choice == 2){
        ArrangementRegister.findEventByPlace(scanner);
      }else if(choice == 3){
        ArrangementRegister.findEventByDate(scanner);
      }else if(choice == 4){
        ArrangementRegister.findEventIntervalDates(scanner);
      }else if(choice == 5){
        ArrangementRegister.listOfAllEvents(scanner);
      }else{
        scanner.close();
        break;
      }
    }
  }
}