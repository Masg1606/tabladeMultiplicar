import java.util.Scanner;
import javax.swing.JOptionPane;

public class tablaDeMultiplicar {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("TABLA DE MULTIPLICAR ");		
		System.out.println("Ingrese un número ");		
		
		int numero = entrada.nextInt();
		
		System.out.println("Ingrese la cantidad de veces a multiplicar ");
		
		int nveces = entrada.nextInt();						
		
		for (int i=1; i<=nveces; i++) {
			
			System.out.println(numero + " x " + i + " = " + (int)numero * i);			
		}
	}
	
}
