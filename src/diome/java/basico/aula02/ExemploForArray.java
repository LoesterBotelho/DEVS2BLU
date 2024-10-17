package diome.java.basico.aula02;

public class ExemploForArray {
    public static void main(String[] args) {
    	
    	
        // Declaração e inicialização de um array de inteiros
        int[] numeros = {10, 20, 30, 40, 50};

        
        // Exemplo de uso do 'for' tradicional para percorrer o array
        System.out.println("Exemplo de for tradicional:");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }

        
        
        // Exemplo de uso do 'for-each' (ou enhanced for) para percorrer o array
        System.out.println("\nExemplo de for-each:");
        
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
        
        
    }
}
