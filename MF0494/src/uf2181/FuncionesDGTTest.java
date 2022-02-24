/**
 * 
 */
package uf2181;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Virginia
 *
 */
class FuncionesDGTTest {
	private static FuncionesDGT funcionesDGT;
	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		funcionesDGT= new FuncionesDGT();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Antes de cada test");
	}
	@Test
	void mediapuntos() {
		int puntos[]= {1,2};
	}
@Test
void máximaTasaPermitida() {
	assertEquals("General",funcionesDGT.maximaTasaPermitida(null, false));
}

}
