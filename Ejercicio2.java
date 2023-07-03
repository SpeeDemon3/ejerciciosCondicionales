package ejerciciosOpcionalesCondicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio2 {

	/*
	 * Escriba un programa que pida primero un número par (positivo o negativo) y si el valor no es correcto, 
	 * muestre un aviso. Si el valor es correcto, pedirá un número impar (positivo o negativo) y si el valor 
	 * no es correcto, mostrará un aviso.
	 */
	
	public static void main(String[] args) {

		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce un valor par:");
			
			int par = sc.nextInt();
			
			// Si la variable par modulo 2 no es igual a 0
			if (par % 2 != 0) {
				
				System.out.println(par + " no es un número par.");
				
			} else {
				
				System.out.println("Perfecto " + par + " es un valor par.");
				
				System.out.println("\nIntroduce un valor impar:");
				
				int impar = sc.nextInt();
				
				if (impar % 2 == 0) {
					
					System.out.println(impar + " no es un número impar.");
				
				} else {
				
					System.out.println("Perfecto " + impar + " es un número impar.");
					
				}
				
			}
			
			
		} catch(InputMismatchException ime) {
			System.out.println("Debes introducir un valor numérico.");
		}
		
		
	}

}
