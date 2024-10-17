package diome.java.basico.aula02.Excecao;

public class Teste {

	   public static void main(String[] args) {
		   
	        try {
	            // Chama o método que pode lançar uma exceção
	            metodoQueLancaExcecao(0);
	        } catch (MinhaExcecao e) {
	            // Trata a exceção
	            System.out.println("Exceção capturada: " + e.getMessage());
	        }
	        
	    }

	    // Método que lança uma exceção personalizada
	    static void metodoQueLancaExcecao(int numero) throws MinhaExcecao {
	    	
	        if (numero == 0) {
	            throw new MinhaExcecao("Número não pode ser zero!");
	        }
	        
	        System.out.println("Número: " + numero);
	    }
	    
	    
	}