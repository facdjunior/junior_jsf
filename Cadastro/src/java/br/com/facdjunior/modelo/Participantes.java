/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facdjunior.modelo;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.facdjunior.modelo.Participante;
/**
 *
 * @author Francisco Junior 09/07/2015
 */
@Stateless
public class Participantes {

	@Inject
	private EntityManager entityManager;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void adicionar(Participante participante) {
		this.entityManager.persist(participante);
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Participante>listaTodos() {
		return this.entityManager.createQuery("select p from Participante p", Participante.class).getResultList();
	}
	
}
