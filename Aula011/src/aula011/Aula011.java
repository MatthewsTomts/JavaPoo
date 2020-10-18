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
public class Aula011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitante v1 = new Visitante();
        Professor p1 = new Professor();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();
        
        v1.setNome("Roger");
        v1.setIdade(25);
        v1.setSexo("Masculino");
        
        p1.setNome("Harvey");
        p1.setSexo("Masculino");
        p1.setIdade(30);
        p1.setEspecialidade("Sonoplastia");
        p1.setSalario(4030.43f);
        p1.receberAum(540f);
        
        a1.setIdade(29);
        a1.setSexo("Feminino");
        a1.setNome("Olívia");
        a1.setCurso("Japonês Avançado");
        a1.setMatr(1234);
        
        b1.setNome("Oliver");
        b1.setSexo("Masculino");
        b1.setIdade(20);
        b1.setCurso("A Arte da Espada");
        b1.setMatr(777);
        b1.setBolsa(20.5f);
        
        t1.setNome("Mark");
        t1.setIdade(20);
        t1.setSexo("Masculino");
        t1.setCurso("Sonoplastia");
        t1.setMatr(6767);
        t1.setRegistroProfissional(5309);
        
        
        System.out.println(v1.apresentar());
        System.out.println(p1.apresentar());
        a1.pagarMensalidade();
        b1.pagarMensalidade();
        t1.praticar();
    }
    
}
