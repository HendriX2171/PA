package pa.doWhile;

import java.util.Scanner;

public class potencia_eDo {

    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         double resultado, base;
         int contador, expoente;

    System.out.print("Digite a base: ");
    base = ler.nextDouble();

    System.out.print("Digite o expoente: ");
    expoente = ler.nextInt();
    
    if (expoente == 0) {
    	System.out.println("Resultado: 1");
    }
    else {
    	

    resultado = 1;
    contador = 0;

    do {
        resultado = resultado * base;
        contador++;
    } while (contador < expoente);

    System.out.println("Resultado: " + resultado);

    ler.close();
    }
}
}