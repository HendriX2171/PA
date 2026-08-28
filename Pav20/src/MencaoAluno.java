import java.util.Scanner;

public class MencaoAluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String mencao;
		
		System.out.println("Digite sua menção");
		mencao = ler.next();
		switch(mencao) {
		case "i":
		case "I":
			System.out.println("Menção insatisfatória");
			break;
		case "r" :
		case "R" :
			System.out.println("Menção Regular");
			break;
		case "b" :
		case "B" :
			System.out.println("Menção Bom, Continue assim");
			break;
		case "mb" :
		case "Mb" :
		case "mB" :
		case "MB" :
			System.out.println("Menção Muito Boa, Você está de parabens");
			break;
			default:
				System.out.println("Essa Menção não Existe");
		
			
		}

	
	
	}

}
