/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvc.projeto.repository;

import br.com.mvc.projeto.model.Imovel;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Imoveis {

    @PersistenceContext
    private EntityManager manager;

    @Transactional
    public void guardar(Imovel imovel) {
        manager.persist(imovel);
    }

}
