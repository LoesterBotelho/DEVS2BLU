package diome.java.basico.aula01;

public class Aula05 {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
	
		String resultado = "";
		
		if (a==b) {
			resultado = "Verdadeiro";
		} else {
			resultado = "Falso";
		}
		
		System.out.println(resultado);
		
		
		String resultadoV2 = "";
		
		resultadoV2 = a==b ? "Verdadeira" : "Falso";
		System.out.println(resultadoV2);
	
		
		boolean flag = false;
		int x = 0;
		int y = 0;
		
		
		x = 7;
		y = 5;	
		flag = x == y;		
		System.out.println(flag);
		
		
		x = 7;
		y = 7;	
		flag = x == y;		
		System.out.println(flag);
		
		
		if ( (flag) && (a==b) ) {
			System.out.printf(" AND (flag) && (a==b)   -> %s \n" , (flag) && (a==b)  );
		} 
		
		if ( (flag) || (a==b) ) {
			System.out.printf("OR  (flag) || (a==b)   -> %s \n" , (flag) || (a==b)  );
		} 
		
		
	}
}
