package recuperação;

import java.util.Scanner;

public class ex15 {
    public  class kauan {
        public static void main(String[] args) {
//2.2. MATEMÁTICA – 2 QUESTOES – PESO = 0.10 e 0.20
//2.2.2 – Peso – 0.10 - Média geométrica -
// Elabore um programa que lê três valores e calcula a média
// geométrica dos números lidos (divisão do produto pela quantidade de valores).
            Scanner teclado=new Scanner(System.in);

            int n1,n2,n3,resultado;
            double media=0;

            System.out.println("Digite 3 notas inteiras");
            n1=teclado.nextInt();
            n2=teclado.nextInt();
            n3=teclado.nextInt();
            resultado=n1+n2+n3;
            media=resultado/3;

            System.out.println("Media "+media);
        }
    }
}
