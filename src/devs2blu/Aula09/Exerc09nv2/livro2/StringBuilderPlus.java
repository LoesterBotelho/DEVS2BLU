/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.livro2;

public class StringBuilderPlus {

	private StringBuilder sb;

	public StringBuilderPlus() {
		sb = new StringBuilder();
	}

	public void append(String str) {
		sb.append(str != null ? str : "");
	}

	public void appendLine(String str) {
		sb.append(str != null ? str : "").append(System.getProperty("line.separator"));
	}

	public void appendLine(Object obj) {
		sb.append(obj != null ? obj.toString() : "").append(System.getProperty("line.separator"));
	}

	public String toString() {
		return sb.toString();
	}
	
	public static class Factory {

		public static StringBuilderPlus criarStringBuilderPlus() {
			return new StringBuilderPlus();
		}

	}
	
	public static class Builder {
	
		public static StringBuilderPlus build() {
			return new StringBuilderPlus();
		}

		@Override
		public String toString() {
			return String.format("Builder{%s}", 
					"");
		}

	}
	
}