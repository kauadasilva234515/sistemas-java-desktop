package recuperação;

import java.util.Scanner;

public class ex20 {
    public  class kauan {
        public static void main(String[] args) {
//2.2. MATEMÁTICA – 2 QUESTOES – PESO = 0.10 e 0.20
            //  2.2.6 – Peso – 0.20 - Nota final -
            //  O critério de notas de uma faculdade consiste
            //  de uma nota de 0 a 10 em cada bimestre, sendo
            //  a primeira nota peso 2 e a segunda peso 3. Elabore
            //  um programa que lê as notas bimestrais e calcula a
            //  nota do semestr

            Scanner teclado=new Scanner(System.in);
            double  n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;

            n1=2; n2=3;

            System.out.println("Digite as 8 notas restantes");
            n3= teclado.nextDouble();
            n4= teclado.nextDouble();
            n5= teclado.nextDouble();
            n6= teclado.nextDouble();
            n7= teclado.nextDouble();
            n8= teclado.nextDouble();
            n9= teclado.nextDouble();
            n10= teclado.nextDouble();

            double resultado;
            resultado=(n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10;

        }
    }
}
