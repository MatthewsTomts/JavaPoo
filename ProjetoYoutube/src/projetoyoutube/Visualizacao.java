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
public class Visualizacao {
    private Gafanhoto espec;
    private Video filme;

    public Visualizacao(Gafanhoto espec, Video filme) {
        this.espec = espec;
        this.filme = filme;
        this.espec.viuMaisUm();
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Espectador: " + this.espec.getNome() + ", Filme: " + this.filme.getTitulo();
    }
       
    public void setEspectador(Gafanhoto esp) {
        this.espec = esp;
    }
            
    public Gafanhoto getEspectador() {
        return espec;
    }

    public Video getFilme() {
        return filme;
    }
    
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
}
