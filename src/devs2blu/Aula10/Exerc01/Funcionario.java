package devs2blu.Aula10.Exerc01;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Funcionario{

	private BigDecimal salario;
	private BigInteger matricula;

	public Funcionario() {
		this.salario = new BigDecimal("0.0");
		this.matricula = new BigInteger("0");
	}

	public Funcionario(BigDecimal salario, BigInteger matricula) {
		this();

		this.salario = salario;
		this.matricula = matricula;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public BigInteger getMatricula() {
		return matricula;
	}

	public void setMatricula(BigInteger matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		
		return String.format("Funcionario [salario=%2.f, matricula=%s]"
				, this.getSalario()
				, this.getMatricula());
		
	}
	
	
}
