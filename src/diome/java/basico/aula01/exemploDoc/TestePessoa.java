package diome.java.basico.aula01.exemploDoc;

public class TestePessoa {

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
