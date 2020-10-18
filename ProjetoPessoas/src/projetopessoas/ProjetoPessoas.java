/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author learn
 */
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p2.setNome("Oliver");
        p2.setSexo("M");
        p2.setIdade(20);
        
        p1.setNome("Roger");
        p3.setNome("Olivia");
        p4.setNome("Mark");
        
        p2.setCurso("A Arte da Espada");
        p3.setSalario(3000.34f);
        p4.setSetor("Sonoplastia");
        
        System.out.println(p2.apresenta());
        System.out.println("O Salário da " + p3.getNome() + " é R$" + p3.getSalario());
        System.out.println("O Curso do " + p2.getNome() + " é " + p2.getCurso());
        System.out.println(p4.getNome() + " Trabalha no Setor de " + p4.getSetor());
    }
    
}
