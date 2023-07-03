package ejerciciosOpcionalesCondicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio1 {

	/*
	 * Escriba un programa que pida primero un número par y luego un número impar (positivos o negativos). 
	 * En caso de que uno o los dos valores no sea correcto, se mostrará un único aviso.
	 */
	
	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce un valor par:");
			
			// Guardo el primer valor introducido por el usuario
			int par = sc.nextInt();
			
			// Si la variable par modulo 2 no es igual a 0
			if (par % 2 != 0) {
				
				System.out.println("No has introducido un valor par.");
		
			} else {
			
				System.out.println("Valor par :" + par);

			}
			
			System.out.println("Introduce un valor impar:");
			
			// Guardo el segundo valor introducido por el usuario
			int impar = sc.nextInt();
			
			// Si la variable impar modulo 2 es igual a 0
			if (impar % 2 == 0) {
				
				System.out.println("No has introducido un valor impar.");
				
			} else {
				
				System.out.println("Valor impar: " + impar);

			}
			
		// Controlo la excepcion que pudiese ocurrir si el usuario no introduce un valor numerico
		} catch(InputMismatchException ime) {
			System.out.println("Debes introducir valores numéricos.");
		}
		

	}

}
