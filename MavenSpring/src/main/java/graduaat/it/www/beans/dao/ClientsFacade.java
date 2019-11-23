/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans.dao;

import graduaat.it.www.beans.entities.Clients;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Danny
 */
@Stateless
public class ClientsFacade extends AbstractFacade<Clients> {

    @PersistenceContext(unitName = "graduaat.it.www.beans_MavenSpring_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientsFacade() {
        super(Clients.class);
    }
    
}
