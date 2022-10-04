package recuperação;

import java.util.Scanner;
public class ex7 {
    public class kauan {
        public static void main(String[] args) {
            Scanner teclado=new Scanner(System.in);

//4 - Imposto - Um imposto é calculado com base na seguinte tabela:
//Até 1.200,00 isento
//de 1.201,00 a 5.000,00 10%
//de 5.001,00 a 10.000,00 15%
//acima de 10.000,00 20%.
//Implemente um programa que calcule os impostos a pagar para
// um valor em cada faixa. Para cada um, mostre uma mensagem que
// identifique na tela a que se refere cada valor.
            double valor = 0,imp1,imp2,imp3;
            System.out.println("Digite um valor");
            valor=teclado.nextDouble();

            if (valor< 1.200){
                System.out.println("Até 1.200,00 isento");

            }
            if ((valor > 1.201)  && (valor  < 5.000)){
                System.out.println("de 1.201,00 a 5.000,00 10%");
                valor=valor*(10/100);
                System.out.println("Resultado com juros "+valor);
            }
            if ((valor > 5.001)  && (valor  < 10.000)){
                System.out.println("de 5.001,00 a 10.000,00 15%");
                valor=valor*(15/100);
                System.out.println("Resultado com juros "+valor);
            }
            if (valor > 10.000){
                System.out.println("de 10.000 +, 20%");
                valor=valor*(20/100);
                System.out.println("Resultado com juros "+valor);
            }
        }
        }
    }

