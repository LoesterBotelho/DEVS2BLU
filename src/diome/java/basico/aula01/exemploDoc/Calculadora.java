package diome.java.basico.aula01.exemploDoc;


//PARA GERAR DOCUMENTAÇÃO 
//TERMINAL - CMD 

// javadoc -d ../docs -sourcepath src -encoding UTF-8 -docencoding ISO-8859-1 -subpackages com.exemplo





/**
 * A classe Calculadora fornece métodos para realizar operações básicas de cálculo
 * como adição, subtração, multiplicação e divisão.
 */
public class Calculadora {

    /**
     * Realiza a adição de dois números.
     *
     * @param a o primeiro número
     * @param b o segundo número
     * @return a soma de a e b
     */
    public double adicionar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números.
     *
     * @param a o primeiro número
     * @param b o segundo número
     * @return o resultado da subtração de b de a
     */
    public double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números.
     *
     * @param a o primeiro número
     * @param b o segundo número
     * @return o produto de a e b
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números.
     *
     * @param a o primeiro número (dividendo)
     * @param b o segundo número (divisor)
     * @return o quociente da divisão de a por b
     * @throws ArithmeticException se b for igual a zero
     */
    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }

    /**
     * Método principal para testar a classe Calculadora.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double soma = calc.adicionar(10, 5);
        double subtracao = calc.subtrair(10, 5);
        double multiplicacao = calc.multiplicar(10, 5);
        double divisao = calc.dividir(10, 5);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
