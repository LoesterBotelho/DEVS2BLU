package diome.java.basico.aula01;

public class Aula03 {
	public static void main(String[] args) {
		double soma = 10.5 + 15.7;
		int subtracao = 113 - 25;
		int multiplicacao = 20 * 7;
		int divisao = 15/3;
		int modulo = 18 % 3;
		double resultado = (10*7) + (20/4);
		
		String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
		
		
		
		String concatenacao = "?";		
		
		System.out.println(concatenacao);
		// output ?
		
		
		concatenacao = 1 + 1 + 1 + "1";
		
		System.out.println(concatenacao);
		// output 3 + 1 = 31
		
		
		concatenacao = 1 + "1" +1 +1;
		
		System.out.println(concatenacao);
		// output 1111
		
		concatenacao = "1" +  1 +1 + 1 + 1 ;
		
		System.out.println(concatenacao);
		// 11111
		
		concatenacao = "1" + ( 1 +1 + 1 + 1 );
		
		System.out.println(concatenacao);
		// output 14
		
	}
}
