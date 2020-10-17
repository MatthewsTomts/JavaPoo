package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[4];        
        p[0] = new Pessoa("Roger", "Masculino", 23);
        p[1] = new Pessoa("Oliver", "Masculino", 25);
        p[2] = new Pessoa("Olivia", "Feminino", 20);
        
        l[0] = new Livro("Chacinas pelo Mundo", "Jack Sigan", 250, p[0]);
        l[1] = new Livro("Lendários Samurais", "Chung Lee", 300, p[1]);
        l[2] = new Livro("A Lenda do Kamaitachi", "Rafael Lange", 60, p[2]);
        l[3] = new Livro("20 mil léguas submarinas", "Jules Vernes", 504, p[2]);
        
        l[3].abrir();
        l[3].folhear(400);
        l[3].avancarPag();
        
        System.out.println(l[3].detalhes());
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}
