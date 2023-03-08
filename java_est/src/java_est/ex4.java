package java_est;

public class ex4 {

	public static void main(String[] args) {
		//estados
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double OT = 19849.53;
		//total 180.759,98
		
		//calculo porcentagem
		double totalSoma;
		double totalSP;
		double totalRJ;
		double totalMG;
		double totalES;
		double totalOT;
		
		//soma das porcentagens
		double totalSomaPorcentagem;
		
		
		totalSoma = SP + RJ + MG + ES + OT;
		//180759.98
		
		totalSP = (SP / totalSoma) *100;
		//37.52845624346716
		
		totalRJ = (RJ / totalSoma) *100;
		//20.291360952794975
		
		totalMG = (MG / totalSoma) *100;
		//16.170548370275323
		
		totalES = (ES / totalSoma) *100;
		//15.028481414968068
		
		totalOT = (OT / totalSoma) *100;
		//10.981153018494469
		
		totalSomaPorcentagem = totalSP + totalRJ + totalMG + totalES + totalOT;
		//	100.0%
		
		
		System.out.println("SP - "+ String.format("%.2f", totalSP) +"%");
		System.out.println("RJ - "+ String.format("%.2f", totalRJ) +"%");
		System.out.println("MG - "+ String.format("%.2f", totalMG) +"%");
		System.out.println("ES - "+ String.format("%.2f", totalES) +"%");
		System.out.println("OT - "+ String.format("%.2f", totalOT) +"%");
		System.out.println("Soma - " +totalSomaPorcentagem + "%");
		
		
		
		
		
		
	
		
		

	}

}
