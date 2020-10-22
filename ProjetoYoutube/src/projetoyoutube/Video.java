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
public class Video implements AcoesVideo {
    private String titulo;
    private int views = 1, likes, avaliacao;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setLikes(0);
        this.setReproduzindo(false);
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Views: " + this.getViews() + ", Likes: " + likes + ", Avaliação: " + avaliacao + ", Reproduzindo: " + reproduzindo;
    }
    
    @Override
    public void play() {
        this.setReproduzindo(true);
    }
    @Override
    public void pausar() {
        this.setReproduzindo(false);
    }
    @Override
    public void like() {
        this.setLikes(this.getLikes() + 1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    protected void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
        float m = (this.avaliacao + avaliacao) / this.views;
    }
    
}
