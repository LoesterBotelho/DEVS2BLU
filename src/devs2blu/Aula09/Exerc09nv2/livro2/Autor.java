/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.livro2;

public class Autor {

	private final Integer id;
	private final String nome;
	private final String ativo;

	public Autor() {
		this(null, null, "S");
	}

	public Autor(Integer id, String nome) {
		this(id, nome, "S");
	}

	public Autor(Integer id, String nome, String ativo) {
		this.id = id;
		this.nome = nome;
		this.ativo = ativo != null ? ativo : "S";
	}

	public String getIdAsString() {
		return String.valueOf(id);
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getAtivo() {
		return ativo;
	}

	@Override
	public String toString() {
		return String.format("Autor [id=%s, nome=%s, ativo=%s]", 
				FuncoesUteis.adicionarLetraAEsquerda(id,3,"0"), 
				getNome(), 
				getAtivo());
	}

	public static class Factory {

		public static Autor criarAutor(Integer id, String nome) {
			return new Autor(id, nome);
		}

		public static Autor criarAutor(Integer id, String nome, String ativo) {
			return new Autor(id, nome, ativo);
		}
	}

	public static class Builder {
		private Integer id;
		private String nome;
		private String ativo;

		public Builder comId(Integer id) {
			this.id = id;
			return this;
		}

		public Builder comNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder comAtivo(String ativo) {
			this.ativo = ativo;
			return this;
		}

		public Autor build() {
			return new Autor(this.id, this.nome, this.ativo);
		}

		@Override
		public String toString() {
			return String.format("Builder{id=%s, nome=%s, ativo=%s}", 
					FuncoesUteis.adicionarLetraAEsquerda(id,3,"0"), 
					nome, 
					ativo);
		}
	}
}
