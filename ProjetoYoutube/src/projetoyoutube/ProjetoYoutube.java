/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author learn
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[5];
        Gafanhoto g[] = new Gafanhoto[2];
        
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        v[3] = new Video("Ele rachou de rir");
        v[4] = new Video("buu. Fantasma!");
        g[0] = new Gafanhoto("Roger", "M", 20, "Morho");
        g[1] = new Gafanhoto("Oliver", "M", 23, "Morho");
        
        Visualizacao vis = new Visualizacao(g[1], v[4]);
        
        g[1].viuMaisUm();
        vis.avaliar();
        System.out.println(g[1].toString());
        System.out.println(v[4].toString());
        System.out.println(vis.toString());
    }
    
}
