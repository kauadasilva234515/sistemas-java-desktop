package recuperação;

import java.util.Scanner;

public class ex21 {
    public  class kauan {
        public static void main(String[] args) {
//3.1. SAÍDA SIMPLES – 3 QUESTOES – PESO = 0.5
//3.1.1 - Menu principal -
// Faça um programa de menu que mostra na tela, sob o título de "Menu
//Principal", três opções: "1 - Fim", "2 -
// Cadastro" e "3 - Consulta", lê do teclado a opção
// desejada pelo usuário e mostra uma mensagem confirmando
// a opção escolhida ou uma mensagem de erro, se a opção for inválida

            Scanner teclado=new Scanner(System.in);

            System.out.println("Menu Principal");
            System.out.println("1-Fim , 2 - Cadastro , 3- Consulta");
            int valor=teclado.nextInt();

            if (valor == 1 ){
                System.out.println("Voce Chegou ao fim");
            }
            if (valor == 2){
                System.out.println("Voce chegoyu no Cadastro");
            }
            if (valor == 3 ){
                System.out.println("Voce chegou na consulta");
            }
            if(valor > 3) {
                System.out.println("alternativa invalida");
            }
        }
    }
}
