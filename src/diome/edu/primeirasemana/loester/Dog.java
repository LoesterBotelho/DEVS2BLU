package diome.edu.primeirasemana.loester;

public class Dog {

	private String nome = "";

	public Dog(String nome) {		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Dog [nome=" + nome + "]";
	}
	
	
	public void mostrar() {
		System.out.println( this.toString() );
	}
	
	
	
}
