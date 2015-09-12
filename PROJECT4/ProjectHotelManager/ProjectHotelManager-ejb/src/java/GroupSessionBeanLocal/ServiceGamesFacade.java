/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupSessionBeanLocal;

import EntitiesDB.ServiceGames;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sonmc
 */
@Stateless
public class ServiceGamesFacade extends AbstractFacade<ServiceGames> implements ServiceGamesFacadeLocal {
    @PersistenceContext(unitName = "ProjectHotelManager-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServiceGamesFacade() {
        super(ServiceGames.class);
    }
    
}
