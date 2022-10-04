package recuperação;

import java.util.Scanner;

public class ex13 {
    public  class kauan {
        public static void main(String[] args) {
            //2.1.2 - Etiqueta - Escreva um programa que lê do
            // teclado seu nome completo, endereço, CEP e telefone,
            // e mostra seu nome na primeira linha, seu endereço na segunda,
            // e o CEP e telefone na terceira.

            Scanner teclado=new Scanner(System.in);

            String nome, endereço;
            int CEP, telefone;

            System.out.println("Digite seu Nome Completo");
            nome=teclado.next();

            System.out.println("Digite seu Endereco");
            endereço=teclado.next();

            System.out.println("Digite seu Cep");
            CEP=teclado.nextInt();

            System.out.println("Digite seu Telefone");
            telefone=teclado.nextInt();

            System.out.println("==========================");

            System.out.println("Nome: "+nome);
            System.out.println("Endereco "+endereço);
            System.out.println("Cep: "+CEP +"Telefone: "+telefone);
        }
    }
}
