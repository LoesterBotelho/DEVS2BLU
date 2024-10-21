package diome.java.basico.aula03.poo;

public class MainTest {

	public static void main(String[] args) {
		
	
	
	Color blue = new Color("BLUE");		
	Color pink = new Color("PINK");

	Sex masculino = new Sex("MASCULINO");
	Sex feminino = new Sex("FEMININO");
	
	Food xSalada = new Food("X-SALADA");
	Food batataFrita = new Food("BATATA FRITA");

	Eat refrigeranteCocaCola = new Eat("REFRIGERANTE : COCA COLA");

	Student aluno01 = new Student("Loester", 30, blue, masculino);
	aluno01.mostraInfo();
	aluno01.eating(xSalada);
	aluno01.eating(batataFrita);
	aluno01.drinking(refrigeranteCocaCola);
	aluno01.running();
	
	System.out.println("");
	
	Student aluno02 = new Student("Maria", 18, pink, feminino);
	aluno02.mostraInfo();
	aluno02.eating(xSalada);		
	aluno02.drinking(refrigeranteCocaCola);
	aluno02.running();
	
	}
}
