/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

import java.util.Scanner;

/**
 *
 * @author learn
 */
public class ContaBanco {
    
    //Atributos
    public int numConta;
    private String dono;
    protected String tipo;
    private float saldo;
    private boolean status;

    //Métodos Especiais
    public void ContaBanco() {
        this.tipo = "";
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public int getNumConta() {
        return this.numConta;
    }

    public String getDono() {
        return this.dono;
    }

    public String getTipo() {
        return this.tipo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //Métodos
    public void abrirConta(String t) {
        if (t.equals("CC") || t.equals("CP")){
            this.setTipo(t);
            this.setStatus(true);
            if (this.getTipo().equals("CC")) {
                this.setSaldo(this.getSaldo() + 50);
            } else if (this.getTipo().equals("CP")) {
                this.setSaldo(this.getSaldo() + 150);
            }
            System.out.println("Conta aberta com sucesso!");
        } else {
            System.out.println("Esse não é um tipo válido.");
        }       
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Sua conta tem dinheiro, retire-o, por favor");
        } else if (this.getSaldo() < 0) {
            System.out.println("Sua conta está em débito, por favor pague o débito");
        } else {
            System.out.println("Sua conta agora está fechada");
            this.setStatus(false);
        }
    }
    
    public void depositar(float d) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + d);
            System.out.println("Depostito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Abra uma Conta");
        }
        
    }
    
    public void sacar(float s) {        
        if (this.getStatus()) {
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Abra uma conta");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo().equals("cc")) {
            v = 12;
        } else if (this.getTipo().equals("cp")){
            v = 20;
        }
        
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }           
        } else {
            System.out.println("Impossível pagar");
        }
    }
    
    public void estado() {
        System.out.println("\nConta: " + this.getNumConta() + "\nDono: " + this.getDono()
        + "\nTipo: " + this.getTipo() + "\nSaldo: " + this.getSaldo() + "\nStatus: " + this.getStatus());
    }
    
}
