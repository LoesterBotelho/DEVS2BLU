package diome.java.basico.aula01;

public class Aula02 {
	public static void main(String[] args) {

		double nota1 = 7;
		double nota2 = 7;
		double nota3 = 7;
		double nota4 = 7;
		
		double soma = nota1 + nota2 + nota3 + nota4;
		double mediaAritimetica = soma / 4;
		
		if ( mediaAritimetica >= 7.0 ) {
			System.out.println("Aprovado");
		} else if ( mediaAritimetica >= 4.0 ) {
			System.out.println("Exame");
		} else {
			System.out.println("Reprovado");
		}
			
	}

}
