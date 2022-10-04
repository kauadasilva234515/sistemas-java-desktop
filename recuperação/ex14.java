package recuperação;

import java.util.Scanner;

public class ex14 {
    public  class kauan {
        public static void main(String[] args) {
//2.2. MATEMÁTICA – 2 QUESTOES – PESO = 0.10 e 0.20
//
//2.2.1 – Peso – 0.10 - Média aritmética -
// Escrever programa que lê três notas inteiras
// e calcula a sua média aritmética.
            Scanner teclado=new Scanner(System.in);

            int n1,n2,n3;
            int media=0;

            System.out.println("Digite 3 notas inteiras");
            n1=teclado.nextInt();
            n2=teclado.nextInt();
            n3=teclado.nextInt();

            media=(n1+n2+n3)/3;

            System.out.println("Media "+media);
        }
    }
}
