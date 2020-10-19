/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula013;

/**
 *
 * @author learn
 */
public class Aula013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro c = new Cachorro();
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        
        c.emitirSom();
        l.emitirSom();
        m.emitirSom();
        System.out.println("");
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        System.out.println("");
        c.reagir(11, 45);
        c.reagir(21, 00);
        System.out.println("");
        c.reagir(true);
        c.reagir(false);
        System.out.println("");
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
    
}
