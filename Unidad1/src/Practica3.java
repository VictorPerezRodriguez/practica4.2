import java.util.Scanner;

 public class Practica3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Practica 3 Tema 1 Entornos de Desarrollo");
		System.out.println("Autor: Víctor Pérez Rodríguez");
		
		System.out.println("Escribe un texto: ");
		String texto = teclado.nextLine();
		
		System.out.println("Introduce el primer número: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int num2 = teclado.nextInt();
		
		System.out.println("Introduce el tercer número: ");
		int num3 = teclado.nextInt();
		
		System.out.println("Introduce un número con decimales: ");
		double numDecimales = teclado.nextDouble();
		
		System.out.println(texto);
		
		
		//PARTE 2: Procesamiento de datos
		if (num1 < 0) {
			 num1 = num1 * -1;
		}
		
		if (num2 < 0) {
			 num2 = num2 * -1;
		}
		
		if (num3 < 0) {
			 num3 = num3 * -1;
		}
		
		int resultado = num2 * num3 + num1;
		
		double numArriba = Math.ceil(numDecimales);
		double numAbajo = Math.floor(numDecimales);
		
		//PARTE 3
		System.out.println("El texto es: " + texto);
		System.out.println(num2 + " x " + num3 + " + " + num1 + " = " + resultado);
		System.out.println("Número con decimales: " + numDecimales);
		System.out.println("Siguiente entero: " + numArriba);
		System.out.println("Anterior entero: " + numAbajo);
	}
}