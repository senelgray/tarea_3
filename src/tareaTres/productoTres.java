package tareaTres;

import java.util.Scanner;


public class productoTres{
	

	public int numero1;
	public int numero2;
	public int numero3;
	
	public static void main(String[] args) {
		productoTres persona= new productoTres();
		persona.obtenerdato();
	}

	public void obtenerdato() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa el primer numero: ");
		numero1 = scanner.nextInt();
		
		System.out.print("Ingresa el segundo numero: ");
		numero2 = scanner.nextInt();
		
		System.out.print("Ingresa el tercer numero: ");
		numero3 = scanner.nextInt();
		
		int total = numero1*numero2*numero3;
		
			System.out.println("El producto de tres numeros es: "+total);
		}
	
	}
	
