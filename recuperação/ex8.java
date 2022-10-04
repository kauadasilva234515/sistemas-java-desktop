package recuperação;

public class ex8 {
    public class kauan {
        public static void main(String[] args) {

            //Tempo dedicado - Uma pessoa com pouco tempo disponível
            // lê um livro por 15 minutos a cada dia, 5 dias por semana.
            // Monte a fórmula e escreva um programa que calcula e mostra
            // na tela quanto tempo, em horas, a pessoa terá dedicado ao
            // livro ao final de um ano.

            double Tempo=0.25;
            int dia=24;
            int mes=30;
            int ano=365;

            double horas=(Tempo*mes)*ano;
            System.out.println("Tera dedicados "+ horas +" horas");

        }
    }
}
