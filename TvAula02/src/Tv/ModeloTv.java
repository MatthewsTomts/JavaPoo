/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tv;

/**
 *
 * @author learn
 */
public class ModeloTv {
    private boolean ligado;
    private String cor, modelo;
    private int canal;

    public boolean isLigado() {
        return ligado;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCanal() {
        return canal;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    void ligar() {
        ligado = true;
    }   
    
    void desligar() {
        ligado = false;
    }
    
    void status() {
        System.out.println("A TV está ligada? " + this.ligado + "\nQual a cor da TV? "
            + cor + "\nQual o modelo da TV? " + this.modelo + 
            "\nQual é o canal na TV? " + this.canal);
    }
}
