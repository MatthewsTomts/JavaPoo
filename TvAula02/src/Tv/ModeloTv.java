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
    boolean ligado;
    String cor, modelo;
    int canal;
    
    void ligar() {
        ligado = true;
    }   
    
    void desligar() {
        ligado = false;
    }
    
    void status() {
        System.out.println("A TV está ligada? " + ligado + "\nQual a cor da TV? "
            + cor + "\nual o modelo da TV? " + modelo + 
            "\nQual é o canal na TV? " + canal);
    }
}
