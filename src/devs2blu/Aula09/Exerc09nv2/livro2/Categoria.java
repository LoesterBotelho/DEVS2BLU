/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.livro2;

public class Categoria {

	private final Integer id;
	private final String nome;
	private final String descricao;
	private final String ativo;

	public Categoria() {
		this(null, null, null, "S");
	}

	public Categoria(Integer id) {
		this(id, null, null, "S");
	}

	public Categoria(Integer id, String nome) {
		this(id, nome, null, "S");
	}

	public Categoria(Integer id, String nome, String descricao) {
		this(id, nome, descricao, "S");
	}

	public Categoria(Integer id, String nome, String descricao, String ativo) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.ativo = ativo != null ? ativo : "S";
	}

	public Categoria(String nome) {
		this(null, nome, null, "S");
	}

	public Categoria(String nome, String descricao) {
		this(null, nome, descricao, "S");
	}

	private Categoria(Builder builder) {
		this.id = builder.id;
		this.nome = builder.nome;
		this.descricao = builder.descricao;
		this.ativo = builder.ativo != null ? builder.ativo : "S";
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getAtivo() {
		return ativo;
	}

	public String getIdAsString() {
		return String.valueOf(id);
	}

	@Override
	public String toString() {
		return String.format("Categoria [id=%s, nome=%s, ativo=%s]", 
				FuncoesUteis.adicionarLetraAEsquerda(id,3,"0"),
				getNome(), 
				getAtivo());
	}

	public static class Factory {

		public static Categoria criarCategoria(Integer id, String nome) {
			return new Categoria(id, nome);
		}

		public static Categoria criarCategoria(Integer id, String nome, String descricao) {
			return new Categoria(id, nome, descricao);
		}

		public static Categoria criarCategoria(Integer id, String nome, String descricao, String ativo) {
			return new Categoria(id, nome, descricao, ativo);
		}

		public static Categoria criarCategoria(String nome, String descricao) {
			return new Categoria(nome, descricao);
		}
	}

	public static class Builder {
		private Integer id;
		private String nome;
		private String descricao;
		private String ativo;

		public Builder comNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder comDescricao(String descricao) {
			this.descricao = descricao;
			return this;
		}

		public Builder comAtivo(String ativo) {
			this.ativo = ativo;
			return this;
		}

		public Builder comId(Integer id) {
			this.id = id;
			return this;
		}

		public Categoria build() {
			return new Categoria(this);
		}

		@Override
		public String toString() {
			return String.format("Builder{id=%s, nome=%s, descricao=%s, ativo=%s}", 
					FuncoesUteis.adicionarLetraAEsquerda(id,3,"0"), 
					nome, 
					descricao, 
					ativo);
		}
	}
}
