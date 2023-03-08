package java_est;

import java.util.Scanner;

public class ex3 {
					//FAIL
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		
		int dias;
		System.out.println("Digite o numero de diarias");
		dias = teclado.nextInt();
		
		double aux=0;
		double sum=0;
		
		double [] faturamento_diario = new double [dias];
		
		dias = dias +1;
		
		for (int i = 1; i <= dias; i++) {
			System.out.println("Digite o faturamento do dia " + i +":");
			faturamento_diario[i] = teclado.nextDouble();
			
			
			sum = sum + faturamento_diario[i];
			
			if(faturamento_diario[i] < faturamento_diario[i+1]) {
				aux = faturamento_diario[i];
			}
			
		}
		System.out.println(aux);
		
		
	}

}
