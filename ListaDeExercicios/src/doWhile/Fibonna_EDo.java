package pa.doWhile;
import java.util.Scanner;
public class Fibonna_EDo {


	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1, numero, atual = 0, anterior = 1,proximo;
		
		System.out.println("Digete um quantos algarismo voçê quer");
		numero = ler.nextInt();
		
		 do{
			proximo = atual + anterior;
			atual = anterior;
			anterior = proximo;
			System.out.println(atual);
			i++;
			
					
		}while(i <= numero);

	}

}