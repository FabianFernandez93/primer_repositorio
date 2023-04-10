package cl.desafiolatam;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		int n2; 
		float resultado;
			Scanner tecla=new Scanner (System.in);
			
			 System.out.println("Ingrese primer Numero: ");
			 n1=tecla.nextInt();
			 System.out.println("Ingrese segundo Numero: ");
			 n2=tecla.nextInt();
			 			
		// estoy haciendo una division resultado = n1 + n2;
		resultado = (float)n1/(float)n2;
		
		
		System.out.println(resultado);
		}
		// TODO Auto-generated method stub
}


