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
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        
        p.tampa();
        c1.status();
        p.rabisca();
    } 
    
}
