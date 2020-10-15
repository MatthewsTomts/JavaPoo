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
public class Luta {
    //Atributos
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos Personalizados
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar() {
        if (this.getAprovada()) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            double vencedor = 0 + Math.random() * 3;
            int vence = (int) vencedor;
            System.out.println(vence);
            switch (vence) {
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Ganhou Desafiado
                    System.out.println("O Desafiado Venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Ganhou Desafiante
                    System.out.println("O Desafiante Venceu!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
    
    //Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
