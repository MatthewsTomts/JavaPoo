/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UltraEmojiCombat;
/**
 *
 * @author learn
 */
public class UltraEmojiCombat {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[]  = new Lutador[6];
        l[0] = new Lutador("Oliver", "Japão", 20, 20, 10, 5, 70.4, 1.70);
        l[1] = new Lutador("Roger", "Canadá", 25, 40, 0, 0, 83.9, 2);
        l[2] = new Lutador("Harvey", "Itália", 23, 20, 3, 0, 90, 2.5);
        l[3] = new Lutador("Olivia", "Brasil", 22, 3, 20, 0, 93, 1.6);
        l[4] = new Lutador("Madeleine", "EUA", 24, 30, 0, 0, 60, 1.6);
        l[5] = new Lutador("Mark", "Jamaica", 27, 25, 7, 8, 70, 1.8);
        Luta uec01 = new Luta();        
        
        uec01.marcarLuta(l[0], l[1]);
        uec01.lutar();
        
        
        /*l[1].ganharLuta();
        l[0].perderLuta();
        l[3].setPeso(92);
        l[2].setPeso(100);
        l[4].setIdade(20);
        l[5].setIdade(30);*/
        
        l[0].status();
        l[1].status();
        /*l[2].status();
        l[3].status();
        l[4].apresentar();
        l[5].apresentar();*/
    }
    
}
