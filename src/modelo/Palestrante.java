package modelo;

import javax.persistence.Entity;

@Entity
public class Palestrante extends Pessoa{
	private String formacao;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public Palestrante() {
	}
	
}
