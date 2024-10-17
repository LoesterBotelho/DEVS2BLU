package diome.java.basico.aula02;

public class ExemploForEach {
	
    public static void main(String[] args) {
    	
        // Definindo um array de inteiros
        int[] numeros = {1, 2, 3, 4, 5};

        // Usando for-each para percorrer o array
        System.out.println("Números no array:");
        
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        
    }
}