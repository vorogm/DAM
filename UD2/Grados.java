//  Ejercicio 2 Entorno De Desarrollo Tema 2

import java.util.Scanner;   // importamos esta libreira para poder pedir datos por pantalla

public class Grados{
			public static void main(String[] args){
							
				
				int Fahrenheit = 0;
				Scanner lectura = new Scanner (System.in);   // Creamos variable para pedir datos

				System.out.print("\n\t Ingrese los grados Centigrados deseados: ");
					
				String Grados = lectura.next();   // Aqui pedimos los datos 

						// Utilizamos un Try por si el dato introducido no fuese un numero. Ya que esto 
						// daría error al hacer los cálculos.
				try {

					// Como Scanner devuelve en Strings, debemos pasarlo a Integer para poder calcular

					Fahrenheit = (Integer.parseInt(Grados)*9/5) + 32; 
				
					// Mostramos el resultado si no da error
				
					System.out.println("\n\t" + Grados + " grados Celsius son " + Fahrenheit + " grados Fahrenheit"); 
				}
				catch(Exception e) {

						// Si da error, mostrará este mensaje

					System.out.println("\n\t --- ERROR 245: debes introducir un numero. ---\n");
				} 


				System.out.println("\n\t 31-10-2024  Salvador Garcia Molina");

			


			}

}

