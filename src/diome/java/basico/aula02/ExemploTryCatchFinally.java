package diome.java.basico.aula02;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        try {
        	
            // Código que pode gerar uma exceção
            int[] numeros = {1, 2, 3};
            
            
            // Isso gera uma ArrayIndexOutOfBoundsException
            System.out.println(numeros[3]); 
           
            
        } catch (ArrayIndexOutOfBoundsException e) {
        	
            // Tratamento da exceção
            System.out.println("Erro: Tentativa de acessar um índice que não existe no array.");
            
            
        } finally {
        	
            // Código que será executado independentemente de uma exceção ocorrer ou não
            System.out.println("Bloco finally executado. Finalizando o programa.");
            
        }
    }
}
