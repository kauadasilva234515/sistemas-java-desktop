/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoobjeto;

/**
 *
 * @author kaua.silveira1
 */
public class Exemploexcesao {
    public static void main(String[] args) {
        int x = 0;
        
        try{
              int y = 100 / x;
                    
                    System.out.println("Resultado: "+y);
                } catch(ArithmeticException e){
                    System.out.println("Operação inválida!"
                        + "\n Detalhes do erro:" + e.getMessage());
                                      
                    } finally {
                    System.out.println("Finalizando!!!");
                }
            
            
        }
    }
            
    
