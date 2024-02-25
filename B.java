public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Getters e Setters
    // (similar aos do Livro)

    // Métodos adicionais podem ser adicionados conforme necessário
}
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25, "Rua XYZ, 123");
        
        System.out.println("Detalhes da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereco());
    }
}