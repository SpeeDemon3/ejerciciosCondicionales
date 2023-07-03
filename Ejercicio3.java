package ejerciciosOpcionalesCondicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio3 {

	/*
	 * Escriba un programa que pida primero un número par y a continuación un numero impar (positivos o negativos). 
	 * En caso de que uno o los dos valores no sean correctos, se mostrarán uno o dos avisos.
	 */
	
	public static void main(String[] args) {

		try {
			
			// Variable para poder controlar el bucle
			boolean control = true;
			
			// Con un bucle do while solicitare al usuario los valores hasta que los introduzca bien los 2
			do {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Escriba un número decimal par:");
				
				// Recojo el primer valor
				double par = sc.nextDouble();

				System.out.println("Escriba un número decimal impar:");
				
				// Recojo el segundo valor
				double impar = sc.nextDouble();
				
				// Si la variable par modulo 2 no es igual a 0
				if (par % 2 != 0) {
					
					System.out.println(par + " no es un número par.");
					
				//	Si la variable impar modulo 2 es igual a 0
				} else if (impar % 2 == 0) {

					System.out.println(impar + " no es un número impar.");
					
				} 
				// Si la variable par modulo 2 no es igual a 0 o la variable impar modulo 2 es igual a 0
				if(par % 2 != 0 || impar % 2 == 0) {
					
					System.out.println("Los números introducidos no son correctos.");
					
				} else {
					
					System.out.println("Número par: " + par + "\n" + "Número impar: " + impar);
					
					// Cambio el valor de la variable control a false para poder salir del bucle
					control = false;
					
				}
				
			// Mientras la variable control tenga el valor de true el bucle seguira iterando
			} while(control);
			
		// Controlo cualquier excepcion que pudiese ocurrir si el usuario no introduce un valor numérico
		} catch(InputMismatchException ime) {
			
			System.out.println("Debes introducir un valor numérico.");
			
		}
		
	}

}
