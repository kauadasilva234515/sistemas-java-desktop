package recuperação;

import java.util.Scanner;

public class ex16 {
    public  class kauan {
        public static void main(String[] args) {
//2.2. MATEMÁTICA – 2 QUESTOES – PESO = 0.10 e 0.20
            //    2.2.3 – Peso – 0.10 - Média ponderada -
            //    Implemente um programa que lê três valores e calcule
            //    a média ponderada para pesos 1, 2 e 3, respectivamente
            //    (multiplique cada nota pelo seu peso, some os produtos
            //    e divida o resultado pela soma dos pesos).
            Scanner teclado = new Scanner(System.in);

            int n1,n2,n3;
            System.out.println("Digite 3 valores");
            n1=teclado.nextInt();
            n2=teclado.nextInt();
            n3=teclado.nextInt();

            int n1r,n2r,n3r,resultado;
            n1r=n1*1;
            n2r=n2*2;
            n3r=n3*3;

            resultado=(n1r+n2r+n3r)/6;
            System.out.println("Resultado="+ resultado);
        }
    }
}
