package diome.java.basico.aula01.Argumentos;



//PARA GERAR DOCUMENTAÇÃO 
//TERMINAL - CMD 

//javadoc -d ../docs -sourcepath src -encoding UTF-8 -docencoding ISO-8859-1 -subpackages com.exemplo




/**
 * A classe Pessoa representa uma pessoa com nome, idade e email.
 */
public class Pessoa {

    private String nome;
    private int idade;
    private String email;

    /**
     * Constrói uma nova instância de Pessoa com os detalhes fornecidos.
     *
     * @param nome  o nome da pessoa
     * @param idade a idade da pessoa
     * @param email o email da pessoa
     */
    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return o nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param nome o novo nome da pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a idade da pessoa.
     *
     * @return a idade da pessoa
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade da pessoa.
     *
     * @param idade a nova idade da pessoa
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Obtém o email da pessoa.
     *
     * @return o email da pessoa
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email da pessoa.
     *
     * @param email o novo email da pessoa
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Exibe os detalhes da pessoa em formato de texto.
     *
     * @return uma string contendo os detalhes da pessoa
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * Método principal para testar a classe Pessoa.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        // Criando uma nova instância de Pessoa
        Pessoa pessoa = new Pessoa("João", 30, "joao@example.com");

        // Exibindo os detalhes da pessoa
        System.out.println(pessoa);

        // Atualizando os atributos da pessoa
        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        pessoa.setEmail("maria@example.com");

        // Exibindo os novos detalhes
        System.out.println(pessoa);
    }
}
