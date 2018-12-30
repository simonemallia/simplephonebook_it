import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileManager x = new FileManager ();
		Scanner tastiera = new Scanner (System.in);
		
		System.out.println("Benvenuto in Rubrica v.0.01a");
		
		while(true) { 
		System.out.println("Seleziona cosa vuoi fare");
		System.out.println("1- Aggiungi contatto");
		System.out.println("2- Visualizza tutti i contatti");
		System.out.println("3- Cerca il tuo contatto");
		
		String scelta = tastiera.nextLine();
		
		while (!scelta.equalsIgnoreCase("1") && !scelta.equalsIgnoreCase("2") && !scelta.equalsIgnoreCase("3")) {
			System.out.println("Input non valido. Ritenta");
			scelta = tastiera.nextLine();
			continue;
		}
		
		
		if (scelta.equalsIgnoreCase("1")) {
			System.out.println("Aggiungi il nome del tuo contatto seguito dal numero di telefono");
			
			x.membri.add(new Contatto(tastiera.nextLine(), tastiera.nextLine()));
			
			x.salvataggio();
			
			System.out.println("Contatto salvato con successo!");
			System.out.println("Vuoi ritornare al menù? (Y/N)");
			scelta = tastiera.nextLine();
			if (scelta.equalsIgnoreCase("Y")) {
				continue;
			}
			else {
				System.out.println("Termino il programma...");
				System.exit(0);
			}
			
		}
		else if (scelta.equalsIgnoreCase("2")) {
			x.lettura();
			System.out.println("Vuoi ritornare al menù? (Y/N)");
			scelta = tastiera.nextLine();
			if (scelta.equalsIgnoreCase("Y")) {
				continue;
			}
			else {
				System.out.println("Termino il programma...");
				System.exit(0);
			}
		}
		else if (scelta.equalsIgnoreCase("3")) {
			x.ricerca();
			System.out.println("Vuoi ritornare al menù? (Y/N)");
			scelta = tastiera.nextLine();
			if (scelta.equalsIgnoreCase("Y")) {
				continue;
			}
			else {
				System.out.println("Termino il programma...");
				System.exit(0);
			}
		}
		
		
		
		}

	}

}

