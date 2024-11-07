import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("=== Meny / rett register ===");
            System.out.println("Hva vil du gjøre?");
            System.out.println(" 1. Registrere ny rett");
            System.out.println(" 2. Søke etter en rett");
            System.out.println(" 3. Finne alle retter av en type");
            System.out.println(" 4. Registrere en ny meny");
            System.out.println(" 5. Finne alle menyer med totalpris innenfor et gitt intervall");
            System.out.println("For å avbryte: Skriv noe annet");

            int choice = scanner.nextInt();
        
            if( choice == 1 ){
                MenyRegister.addRett(scanner);
            }else if(choice == 2){
                MenyRegister.rettSearchByName(scanner);
            }else if(choice == 3){
                MenyRegister.typeSearch(scanner);
            }else if(choice == 4){
                MenyRegister.createMeny(scanner);
            }else if(choice == 5){
                MenyRegister.findMenyer(scanner);
            }else{
            scanner.close();
            break;
            }
        }
    }
}
