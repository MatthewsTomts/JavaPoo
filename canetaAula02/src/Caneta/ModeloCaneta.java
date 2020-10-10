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
    String modelo, cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo + "\nUma caneta " + this.cor
        + "\nPonta: " + this.ponta + "\nCarga: " + this.carga + "%" +
        "\nEsta caneta está tampada? " + this.tampada);
    }
            
    void rabiscar(){
        if (this.tampada == false){
            System.out.println("Estou rasbicando");
        } else {
            System.out.println("Destampe!");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
