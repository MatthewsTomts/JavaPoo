/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tv;

import Tv.ModeloTv;

/**
 *
 * @author learn
 */
public class Tv {
    public static void main (String[] args){
        ModeloTv tv1 = new ModeloTv();
        tv1.cor = "preto";
        tv1.ligado = false;
        tv1.canal = 5;
        tv1.modelo = "Asus Smart";
        
        tv1.ligar();
        tv1.status();
        tv1.desligar();
    }
    
}
