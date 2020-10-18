/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula012;

/**
 *
 * @author learn
 */
public class Aula012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero[] m = new Mamifero[2];
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru k = new Canguru();
        Cachorro c = new Cachorro();
        
        m[1].setPeso(85.6f);
        m[1].setIdade(2);
        m[1].setMembros(4);
        m[1].locomover();
        m[1].alimentar();
        m[1].emitirSom();
        System.out.println("");
        
        r.setPeso(200);
        r.setIdade(30);
        r.setMembros(0);
        r.locomover();
        r.alimentar();
        r.emitirSom();
        System.out.println("");
        
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        System.out.println("");
        
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(4);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println("");
        
        m[1].setPeso(5.70f);
        m[1].setIdade(8);
        m[1].setMembros(4);
        m[1].locomover();
        m[1].alimentar();
        m[1].emitirSom();
        System.out.println("");
        
        k.setPeso(55.30f);
        k.setIdade(3);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.usarBolsa();
        System.out.println("");
        
        c.setPeso(3.94f);
        c.setIdade(5);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.enterrarOsso();
        c.abanarRabo();
    }
    
}
