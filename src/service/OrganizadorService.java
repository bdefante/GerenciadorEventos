package service;

import javax.ejb.Stateless;

import modelo.Organizador;

@Stateless
public class OrganizadorService extends GenericService<Organizador>{
	public OrganizadorService() {
		super(Organizador.class);
	}
}
