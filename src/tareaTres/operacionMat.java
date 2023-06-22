package tareaTres;
import java.util.Scanner;

public class operacionMat {

	int total;
	
	public static void main (String []args){
		
		operacionMat opmate = new operacionMat();
		opmate.producto();
		
	}
	public void producto(){
		Scanner scanner = new Scanner(System.in);
		
		total = -16 + (32 /( 4*(48 - 7)))% ((11*(18 + 2)) / ((17 - 12)*17)) - 18/(6 * 3) + 11%4;
		
		System.out.print("El resultado de la siguiente operacion -16 + 32 / 4 (48 - 7)% 11 (18 + 2) / (17 - 12) 17 - 18 / 6 * 3 + 11% 4, es:" +total);
	}
}