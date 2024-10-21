/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.livro2;

import java.util.ArrayList;
import java.util.List;

public class TesteBiblioteca {

    static List<Categoria> categorias;
    static List<Editora> editoras;
    static List<Autor> autores;
    static List<Livro> livros;

    static Biblioteca biblioteca;
    static StringBuilderPlus sbTexto;

    public static void main(String[] args) {
    	
    	imprimirAutor();
        inicializarVariaveis();

        imprimirTexto(false);
        imprimirBiblioteca(true);
    }

    private static void inicializarVariaveis() {
        sbTexto = StringBuilderPlus.Factory.criarStringBuilderPlus();
        biblioteca = Biblioteca.Factory.criarBiblioteca();

        categorias = criarCategorias();
        editoras = criarEditoras();
        autores = criarAutores();
        livros = criarLivros();

        biblioteca.adicionarLivros(livros);
    }

    private static void imprimirTexto(Boolean imprimirNaTela) {
        if (imprimirNaTela) {
            System.out.printf("%s", sbTexto.toString());
        }
    }

    private static void imprimirBiblioteca(Boolean imprimirObjBiblioteca) {
        if (imprimirObjBiblioteca) {
            System.out.printf("%s", biblioteca.toString());
        }
    }

    private static List<Categoria> criarCategorias() {
        List<Categoria> categorias = new ArrayList<>();

        String[] nomes = inicializarNomesCategorias();
        String[] descricoes = inicializarDescricoesCategorias();

        for (int i = 0; i < nomes.length; i++) {
            Categoria categoria = Categoria.Factory.criarCategoria(i + 1, nomes[i], descricoes[i], "S");
            categorias.add(categoria);
            sbTexto.appendLine(categoria);
        }

        return categorias;
    }

    private static List<Editora> criarEditoras() {
        List<Editora> editoras = new ArrayList<>();

        String[] nomes = inicializarNomesEditoras();

        for (int i = 0; i < nomes.length; i++) {
            Editora editora = Editora.Factory.criarEditora(i + 1, nomes[i], "S");
            editoras.add(editora);
            sbTexto.appendLine(editora);
        }

        return editoras;
    }

    private static List<Autor> criarAutores() {
        List<Autor> autores = new ArrayList<>();

        String[] nomes = inicializarNomesAutores();

        for (int i = 0; i < nomes.length; i++) {
            Autor autor = Autor.Factory.criarAutor(i + 1, nomes[i], "S");
            autores.add(autor);
            sbTexto.appendLine(autor);
        }

        return autores;
    }

    private static List<Livro> criarLivros() {
        List<Livro> livros = new ArrayList<>();

        List<Autor> autoresCemAnos = List.of(autores.get(0));
        List<Autor> autoresHarryPotter = List.of(autores.get(1));
        List<Autor> autoresSenhorDosAnéis = List.of(autores.get(2));
        List<Autor> autoresMorteQuincas = List.of(autores.get(3));
        List<Autor> autoresRevolucaoBichos = List.of(autores.get(4));
        List<Autor> autoresCemAnosEHarryPotter = List.of(autores.get(0), autores.get(1));
        List<Autor> autoresSenhorDosAnéisERevolucao = List.of(autores.get(2), autores.get(4));

        livros.add(Livro.Factory.criarLivro(1, 2021, "Cem Anos de Solidão", "978-0-06-088328-7", "S", categorias.get(4), editoras.get(2), autoresCemAnos));
        livros.add(Livro.Factory.criarLivro(2, 2020, "Harry Potter e a Pedra Filosofal", "978-85-390-0023-6", "S", categorias.get(2), editoras.get(0), autoresHarryPotter));
        livros.add(Livro.Factory.criarLivro(3, 2019, "O Senhor dos Anéis", "978-85-390-0167-0", "S", categorias.get(3), editoras.get(1), autoresSenhorDosAnéis));
        livros.add(Livro.Factory.criarLivro(4, 2018, "A Morte e a Morte de Quincas Berro d’Água", "978-85-7500-181-8", "S", categorias.get(0), editoras.get(4), autoresMorteQuincas));
        livros.add(Livro.Factory.criarLivro(5, 2022, "A Revolução dos Bichos", "978-85-356-0167-5", "S", categorias.get(1), editoras.get(5), autoresRevolucaoBichos));
        livros.add(Livro.Factory.criarLivro(6, 2023, "Cem Anos de Harry Potter", "978-1-234-56789-0", "S", categorias.get(2), editoras.get(0), autoresCemAnosEHarryPotter));
        livros.add(Livro.Factory.criarLivro(7, 2024, "Senhor dos Anéis e Revolução dos Bichos", "978-1-234-56789-1", "S", categorias.get(3), editoras.get(1), autoresSenhorDosAnéisERevolucao));

        for (Livro livro : livros) {
            sbTexto.appendLine(livro);
        }

        return livros;
    }

    private static String[] inicializarNomesCategorias() {
        return new String[] {
            "Literatura Clássica", "Ficção Científica", "Romance Policial", "Fantasia Épica",
            "Biografias Inspiradoras", "História do Brasil", "Desenvolvimento Pessoal", 
            "Aventura e Exploração", "Terror e Suspense", "Poesia Contemporânea"
        };
    }

    private static String[] inicializarDescricoesCategorias() {
        return new String[] {
            "Obras literárias reconhecidas pela crítica.",
            "Histórias que exploram conceitos científicos e futuristas.",
            "Livros que envolvem mistérios e investigações.", 
            "Narrativas de fantasia com mundos complexos.",
            "Relatos de vidas que mudaram a história.", 
            "Livros sobre eventos históricos do Brasil.",
            "Literatura voltada para o crescimento pessoal.", 
            "Livros que levam o leitor a aventuras emocionantes.",
            "Histórias que provocam medo e tensão.", 
            "Poemas de autores modernos e suas expressões."
        };
    }

    private static String[] inicializarNomesEditoras() {
        return new String[] {
            "Editora Aurora", "Editora Estrela", "Editora Sorriso", "Editora Horizonte",
            "Editora Página", "Editora Sabedoria", "Editora Maré", "Editora Raízes", 
            "Editora Coração", "Editora Inspiração"
        };
    }

    private static String[] inicializarNomesAutores() {
        return new String[] {
            "Isabel Allende", "J.K. Rowling", "Gabriel Garcia Márquez", 
            "Stephen King", "Maya Angelou", "Haruki Murakami", 
            "George R.R. Martin", "Agatha Christie", "Paulo Coelho",
            "Chimamanda Ngozi Adichie"
        };
    }
    
	public static void imprimirAutor() {
		System.out.printf("Autor : Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}    
}
