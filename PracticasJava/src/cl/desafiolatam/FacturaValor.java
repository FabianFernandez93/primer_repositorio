package cl.desafiolatam;
import java.util.Scanner;
public class FacturaValor {

	public static void main(String[] args) {
		// declaración de variables
		float neto;
		float bruto;
		float iva = 0.19f;
		
		//lectura de datos
		Scanner producto = new Scanner(System.in);
		System.out.println("Ingrese valor del producto: ");
		neto = producto.nextFloat();
		// calculo del iva
		bruto = (neto * iva) + neto;
		// despliegue de resultado
		 System.out.println("El resultado es: " + (bruto));

	}

}
