/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;
/**
 *
 * @author learn
 */
public final class Caneta {
   private String modelo, cor;
   private float ponta;
   private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getPonta() {
        return ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
   
   public void tampar() {
       this.setTampada(true);
   }
   
   public void destampar() {
       this.setTampada(false);
   }
   
   public void status() {
       System.out.println("SOBRE A CANETA:\nModelo: " + this.getModelo()
               + "\nPonta: " + this.getPonta() + "\nCor: " + this.getCor() +
                "\nTampada: " + this.isTampada());
   }
   
}
