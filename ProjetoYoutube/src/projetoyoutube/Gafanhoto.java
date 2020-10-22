/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author learn
 */
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nom, String sex, int idad, String login) {
        super(nom, sex, idad);
        this.login = login;
        this.setTotAssistido(-1);
        
    }
    
    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    @Override
    public String toString() {
        return super.toString() + ", Login: " + login + ", Total assistido: " + totAssistido;
    }
    
    @Override
    protected void ganharExp(float exp) {
        this.setExperiencia(this.getExperiencia() + exp);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistindo) {
        this.totAssistido = totAssistindo;
    }
    
}
