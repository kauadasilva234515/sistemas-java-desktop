package recuperação;

import java.util.Scanner;

public class ex18 {
    public  class kauan {
        public static void main(String[] args) {
//2.2. MATEMÁTICA – 2 QUESTOES – PESO = 0.10 e 0.20
            //  2.5 – Peso – 0.20 - Funções matemáticas -
            //  Elabore um programa que lê um número
            //  (suponha que será positivo) e informa seu quadrado
            //  , raiz e exponencial. Para expoente use a função
            //  JAVA Math.pow(base, expoente) e para raiz quadrada
            //  use a função JAVA Math.sqrt (base, expoente).

            Scanner teclado = new Scanner( System.in);
            int n1,quadrado,raiz,expoente;
            System.out.println("Digite um Valor");
            n1 = teclado.nextInt();

            quadrado=n1*n1;
            raiz=  n1*n1;
            expoente=n1+n1;

            System.out.println(quadrado+"quadrado "+raiz +"raiz"+expoente+"expoente");
        }
    }
}
