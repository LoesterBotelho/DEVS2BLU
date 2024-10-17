package diome.java.basico.aula01.Argumentos;

//import diome.java.basico.aula01.exemploDoc.Pessoa;

public class ExemploApp {


	// javac Pessoa.java
	// javac ExemploApp.java

	// jar cfe nome-do-arquivo.jar ExemploApp ExemploApp.class

	// java -jar nome-do-arquivo.jar argumento1 argumento2 argumento3
	
	
	public static void main(String[] args) {
		System.out.println("Argumentos recebidos:");
		for (String arg : args) {
			System.out.println(arg);
		}
		
		/*
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
        */
	}

}
