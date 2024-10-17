package diome.edu.primeirasemana.loester;

public class Cliente {

	private String nome;
	private String cpf;
	private int idade;

	public Cliente() {
		this.setNome("");
		this.setCpf("");
		this.setIdade(0);
	}
	
	public Cliente(String nome, String cpf, int idade) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}

}
