package devs2blu.Aula10.Exerc01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProjetoPesquisa {

	private Integer codigo;
	private LocalDate dataInicio;
	private LocalDate dataFinal;
	private Professor professor;
	private List<Pesquisador> equipe = new ArrayList<>();

	public ProjetoPesquisa() {
		equipe = new ArrayList<>();
	}

	public ProjetoPesquisa(Integer codigo, LocalDate dataInicio, LocalDate dataFinal, Professor professor,
			List<Pesquisador> equipe) {
		this();

		this.codigo = codigo;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.professor = professor;
		this.equipe = equipe;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Pesquisador> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Pesquisador> equipe) {
		this.equipe = equipe;
	}

	@Override
	public String toString() {
		return "ProjetoPesquisa [codigo=" + codigo + ", dataInicio=" + dataInicio + ", dataFinal=" + dataFinal
				+ ", professor=" + professor + ", equipe=" + 
				equipe.stream().map(Object::toString).collect(Collectors.joining(" , ")) 
				+ "]";
	}

}
