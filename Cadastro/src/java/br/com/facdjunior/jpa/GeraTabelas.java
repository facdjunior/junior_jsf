/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facdjunior.jpa;

/**
 *
 * @author TESTE
 */
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Francisco Junior 2015-06-01
 */
public class GeraTabelas {
    public static void main (String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("SysLab_PU");
        factory.close();
    }
}