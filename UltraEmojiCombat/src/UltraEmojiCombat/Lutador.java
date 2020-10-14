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
public final class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double peso, altura;

    //Métodos Personalizados
    public void apresentar() {
        System.out.println("Lutador: " + this.getNome() + "\nOrigem: " + this.getNacionalidade() + "\n" + this.getIdade() + " anos"
        + "\n" + this.getAltura() + "m de altura" + "\nPesando: " + this.getPeso() + "Kg" + "\nVitórias: " + this.getVitorias() + "\nDerrotas: "
        + this.getDerrotas() + "\nEmpates: " + this.getEmpates() + "\n");
    }
    
    public void status() {
        System.out.println(this.getNome() + "\né um peso " + this.getCategoria() + "\n" + this.getVitorias() + " Vitórias" + "\n" + this.getDerrotas()
        + " Derrotas" + "\n" + this.getEmpates() + " Empates" + "\n");
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //Métodos Especiais
    
    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, double peso, double altura) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
