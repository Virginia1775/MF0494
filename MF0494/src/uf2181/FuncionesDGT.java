/**
 * 
 */
package uf2181;

/**
 * @author David
 *
 */
public class FuncionesDGT {
/**
 * función que calcula la media de los puntos indicados por parámero
 * @param puntos int lo introducimos por parámetro
 * @return double la suma de todos los elementos recorridos dividida por lospuntos
 */
	public double mediaPuntos(int puntos[]) {
		double suma = 0;
		
		for (int i = 0; i < puntos.length; i++) {
			suma = suma +puntos[i];
		}
		if (puntos.length==0) throw new ArrayIndexOutOfBoundsException();
		return suma/puntos.length;
	}
	/**
	 * indica la máxima tasa permitida según el tipo deconductor y la tasa en aire
	 * @param tipoConductor String dato por parámetro
	 * @param aire boolean dado por parámetro
	 * @return double devuelve el máximo de alcohol permitido
	 */
	public double maximaTasaPermitida(String tipoConductor, boolean aire) {
		double tasa=0.25;
		if (tipoConductor.equalsIgnoreCase("General")) {
			if (aire) {
				tasa=0.25;
			} else {
				tasa=0.5;
			}
		} else {
			// profesionales y noveles
			if (aire) {
				tasa=0.15;
			} else {
				tasa=0.3;
			}
		}
		return tasa;
	}

	
}
