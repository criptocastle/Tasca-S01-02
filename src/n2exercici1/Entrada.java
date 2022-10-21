package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

	private static Scanner entrada = new Scanner(System.in);
	private String missatge = "Introdueix la teva edat: ";
	private static boolean inputError = false;

	public String getMissatge() {
		return missatge;
	}

//repetir o optimitzar codi cridant els mètodes al main i fent el try catch alla? Entrada.llegirByte("", 0);	

	public static byte llegirByte(String missatge, byte edat) { // repetir igual per la resta de metodes

		do {
			try {
				System.out.println(missatge);
				edat = entrada.nextByte();
				inputError = false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format! Torna a introduïr la dada: ");
				inputError = true;
			}

		} while (inputError == true);

		return edat;
	}

//cast?
	public static char llegirChar(String missatge, char edat) {

		do {
			try {
				System.out.println(missatge);
				// edat = entrada.nextChar();
				inputError = false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format! Torna a introduïr la dada: ");
				inputError = true;
			}

		} while (inputError == true);

		return edat;
	}

	public static String llegirString(String missatge, String edat) {

		do {
			try {
				System.out.println(missatge);
				edat = entrada.nextLine();
				inputError = false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format! Torna a introduïr la dada: ");
				inputError = true;
			}

		} while (inputError == true);

		return edat;
	}
}
