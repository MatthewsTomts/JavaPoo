/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caneta;

import java.util.Scanner;

/**
 *
 * @author learn
 */
public class Caneta {

    /**
     * @param args the command line arguments
     */                               
    public static void main(String[] args) {
        // TODO code application logic here
        ModeloCaneta c1 = new ModeloCaneta();
        Pergunta p = new Pergunta();
        c1.cor = "Azul";
        c1.ponta = 0.6f;
        c1.carga = 50;
        c1.tampar();
        c1.modelo = "Cristal";          

        p.tampa();
        p.rabisca();
        c1.status();       
    } 
    
}
