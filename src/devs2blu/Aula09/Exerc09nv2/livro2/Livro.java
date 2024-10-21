/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.livro2;

import java.util.ArrayList;
import java.util.List;

public class Livro {

	private final Integer id;
	private final Integer ano;
	private final String titulo;
	private final String isbn;
	private final Categoria categoria;
	private final Editora editora;
	private final String ativo;
	private final List<Autor> autores;

	public Livro() {
		this(null, null, null, null, null, null, "S", new ArrayList<>());
	}

	public Livro(Integer id, Integer ano, String titulo) {
	    this.id = id;
	    this.ano = ano;
	    this.titulo = titulo;
	    this.isbn = "";
	    this.categoria = new Categoria();
	    this.editora = new Editora();
	    this.ativo = "S";
	    this.autores = new ArrayList<>();
	}
	
	public Livro(Integer id, Integer ano, String titulo, String isbn) {
	    this.id = id;
	    this.ano = ano;
	    this.titulo = titulo;
	    this.isbn = isbn;
	    this.categoria = new Categoria();
	    this.editora = new Editora();
	    this.ativo = "S";
	    this.autores = new ArrayList<>();
	}
	
	public Livro(Integer id, Integer ano, String titulo, String isbn, Categoria categoria) {
	    this.id = id;
	    this.ano = ano;
	    this.titulo = titulo;
	    this.isbn = isbn;
	    this.categoria = categoria != null ? categoria : new Categoria();
	    this.editora = new Editora();
	    this.ativo = "S";
	    this.autores = new ArrayList<>();
	}

	public Livro(Integer id, Integer ano, String titulo, String isbn, Categoria categoria, Editora editora) {
	    this.id = id;
	    this.ano = ano;
	    this.titulo = titulo;
	    this.isbn = isbn;
	    this.categoria = categoria != null ? categoria : new Categoria();
	    this.editora = editora != null ? editora : new Editora();
	    this.ativo = "S";
	    this.autores = new ArrayList<>();
	}
	
	public Livro(Integer id, Integer ano, String titulo, String isbn, Categoria categoria, Editora editora, String ativo, List<Autor> autores) {
	    this.id = id;
	    this.ano = ano;
	    this.titulo = titulo;
	    this.isbn = isbn;
	    this.categoria = categoria != null ? categoria : new Categoria();
	    this.editora = editora != null ? editora : new Editora();
	    this.ativo = ativo != null ? ativo : "S";
	    this.autores = autores != null ? autores : new ArrayList<>();
	}

	private Livro(Builder builder) {
	    this.id = builder.id;
	    this.ano = builder.ano;
	    this.titulo = builder.titulo;
	    this.isbn = builder.isbn;
	    this.categoria = (builder.categoria != null) ? builder.categoria : new Categoria();
	    this.editora = (builder.editora != null) ? builder.editora : new Editora();
	    this.ativo = (builder.ativo != null) ? builder.ativo : "S";
	    this.autores = (builder.autores != null) ? new ArrayList<>(builder.autores) : new ArrayList<>();
	}

	public Livro(int id, int ano, String titulo, String isbn, String ativo, Categoria categoria, Editora editora) {
	    this.id = id;
	    this.ano = ano;
	    this.titulo = titulo;
	    this.isbn = isbn;
	    this.categoria = categoria != null ? categoria : new Categoria();
	    this.editora = editora != null ? editora : new Editora();
	    this.ativo = ativo != null ? ativo : "S";
	    this.autores =  new ArrayList<>();
	}

	public Livro(int id, int ano, String titulo, String isbn, String ativo, Categoria categoria, Editora editora, List<Autor> autores) {
	    this.id = id;
	    this.ano = ano;
	    this.titulo = titulo;
	    this.isbn = isbn;
	    this.categoria = categoria != null ? categoria : new Categoria();
	    this.editora = editora != null ? editora : new Editora();
	    this.ativo = ativo != null ? ativo : "S";
	    this.autores = autores != null ? autores : new ArrayList<>();
	}
	public Integer getId() {
		return id;
	}

	public Integer getAno() {
		return ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public Editora getEditora() {
		return editora;
	}

	public String getAtivo() {
		return ativo;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public String getIdAsString() {
		return String.valueOf(id);
	}

	@Override
	public String toString() {
		return String.format(
				"Builder {id=%s, ano=%s, titulo=%s, isbn=%s, categoria=%s, editora=%s, ativo=%s, autores=%s}", 
				FuncoesUteis.adicionarLetraAEsquerda(id,3,"0"), 
				String.valueOf(ano), 
				titulo, isbn, 
				categoria != null ? categoria.getNome() : "Nenhum",
				editora != null ? editora.getNome() : "Nenhum", 
				ativo, autores);
	}

    public boolean isEmpty() {
        return (titulo == null || titulo.isEmpty()) && (isbn == null || isbn.isEmpty()) && categoria == null;
    }
    
	public static class Factory {

		public static Livro criarLivro(Integer id, Integer ano, String titulo) {
			return new Livro(id, ano, titulo);
		}

		public static Livro criarLivro(Integer id, Integer ano, String titulo, String isbn) {
			return new Livro(id, ano, titulo, isbn);
		}

		public static Livro criarLivro(Integer id, Integer ano, String titulo, String isbn, Categoria categoria) {
			return new Livro(id, ano, titulo, isbn, categoria);
		}

		public static Livro criarLivro(Integer id, Integer ano, String titulo, String isbn, Categoria categoria, Editora editora) {
			return new Livro(id, ano, titulo, isbn, categoria, editora);
		}

		public static Livro criarLivro(int id, int ano, String titulo, String isbn, String ativo, Categoria categoria, Editora editora) {								
			return new Livro(id, ano, titulo, isbn, ativo, categoria, editora);
		}

		public static Livro criarLivro(int id, int ano, String titulo, String isbn, String ativo, Categoria categoria, Editora editora, List<Autor> autores) {								
			return new Livro(id, ano, titulo, isbn, ativo, categoria, editora, autores);
		}
		
		
	}

	public static class Builder {
		private Integer id;
		private Integer ano;
		private String titulo;
		private String isbn;
		private Categoria categoria;
		private Editora editora;
		private String ativo;
		private List<Autor> autores;

		public Builder comId(Integer id) {
			this.id = id;
			return this;
		}

		public Builder comAno(Integer ano) {
			this.ano = ano;
			return this;
		}

		public Builder comTitulo(String titulo) {
			this.titulo = titulo;
			return this;
		}

		public Builder comIsbn(String isbn) {
			this.isbn = isbn;
			return this;
		}

		public Builder comCategoria(Categoria categoria) {
			this.categoria = categoria;
			return this;
		}

		public Builder comEditora(Editora editora) {
			this.editora = editora;
			return this;
		}

		public Builder comAtivo(String ativo) {
			this.ativo = ativo;
			return this;
		}

		public Builder comAutores(List<Autor> autores) {
			this.autores = autores;
			return this;
		}

		public Livro build() {
			return new Livro(this);
		}

		@Override
		public String toString() {
			return String.format(
					"Builder {id=%s, ano=%s, titulo=%s, isbn=%s, categoria=%s, editora=%s, ativo=%s, autores=%s}", 
					FuncoesUteis.adicionarLetraAEsquerda(id,3,"0"), 
					String.valueOf(ano), 
					titulo, isbn, 
					categoria != null ? categoria.getNome() : "Nenhum",
					editora != null ? editora.getNome() : "Nenhum", 
					ativo, autores);
		}
		

	}
}
