/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupSessionBeanLocal;

import EntitiesDB.Services;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sonmc
 */
@Stateless
public class ServicesFacade extends AbstractFacade<Services> implements ServicesFacadeLocal {
    @PersistenceContext(unitName = "ProjectHotelManager-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServicesFacade() {
        super(Services.class);
    }
    
}
