/*
 
cd D:

cd D:\LOESTER\DEVS2BLU 
javac src/diome/java/basico/aula01/Argumentos/Args01/AboutMe1.java

cd D:\LOESTER\DEVS2BLU\src
java diome/java/basico/aula01/Argumentos/Args01/AboutMe1 argumento1 argumento2 argumento3 argumento4

cd D:\LOESTER\DEVS2BLU
jar cfm src/diome/java/basico/aula01/Argumentos/Args01/about-me1.jar src/diome/java/basico/aula01/Argumentos/Args01/manifest.txt -C src diome/java/basico/aula01/Argumentos/Args01
jar tf D:\LOESTER\DEVS2BLU\src\diome\java\basico\aula01\Argumentos\Args01\about-me1.jar

java -jar src\diome/java/basico/aula01/Argumentos/Args01/about-me1.jar argumento1 argumento2 argumento3 argumento4

*/

package diome.java.basico.aula01.Argumentos.Args01;
public class AboutMe1 {
	public static void main(String[] args) {
		System.out.println("\n\nArgumentos recebidos:");
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}
