/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.livro2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Biblioteca {

	private List<Livro> livros;

	public Biblioteca() {
		this.livros = new ArrayList<>();
	}

	public Biblioteca(List<Livro> livros) {
		this.livros = livros != null ? new ArrayList<>(livros) : new ArrayList<>();
	}

	private Biblioteca(Builder builder) {
		this.livros = builder.livros != null ? new ArrayList<>(builder.livros) : new ArrayList<>();
	}

	public List<Livro> getLivros() {
		return new ArrayList<>(livros);
	}

	public void setLivros(List<Livro> livros) {
		if (livros == null) {
			throw new IllegalArgumentException("Erro - 001 : lista de livros está null");
		}
		this.livros = new ArrayList<>(livros);
	}

	public void adicionarLivro(Livro livro) {
		if (livro == null || livroEhVazio(livro)) {
			throw new IllegalArgumentException("Erro - 002 : livro está null ou vazio");
		}
		livros.add(livro);
	}

	public boolean removerLivro(Livro livro) {
		if (livro == null) {
			throw new IllegalArgumentException("Erro - 003 : livro está null");
		}
		return livros.remove(livro);
	}

	public Optional<Livro> buscarLivroPorTitulo(String titulo) {
		if (titulo == null || titulo.isEmpty()) {
			throw new IllegalArgumentException("Erro - 004 : título está null.");
		}
		return livros.stream().filter(livro -> livro.getTitulo() != null && livro.getTitulo().equalsIgnoreCase(titulo))
				.findFirst();
	}

	private boolean livroEhVazio(Livro livro) {
		return livro.getTitulo() == null || livro.getTitulo().isEmpty() || livro.getIsbn() == null
				|| livro.getIsbn().isEmpty();
	}

	@Override
	public String toString() {
		StringBuilderPlus sb = StringBuilderPlus.Builder.build();
		sb.appendLine("Biblioteca [");

		for (var item : livros) {
			sb.appendLine(item.toString());
		}

		sb.appendLine("]");

		return sb.toString();
	}

	public static class Factory {
		public static Biblioteca criarBiblioteca() {
			return new Biblioteca(new Builder());
		}

		public static Biblioteca criarBiblioteca(List<Livro> livros) {
			return new Biblioteca(new Builder().comLivros(livros));
		}
	}

	public static class Builder {
		private List<Livro> livros;

		public Builder comLivros(List<Livro> livros) {
			this.livros = livros != null ? new ArrayList<>(livros) : new ArrayList<>();
			return this;
		}

		public Biblioteca build() {
			return new Biblioteca(this);
		}

		@Override
		public String toString() {
			StringBuilderPlus sb = StringBuilderPlus.Builder.build();
			sb.appendLine("Biblioteca [");

			for (var item : livros) {
				sb.appendLine(item.toString());
			}

			sb.appendLine("]");

			return sb.toString();
		}
	}

	public void adicionarLivros(List<Livro> livros) {
		this.setLivros(livros);		
	}
}
