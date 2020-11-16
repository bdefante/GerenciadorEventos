package controle;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import service.OrganizadorService;


@ViewScoped
@ManagedBean
public class OrganizadorBean {
	@EJB
	private OrganizadorService organizadorService;
	
}
