/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facdjunior.bean;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.facdjunior.modelo.Participante;
import br.com.facdjunior.modelo.Participantes;


/**
 *
 * @author Francisco Junior 09/07/2015
 */
@Named
@ViewScoped
public class CadastroBean implements Serializable{
    
    private static final long serialVersionUID = 1L;

	@Inject
	private Participantes participantes;
	
	private Participante participante = new Participante();

	public Participante getParticipante() {
		return this.participante;
	}
	
	public List<Participante> getParticipantes() {
		return this.participantes.listaTodos();
	}
	
	public void gravar(ActionEvent event) {
		participantes.adicionar(participante);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Você foi cadastrado com sucesso neste Evento."));
	}
	
}
