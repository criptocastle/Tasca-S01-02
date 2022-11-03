package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada  { //controlar excepcions

	private static Scanner entrada = new Scanner(System.in);
	private String missatge;
	private static boolean inputError = false;

	
	public Entrada() {
		this.missatge = "Introdueix la teva edat: ";
	}
	
	
	//repetir o optimitzar codi cridant els mètodes al main i fent el try catch alla? Entrada.llegirByte("", 0);	

	public static byte llegirByte(String missatge) { // repetir igual per la resta de metodes
		byte edat = 0;
		do {
			try {
				System.out.println(missatge);
				edat = entrada.nextByte();
				inputError = false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format! Torna a introduïr la dada: ");
				inputError = true;
			}

		} while (inputError);

		return edat;
	}

//cast?
	public static String llegirChar(String missatge) {
		String edat = "";
		inputError = false;
	
		do {
			try {
				System.out.println(missatge);
				edat = entrada.next();
			} catch (InputMismatchException e) {
				System.out.println("Error de format! Torna a introduïr la dada: ");
				inputError = true;
			}
			System.out.println();

		} while (inputError);

		
		return edat;
	}

	public static String llegirString(String missatge) {
		String edat  = "";
		inputError = false;
		do {
			try {
				System.out.println(missatge);
				edat = entrada.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Error de format! Torna a introduïr la dada: ");
				inputError = true;
			}

		} while (inputError);

		return edat;
	}
} 

