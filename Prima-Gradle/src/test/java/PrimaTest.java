

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class PrimaTest {

	
		@Test
		public void prima_c1() {
			Prima p1 = new Prima(95,10);
			int valor_esperado  = -1;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		
		@Test
		public void prima_c2() {
			Prima p1 = new Prima(20,30);
			int valor_esperado  = 1350;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
	 
		@Test
		public void prima_c3() {
			Prima p1 = new Prima(20,28);
			int valor_esperado  = 1400;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		
		@Test
		public void prima_c4() {
			Prima p1 = new Prima(26,30);
			int valor_esperado  = 850;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		
		@Test
		public void prima_c5() {
			Prima p1 = new Prima(30,10);
			int valor_esperado  = 900;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		@Test
		public void prima_c6() {
			Prima p1 = new Prima(40,30);
			int valor_esperado  = 400;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		@Test
		public void prima_c7() {
			Prima p1 = new Prima(40,10);
			int valor_esperado  = 500;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		@Test
		public void prima_c8() {
			Prima p1 = new Prima(50,30);
			int valor_esperado  = 250;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		@Test
		public void prima_c9() {
			Prima p1 = new Prima(50,10);
			int valor_esperado  = 400;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		@Test
		public void prima_c10() {
			Prima p1 = new Prima(65,30);
			int valor_esperado  = 550;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		@Test
		public void prima_c11() {
			Prima p1 = new Prima(65,10);
			int valor_esperado  = 750;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
 
		@Test
		public void prima_c12() {
			Prima p1 = new Prima(10,10);
			int valor_esperado  = -1;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		@Test
		public void prima_c13() {
			Prima p1 = new Prima(30,45);
			int valor_esperado  = -1;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		
		@Test
		public void prima_c14() {
			Prima p1 = new Prima(30,-2);
			int valor_esperado  = -1;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;

				
		}
		@Test
		public void prima_c15() {
			Prima p1 = new Prima(-2,-2);
			int valor_esperado  = -1;
			int resultado = p1.calcularPrima();
			assertEquals(valor_esperado, resultado,0) ;	
		}
 
 
 
 
 
 
 
	
}
