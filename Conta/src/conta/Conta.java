/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author learn
 */
public class Conta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco conta1 = new ContaBanco();
        
        conta1.setNumConta(777777);
        conta1.setDono("Oliver");
        conta1.abrirConta("CC");
        
        ContaBanco conta2 = new ContaBanco();
        
        conta2.setNumConta(666666);
        conta2.setDono("Roger");
        conta2.abrirConta("CP");
        
        conta1.depositar(727);
        conta2.depositar(4654663);       
        conta1.sacar(777);
        conta2.sacar(666666666);
        
        conta1.fecharConta();
        
        conta1.estado();
        conta2.estado();
    }
    
}
