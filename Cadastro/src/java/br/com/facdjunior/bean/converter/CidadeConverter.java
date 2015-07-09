package br.com.facdjunior.bean.converter;

/**
 *
 * @author Francisco Junior 09/07/2015
 */
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.facdjunior.modelo.Cidade;

@FacesConverter("cidadeConverter")
public class CidadeConverter implements Converter {

	@Inject
	private EntityManager entityManager;
	
	@Override
	public Object getAsObject(FacesContext ctx, UIComponent component, String value) {
		return entityManager.find(Cidade.class, Integer.valueOf(value));
	}

	@Override
	public String getAsString(FacesContext ctx, UIComponent component, Object value) {
		if (value == null) {
			return "";
		}
		return String.valueOf(((Cidade) value).getCodigo());
	}

}
