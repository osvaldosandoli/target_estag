package java_est;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int vlr;
		
		System.out.print("Digte o valor final: ");
		vlr = teclado.nextInt();
		
		int x=0;
		
		int y=0;
		System.out.print(y+ " ");
		y ++;
		int aux;
		int validador=0;
		
		
		
	
		for (int i = 0; i < vlr; i++) {	
		System.out.print(y + " ");
		
		aux = y;
		y = y +x;
		
		x = aux;
		
		if(y == vlr) {
			validador = 1;
		}
		
		
		}
		System.out.println();
		if(validador ==1) {
			System.out.println("O numero " +vlr + " faz parte da sequencia de Fibonacci");	
		}
		
		else if (validador == 0){
			System.out.println("O numero " +vlr + " não faz parte da sequencia de Fibonacci");	
		}
		teclado.close();
	}

}
