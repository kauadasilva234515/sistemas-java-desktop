package recuperação;

public class ex9 {
    public class kauan {
        public static void main(String[] args) {
//1.2.6 - Cálculo de notas - Um professor atribui pesos de 1 a 4
// para as notas de quatro avaliações. A nota é calculada por meio
// da média ponderada (N1 + N2*2 + N3*3 + N4*4)/10, onde N1 é a nota da
//primeira avaliação, N2 a da segunda, etc. Um aluno tirou as seguintes
// notas: 8 - 7,5 - 10 - 9. Faça um programa que calcula e mostra as notas
// e a média deste aluno.
            double n1=8;
            double n2= 7.5;
            double n3= 10;
            double n4= 9;
            double media=(n1 + n2*2 + n3*3 + n4*4)/10;
            System.out.println("Media igual a "+media);

        }
    }
}
