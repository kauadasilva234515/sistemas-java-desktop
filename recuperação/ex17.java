package recuperação;

import java.util.Scanner;
public class ex17 {
public  class kauan {
        public static void main(String[] args) {
//2.2. MATEMÁTICA – 2 QUESTOES – PESO = 0.10 e 0.20
            //  2.2.4 – Peso – 0.10 - Aritmética básica -
            //  Implemente um programa que lê dois números quaisquer
            //  e informa sua soma, diferença, produto e quociente

            Scanner teclado = new Scanner(System.in);

            int n1,n2,resultadosoma,resultadodiferenca,resultadoproduto;
            double cocie;
            System.out.println("Digite dois valores");
            n1=teclado.nextInt();
            n2= teclado.nextInt();

            resultadosoma=n1+n2;
            resultadodiferenca=n1-n2;
            resultadoproduto=n1*n2;
            cocie=n1/n2;

            System.out.println("Soma "+resultadosoma );
            System.out.println("Diferenca "+ resultadodiferenca);
            System.out.println("Produto " + resultadoproduto);
            System.out.println("Quociente " + cocie);


        }
    }
}
