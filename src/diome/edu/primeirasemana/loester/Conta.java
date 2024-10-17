package diome.edu.primeirasemana.loester;

public class Conta {

	private double saldo = 0.0;

	
	public Conta() {
		this.saldo = 0.0;
	}
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.printf("foi efetuado um deposito no valor de %.2f saldo atual %.2f \n", valor , this.saldo);
	}
	
	public void sacar(double valor) {
		
		if (this.saldo <= valor) {
			System.out.println("NÃO EXISTE SALDO PARA SAQUE");
		} else {
			this.saldo -= valor;
			System.out.printf("foi efetuado um saque no valor de %.2f saldo atual %.2f \n", valor , this.saldo);
		}
				
	}
	
	public void imprimirSaldo() {
		System.out.printf("Saldo atual %.2f \n", this.saldo);	
	}
	
	
}
