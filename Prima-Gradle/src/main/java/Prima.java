
import java.util.ArrayList;


public class Prima {

	static ArrayList<Datos> tabla = new ArrayList<Datos>();
	public int edad;
	public int puntos;
	
	    
	    
	  public Prima(int  edad, int puntos) {
      	this.edad = edad;
      	this.puntos = puntos;
      	cargar();
      }
       
      
        
        private static void cargar() {
            final Datos d1 = new Datos(18, 24, 2.8, 1, 50);
            final Datos d2 = new Datos(25, 34, 1.8, 3, 50);
            final Datos d3 = new Datos(35, 44, 1, 5, 100);
            final Datos d4 = new Datos(45, 64, 0.8, 7, 150);
            final Datos d5 = new Datos(65, 90, 1.5, 5, 200);
            tabla.add(d1);
            tabla.add(d2);
            tabla.add(d3);
            tabla.add(d4);
            tabla.add(d5);

        }

        public int calcularPrima() {
            int prima = 0; // declared prematurely
            
            if( edad < 18 || puntos < 0 || puntos >30 || edad  > 90 ){
            	System.out.println("No cumple requisitos");
                return -1;
            }
          
            for (Datos d : tabla) {
                if (edad >= d.edad_inicial && edad <= d.edad_final) {
                    int puntosPerdidos = 30 - puntos;
                    if (puntosPerdidos <= d.puntos_max_perdidos) {
                        prima = (int) (500 * d.factor_edad - d.reduccion);

                        
                    } else {
                        prima = (int) (500*d.factor_edad);
                       
                    }

                }

            }
            System.out.println("Prima: " +prima);
            return prima;
        
          
        }
}
      