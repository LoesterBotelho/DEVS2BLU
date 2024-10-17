package diome.java.basico.aula01;

import diome.edu.primeirasemana.loester.Conta;

public class TesteConta {
	public static void main(String[] args) {
		
		Conta cc_lo = new Conta();
		
		cc_lo.depositar(800000.0);
		cc_lo.depositar(500000.0);
		cc_lo.depositar(300000.0);
		
		System.out.println("");
		
		cc_lo.imprimirSaldo();
		
		System.out.println("");
		
		cc_lo.sacar(10000.0);
		cc_lo.sacar(7000.0);
		
		System.out.println("");
		
		cc_lo.depositar(1800000.0);
		cc_lo.depositar(1500000.0);
		cc_lo.depositar(1300000.0);
		
		System.out.println("");
		
		cc_lo.imprimirSaldo();
		
		System.out.println("");
	}
}
