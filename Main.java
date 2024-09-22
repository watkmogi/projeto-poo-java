// Classe Pessoa (Superclasse)
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

// Classe Estudante (Subclasse)
public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + getNome() + ", tenho " + getIdade() + " anos e estudo " + curso + ".");
    }
}

// Classe Principal
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 45);
        pessoa1.apresentar();

        Estudante estudante1 = new Estudante("Maria", 20, "Engenharia");
        estudante1.apresentar();
    }
}
