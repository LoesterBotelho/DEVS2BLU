package diome.java.basico.aula02;

public class EstruturasDeRepeticao {
	
    public static void main(String[] args) {
    	
    	
        // Usando while
        System.out.println("Usando while:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        
        // Usando do while
        System.out.println("\nUsando do while:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        
        // Usando for
        System.out.println("\nUsando for:");
        for (int k = 1; k <= 5; k++) {
            System.out.println(k);
        }
        
        
        
        
    }
}
