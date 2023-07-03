package ejerciciosOpcionalesCondicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio4 {

	/*
	 * Escriba un programa que pida dos números enteros y que calcule su división, 
	 * escribiendo si la división es exacta o no.
	 */
	
	public static void main(String[] args) {

		System.out.println("###Calculadora Divisiones###\n");
		
		try {
			// Variable de control para controlar el bucle
			boolean control = true;
			
			// Utilizando un bucle do while se ejecutara el programa hasta que el usuario decida lo contrario
			do {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Introduce el dividendo:");

				// Recojo el primer valor
				int dividendo = sc.nextInt();
				
				System.out.println("Introduce el divisor:");
				
				// Recojo el segundo valor
				int divisor = sc.nextInt();
				
				// Realizo la operacion, guardandola en una variable
				double resultado = dividendo / divisor;
				
				System.out.println("El resultado de dividir " + dividendo + " entre " + divisor + " es " + resultado);
				
				// Para comprovar si la division es exacta
				// Compruebo si la variable resultado modulo 2 es igual a 0
				if (resultado % 2 == 0) {
					
					System.out.println("La división es exacta.");
				// En caso contrario
				} else {
					
					System.out.println("La división no es exacta.");
					
				}
				
				// Menu de opciones
				System.out.println("### Menú ###");
				System.out.println("Pulse [1] si desea realizar otra división");
				System.out.println("Pulse [2] si desea finalizar el programa");
				
				// Recojo el valor introducido por el usuario
				int opc = sc.nextInt();
				
				// Si la variable opc es igual a 0
				if (opc == 2) {
					
					System.out.println("Gracias por utilizar el programa!!!");
					// Cambio el valor de la variable control para poder salir del bucle
					control = false;
					
				}
				
			// Mientras la variable control sea true el bucle seguira iterando
			} while (control);
			
		// Controlo la excepcion que pudiera ocurrir si el usuario no introduce un valor numérico	
		} catch (InputMismatchException ime) {
			
			System.out.println("Debes introducir un valor numérico.");
			
		// Controlo la excepcion que pudiese ocurrir si se divide entre 0
		} catch (ArithmeticException e) {
			
			System.out.println("No se puede dividir entre 0.");
			
		}
		
	}

}
