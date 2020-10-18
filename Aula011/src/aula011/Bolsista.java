/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

/**
 *
 * @author learn
 */
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Bolsa de " + this.nome + " foi renovada");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade de " + this.getNome() + " paga com o desconto de " + this.getBolsa() + "%");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
