import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 0;
		int resultado;

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");			
		numero1 = reader.nextInt();
			
		System.out.println("Introduce el segundo número:");
		numero2 = reader.nextInt();
			
		// Dividimos
		resultado = numero1/numero2;
		
		System.out.println("La división es " + numero1 + " / " + numero2 + " = " + resultado);
		
		// Cerramos el stream de lectura
		reader.close();
			
	}

}