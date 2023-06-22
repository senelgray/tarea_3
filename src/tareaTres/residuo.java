package tareaTres;
import java.util.Scanner;

public class residuo {

	
	public int numero1;
	public int numero2;
	
	public static void main(String[] args) {
		residuo datores= new residuo();
		datores.obtenerdatos();
	}

	public void obtenerdatos() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa el primer numero: ");
		numero1 = scanner.nextInt();
		
		System.out.print("Ingresa el segundo numero: ");
		numero2 = scanner.nextInt();
		
		int restante = numero1%numero2;
		int total = numero1/numero2;
		
			System.out.println("El resultado de la division es: "+total+ " y el residuo es: "+restante);
		}
	
	}