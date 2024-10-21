/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.livro2;

public class FuncoesUteis {

	public static String adicionarLetraAEsquerda(Integer numero, int qtdCasas, String letra) {
		
		String textoInicial = String.valueOf(numero);
		
        StringBuilder sb = new StringBuilder();
        sb.append(textoInicial);
        
        while (sb.length() < qtdCasas) {
            sb.insert(0, letra);
        }
        return sb.toString();
	}

	
}
