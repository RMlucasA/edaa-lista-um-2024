public class Universidade {
    private String nome;
    private String endereco;

    public Universidade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getters e Setters
    // (similar aos do Livro)

    // Método adicional
    public void exibirInformacoes() {
        System.out.println("Universidade: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}

public class Aluno {
    private String nome;
    private int idade;
    private Universidade universidade;

    public Aluno(String nome, int idade, Universidade universidade) {
        this.nome = nome;
        this.idade = idade;
        this.universidade = universidade;
    }

    // Getters e Setters
    // (similar aos do Livro)

    // Método adicional
    public void exibirInformacoes() {
        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Universidade: " + universidade.getNome());
    }
}

public class Professor {
    // (semelhante às classes anteriores)

    // Método adicional
    public void darAula() {
        System.out.println("Professor dando aula...");
    }
}

public class Disciplina {
    // (semelhante às classes anteriores)

    // Método adicional
    public void exibirDetalhes() {
        System.out.println("Detalhes da disciplina...");
    }
}
public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade ABC", "Av. Principal, 456");
        Aluno aluno = new Aluno("Maria", 21, universidade);
        
        aluno.exibirInformacoes();
    }
}
