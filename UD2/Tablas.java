//  Ejercicio 3 Entorno De Desarrollo Tema 2

public class Tablas{
			public static void main(String[] args){
				
				/* El primer for es para cambiar de tabla. Cada vez que el segundo for acabe, 
				 cambiara a la siguiente tabla
					El segundo es para recorrer los 10 números de cada tabla. **/

				for(int Tabla=1;Tabla<11;Tabla++){
				
					System.out.println("\n \tTABLA DEL " + Tabla + " \n" );

					for(int Numero=1; Numero<11; Numero++){
					
						System.out.println("\t" + Numero + " por " + Tabla + " = " + Numero*Tabla);
					}
					
				}
				System.out.println("\n\t 31-10-2024  Salvador Garcia Molina");

			}


}