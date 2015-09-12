/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupSessionBeanLocal;

import EntitiesDB.RoomTypes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sonmc
 */
@Stateless
public class RoomTypesFacade extends AbstractFacade<RoomTypes> implements RoomTypesFacadeLocal {
    @PersistenceContext(unitName = "ProjectHotelManager-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RoomTypesFacade() {
        super(RoomTypes.class);
    }
    
}
