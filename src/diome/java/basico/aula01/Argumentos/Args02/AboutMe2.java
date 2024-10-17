/*
 
cd D:

cd D:\LOESTER\DEVS2BLU 
javac src/diome/java/basico/aula01/Argumentos/Args02/AboutMe2.java

cd D:\LOESTER\DEVS2BLU\src
java diome/java/basico/aula01/Argumentos/Args02/AboutMe2 Loester SobreNome 88 1.80

cd D:\LOESTER\DEVS2BLU
jar cfm src/diome/java/basico/aula01/Argumentos/Args02/about-me2.jar src/diome/java/basico/aula01/Argumentos/Args01/manifest.txt -C src diome/java/basico/aula01/Argumentos/Args01
jar tf D:\LOESTER\DEVS2BLU\src\diome\java\basico\aula01\Argumentos\Args02\about-me2.jar

java -jar src\diome/java/basico/aula01/Argumentos/Args02/about-me2.jar Loester SobreNome 88 1.80

*/

package diome.java.basico.aula01.Argumentos.Args02;

public class AboutMe2 {
	public static void main(String[] args) {

		String nome = args[0];
		String sobreNome = args[1];
		int idade = Integer.valueOf( args[2] );
		double altura = Double.valueOf( args[3] );
		
		System.out.printf("Ola, me chamo %s %s. \n" , nome , sobreNome);
		System.out.printf("Tenho %d anos. \n" , idade);
		System.out.printf("Minha Altura é %.2f anos. \n" , altura);

	}
}
