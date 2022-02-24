package uf2178;

import java.util.Scanner;

public class Funciones {
	
	/** 
	 * Método de la clase que pide un vector por teclado
	 * @param v int[] el vector a introducir por teclado
	 */
	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	/**
	 * Método para mostrar por pantalla el vector pasado como parámetro
	 * @param v int [] el vector a mostrar en pantalla
	 */
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	// Escribe las sentencias de los apartados 1 y 2
	public static void calculaSancion (double tasa) {
		double sancion1=500;
		double sancion2=1000;
		
		if(tasa< 0.25) {
			System.out.println("sin sancion");
	}else if(tasa>= 0.25 &&tasa < 0.50) {
		System.out.println("El conductor con tasa de alcholemia "+tasa+" tiene la sanción de" +sancion1+" y pérdida de 4 puntos");
	}else if( tasa >=0.50 && tasa<0.6) {
		System.out.println("El conductor con tasa de alcoholemia "+tasa+" tiene la sancion de "+sancion2+"y pérdida de 6 puntos");
	}else if(tasa>0.60) {
		System.out.println("Retirada del carnet y de 3 a 6 meses de cárcel");
	}
}
	
	/**public static void  restaPuntos() {
		int puntos[6];
	}**/
}