package orientacaoobjeto;

/**
 *
 * @author gelvazio.camargo
 */
public class Principal {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(10,"pedro");
        
        // set de dados
//        pessoa.setCodigo(10);
//        pessoa.setNome("João");
        
pessoa.setEstadoCivil("solteiro");
         imprimeDadosPessoa(pessoa);

        //Pessoa pessoaEstadoCivil = new Pessoa(10,"maria", "Casada");
        //imprimeDadosPessoa(pessoaEstadoCivil);
        
//        System.out.println("Calculadora:");
//        Calculadora calc = new Calculadora();
//        System.out.println("1 + 9=>" + calc.soma(1, 9));
//        System.out.println("1 + 9.0F=>" + calc.soma(1, 9.0F));
//        
//        int num[] = {1, 3, 6};
//        System.out.println("1 + 3 + 6=>" + calc.soma(num));
        
    }
    
    static void imprimeDadosPessoa(Pessoa pessoa){
        System.out.println("Pessoa código:" + pessoa.MUDACodigo());
        System.out.println("Pessoa nome:" + pessoa.getNome());
        System.out.println("Pessoa estado civil:" + pessoa.getEstadoCivil());
    }
    
}
