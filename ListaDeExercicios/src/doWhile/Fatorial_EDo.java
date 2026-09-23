package pa.doWhile;
import java.util.Scanner;

public class Fatorial_EDo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero,contador;

        System.out.print("Digite um número inteiro: ");
        numero = ler.nextInt();

        long fatorial = 1;
        contador = numero;
        
        	do {
            fatorial = fatorial * contador;
            contador--;
        	} while (contador>1);

        System.out.println("O fatorial de " + numero + " é " + fatorial);

        ler.close();
    }
}