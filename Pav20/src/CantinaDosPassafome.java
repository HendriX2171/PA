import java.util.Scanner;

public class CantinaDosPassafome {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id;
		
		System.out.println("Coloque o Codigo do Seu Produto sendo:");
		System.out.println("1 = Cachorro Quente");
		System.out.println("2 = Cheeseburger");
		System.out.println("3 = X-Salada");
		System.out.println("4 = Misto Quente");
		System.out.println("5 = Pão na chapa");
		id = ler.nextInt();
		
		switch (id) {
		case 1 :
			System.out.println("Cachorro Quente R$8,00");
			break;
		case 2 :
			System.out.println("Cheeseburger R$12");
			break;
		case 3 :
			System.out.println("X-Salada R$15");
			break;
		case 4 :
			System.out.println("Misto Quente R$11");
			break;
		case 5 :
			System.out.println("Pão na chapa R$6");
			break;
			default :
				System.out.println("Esse produto não existe");
		
		
		
		
		
		
		}
		

	
	
	
	
	
	
	}

}
