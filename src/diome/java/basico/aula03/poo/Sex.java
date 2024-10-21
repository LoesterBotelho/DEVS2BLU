package diome.java.basico.aula03.poo;

public class Sex {

	private String name;

	public Sex() {

	}

	public Sex(String name) {
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
		return "Sex [name=" + name + "]";
	}

}
