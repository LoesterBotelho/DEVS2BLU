package diome.java.basico.aula01.exemploDoc;

public class TesteCalculadora {
	/**
	 * O método principal executa os testes dos métodos da classe Calculadora.
	 *
	 * @param args argumentos da linha de comando (não utilizados)
	 */
	public static void main(String[] args) {
		// Instanciando a calculadora
		Calculadora calculadora = new Calculadora();

		// Testando o método de adição
		double resultadoSoma = calculadora.adicionar(10, 5);
		System.out.println("Resultado da soma: 10 + 5 = " + resultadoSoma);

		// Testando o método de subtração
		double resultadoSubtracao = calculadora.subtrair(10, 5);
		System.out.println("Resultado da subtração: 10 - 5 = " + resultadoSubtracao);

		// Testando o método de multiplicação
		double resultadoMultiplicacao = calculadora.multiplicar(10, 5);
		System.out.println("Resultado da multiplicação: 10 * 5 = " + resultadoMultiplicacao);

		// Testando o método de divisão
		double resultadoDivisao = calculadora.dividir(10, 5);
		System.out.println("Resultado da divisão: 10 / 5 = " + resultadoDivisao);

		// Testando divisão por zero (tratamento de exceção)
		try {
			calculadora.dividir(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("Erro ao dividir por zero: " + e.getMessage());
		}
	}
}
