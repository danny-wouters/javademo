/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Artists;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Danny
 */
@Stateless
public class ArtistsFacade extends AbstractFacade<Artists> {

    @PersistenceContext(unitName = "Spring3Demo1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArtistsFacade() {
        super(Artists.class);
    }
    
}
