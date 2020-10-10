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
public class Pergunta {
    static Scanner tec = new Scanner(System.in);
    static ModeloCaneta c = new ModeloCaneta();
    static String resp;
    
    static void tampa() {
        System.out.print("Quer destampar a caneta [S/N] ");
        resp = tec.next();
        if (resp.equals("S") || resp.equals("s")) {
            c.destampar();
        } else {
            c.tampar();
        }
    }
    
    static void rabisca() {
        System.out.print("Quer rabiscar? [S/N] ");
        resp = tec.next();
        if (resp.equals("S") || resp.equals("s")) {
            if (!c.tampada) {
                System.out.println("Estou rabiscando");
            } else {
                System.out.println("Destampe!");
            }
        } else {
            System.out.println("OK!");
        }
    }
    
}
