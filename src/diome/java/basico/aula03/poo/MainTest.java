package diome.java.basico.aula03.poo;

import devs2blu.Aula10.Exerc01.Aluno;

public class MainTest {

	public static void main(String[] args) {
		
	
	
	Color blue = new Color("BLUE");
	Color pink = new Color("PINK");

	Sex masculino = new Sex("MASCULINO");
	Sex feminimo = new Sex("FEMININO");
	Sex outro = new Sex("OUTRO");

	Food xSalada = new Food("X-SALADA");
	Food batataFrita = new Food("BATATA FRITA");

	Eat refrigeranteCocaCola = new Eat("REFRIGERANTE : COCA COLA");

	Student aluno01 = new Student("Loester", 30, blue, masculino);
	aluno01.mostraInfo();
	
	aluno01.eating(xSalada);
	aluno01.eating(batataFrita);
	
	aluno01.drinking(refrigeranteCocaCola);
	
	}
}
