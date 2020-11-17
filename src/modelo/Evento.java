package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Evento {

	@Id @GeneratedValue
	private Long id;
	private String nome;
	private Date DataInicio;
	private Date DataFim;
	
	@OneToMany
	private List<Atividade> atividades = new ArrayList<Atividade>();
	
	@ManyToMany
	private List<Organizador> organizadores = new ArrayList<Organizador>();
	
	@OneToMany
	private List<Participante> participantes = new ArrayList<Participante>();	
	
	public Evento() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInicio() {
		return DataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		DataInicio = dataInicio;
	}

	public Date getDataFim() {
		return DataFim;
	}

	public void setDataFim(Date dataFim) {
		DataFim = dataFim;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public List<Organizador> getOrganizadores() {
		return organizadores;
	}
	public void setOrganizadores(List<Organizador> organizadores) {
		this.organizadores = organizadores;
	}

	public List<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}

}
