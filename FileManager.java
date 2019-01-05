import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileManager {
	
	static File file = new File ("Dati.txt");
	
	ArrayList <Contatto> membri = new ArrayList <Contatto>();
	
	Scanner input = new Scanner (System.in);
	
	
	
	public void salvataggio() throws IOException {
		
		FileWriter fw = new FileWriter (file, true);
		BufferedWriter bw = new BufferedWriter (fw);
		
		System.out.println("Inserisci il nome e cognome del tuo contatto:");
		String n = input.nextLine();
		System.out.println("Inserisci il numero di telefono del tuo contatto:");
		String t = input.nextLine();
		
		membri.add(new Contatto(n,t));
		
		for (int i = 0; i < membri.size(); i++) {
			String str = membri.get(i).nome + " - " + membri.get(i).telefono + " \n";
			bw.append(str);
		}
		bw.close();
		membri.clear();
		
		System.out.println("Contatto salvato con successo!");
	
	
	
		
	}
	
	public void lettura() throws IOException {
		FileReader fr = new FileReader (file);
		BufferedReader br = new BufferedReader (fr);
		for (String line = br.readLine(); line != null; line = br.readLine()) {
			System.out.println(line);
		}
		br.close();
	}
	
	public void ricerca() throws IOException {
		FileReader fr = new FileReader (file);
		BufferedReader br = new BufferedReader (fr);
		ArrayList <Contatto> membri2 = new ArrayList <Contatto>();
		for (String line = br.readLine(); line != null; line = br.readLine()) {
			String [] sep = line.split(" - ");
			Contatto persona = new Contatto (sep[0], sep[1]);
			membri2.add(persona);
	        }
		br.close();
		
		System.out.println("Scrivi il nome del tuo contatto qui sotto:");
		
		String tastiera = input.nextLine();
		
		while (true) {
		
		try {
		
		for (int i = 0; i <= membri2.size(); i++) {
			
			if (membri2.get(i).nome.contains(tastiera)) {
			System.out.println(membri2.get(i).nome + " - " + membri2.get(i).telefono);
			break;
			
			}
				
			}
		break;
		
		}catch (Exception e) {
			System.out.println("Contatto non trovato. Riprova");
			tastiera = input.nextLine();
			continue;
		}
			
				
		
	    
	    }
	}
	
	public void elimina() throws IOException {
		System.out.println("Scrivi il nome del contatto che vuoi eliminare:");
		String elimino = input.nextLine();
		FileReader fr = new FileReader (file);
		BufferedReader br = new BufferedReader (fr);
		ArrayList <Contatto> membri3 = new ArrayList <Contatto>();
		for (String line = br.readLine(); line != null; line = br.readLine()) {
			if (line.contains(elimino)) {
				System.out.println("Contatto eliminato con successo!");
				continue;
			}
			String [] sep = line.split(" - ");
			Contatto persona = new Contatto (sep[0], sep[1]);
			membri3.add(persona);
	        }
		
		br.close();
		
		FileWriter fw = new FileWriter (file);
		BufferedWriter bw = new BufferedWriter (fw);
		
		for (int i = 0; i < membri3.size(); i++) {
			String str = membri3.get(i).nome + " - " + membri3.get(i).telefono + " \n";
			bw.append(str);
		}
		bw.close();
		
		
		
	}
	
	
}
