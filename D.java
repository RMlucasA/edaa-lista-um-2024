public class Animal {
    private int id;
    private String tipo;
    private String habitat;

    public Animal(int id, String tipo, String habitat) {
        this.id = id;
        this.tipo = tipo;
        this.habitat = habitat;
    }

    // Getters e Setters
    // (similar aos do Livro)

    // Métodos adicionais podem ser adicionados conforme necessário
}

public class Cachorro extends Animal {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(int id, String tipo, String habitat, String nome, String raca, int idade) {
        super(id, tipo, habitat);
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Getters e Setters
    // (similar aos do Livro)

    // Métodos adicionais podem ser adicionados conforme necessário
}
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(1, "doméstico", "terrestre", "Buddy", "Labrador", 3);
        
        System.out.println("Detalhes do Cachorro:");
        System.out.println("ID: " + cachorro.getId());
        System.out.println("Tipo: " + cachorro.getTipo());
        System.out.println("Habitat: " + cachorro.getHabitat());
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Idade: " + cachorro.getIdade());
    }
}
