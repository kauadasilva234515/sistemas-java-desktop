package orientacaoobjeto;

/**
 *
 * @author gelvazio.camargo
 */
// public, protected, private
public class Pessoa {
    
    // atributos
    private int codigo;
    private String nome;
    private String estadoCivil;

    public Pessoa(){
        
    }
    
    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Pessoa(int codigo, String nome, String estadoCivil) {
        this.codigo = codigo;
        this.nome = nome;
        this.estadoCivil = estadoCivil;
    }

    
    
    
    
    
    
    
    
    // RETORNAM O VALOR PELO TIPO DE DADO
    // RETORNA O TIUPO INT
    public int MUDACodigo() {
        return codigo;
    }
    
    // retornando um tipo de dado Calculadora
    public Calculadora getCalculadora(){
        
        
        Calculadora calc = new Calculadora() ;
        
        int num = 2;
        
        
        return calc;
    }
    
    public void calculaImpostoRenda(double salario){
        
        // faz calculo
        
        // NAO RETORNA EM METODO DO TIPO VOID!!
    }

    // VOID nao retorna valores!!!
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
