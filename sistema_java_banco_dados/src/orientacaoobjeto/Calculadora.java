package orientacaoobjeto;

/**
 *
 * @author gelvazio.camargo
 */
public class Calculadora {
    
    public int soma(int a, int b){
        return a + b;
    }
    
    public int soma(int a, int b, int c){
        int resultado = this.soma(a,c) + c;
        return resultado;
    }
    
    public float soma(float a, float b){
        return a + b;
    }
    
    public long soma(int[]numeros){
        long resultado = 0;
        for(int i = 0; i < numeros.length; i++){
            resultado += numeros[i];
        }
        return resultado;
    }
}
