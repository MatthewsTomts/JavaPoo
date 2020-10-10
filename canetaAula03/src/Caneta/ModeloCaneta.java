/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caneta;

/**
 *
 * @author learn
 */

public class ModeloCaneta {
    public String modelo, cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status(){
        System.out.println("Modelo: " + this.modelo + "\nUma caneta " + this.cor
        + "\nPonta: " + this.ponta + "\nCarga: " + this.carga + "%" +
        "\nEsta caneta está tampada? " + this.tampada);
    }
            
    public void rabiscar(){
        if (this.tampada == false){
            System.out.println("Estou rasbicando");
        } else {
            System.out.println("Destampe!");
        }
    }
    
    protected void tampar() {
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
}
