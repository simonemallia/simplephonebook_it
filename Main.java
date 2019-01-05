import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileManager run = new FileManager ();
		Scanner tastiera = new Scanner (System.in);
		
		System.out.println("Benvenuto in Rubrica v.0.02a");
		
		while (true) {
		
		System.out.println("Seleziona cosa vuoi fare");
		System.out.println("1- Aggiungi contatto");
		System.out.println("2- Visualizza tutti i contatti");
		System.out.println("3- Cerca il tuo contatto");
		System.out.println("4- Elimina contatto");
		System.out.println("5- Credits");
		System.out.println("6- Chiudi l'applicazione");
		
		
		String scelta = tastiera.nextLine();
		
		switch (scelta) {
		case "1":
			run.salvataggio();
			System.out.println("Vuoi ritornare al menù? (Y/N)");
			if (tastiera.nextLine().equalsIgnoreCase("Y")) {
				continue;
			}else {
				System.out.println("Termino il programma...");
				System.exit(0);
			}
			
			break;
		case "2":
			run.lettura();
			System.out.println("Vuoi ritornare al menù? (Y/N)");
			if (tastiera.nextLine().equalsIgnoreCase("Y")) {
				continue;
			}else {
				System.out.println("Termino il programma...");
				System.exit(0);
			}
            break;
		case "3":
			run.ricerca();
			System.out.println("Vuoi ritornare al menù? (Y/N)");
			if (tastiera.nextLine().equalsIgnoreCase("Y")) {
				continue;
			}else {
				System.out.println("Termino il programma...");
				System.exit(0);
			}
			break;
		case "4":
			run.elimina();
			System.out.println("Vuoi ritornare al menù? (Y/N)");
			if (tastiera.nextLine().equalsIgnoreCase("Y")) {
				continue;
			}else {
				System.out.println("Termino il programma...");
				System.exit(0);
			}
			break;
		case "5":
			System.out.println("This application was written by Simone Mallia. Thanks for using my application! :)");
			continue;
		default:
				System.out.println("Input non riconosciuto. Ritenta");
				continue;
		}
		
		}
		
	}
	

}
