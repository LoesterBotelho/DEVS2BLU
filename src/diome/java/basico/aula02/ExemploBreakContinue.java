package diome.java.basico.aula02;

public class ExemploBreakContinue {
    public static void main(String[] args) {
    	
    	
        // Exemplo de 'for' com break
        System.out.println("Exemplo for com break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Interrompe o loop quando i é 3
            }
            System.out.println("Valor de i: " + i);
        }
        

        // Exemplo de 'for' com continue
        System.out.println("\nExemplo for com continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Pula a iteração quando i é 3
            }
            System.out.println("Valor de i: " + i);
        }

        
        // Exemplo de 'while' com break
        System.out.println("\nExemplo while com break:");
        int j = 1;
        while (j <= 5) {
            if (j == 3) {
                break; // Interrompe o loop quando j é 3
            }
            System.out.println("Valor de j: " + j);
            j++;
        }

        
        // Exemplo de 'while' com continue
        System.out.println("\nExemplo while com continue:");
        j = 1;
        while (j <= 5) {
            if (j == 3) {
                j++; // Pula para a próxima iteração para evitar loop infinito
                continue; // Pula a iteração quando j é 3
            }
            System.out.println("Valor de j: " + j);
            j++;
        }

        
        // Exemplo de 'do-while' com break
        System.out.println("\nExemplo do-while com break:");
        int k = 1;
        do {
            if (k == 3) {
                break; // Interrompe o loop quando k é 3
            }
            System.out.println("Valor de k: " + k);
            k++;
        } while (k <= 5);

        
        // Exemplo de 'do-while' com continue
        System.out.println("\nExemplo do-while com continue:");
        k = 1;
        do {
            if (k == 3) {
                k++; // Incrementa k para evitar loop infinito
                continue; // Pula a iteração quando k é 3
            }
            System.out.println("Valor de k: " + k);
            k++;
        } while (k <= 5);
    }
    
    
    
    
}
