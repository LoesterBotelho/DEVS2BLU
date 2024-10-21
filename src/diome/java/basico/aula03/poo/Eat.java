package diome.java.basico.aula03.poo;

public class Eat {

	private String name;

	public Eat() {

	}

	public Eat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Eat [name=" + name + "]";
	}
}
