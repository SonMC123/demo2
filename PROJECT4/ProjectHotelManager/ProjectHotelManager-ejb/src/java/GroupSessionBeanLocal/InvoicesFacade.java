/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupSessionBeanLocal;

import EntitiesDB.Invoices;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sonmc
 */
@Stateless
public class InvoicesFacade extends AbstractFacade<Invoices> implements InvoicesFacadeLocal {
    @PersistenceContext(unitName = "ProjectHotelManager-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InvoicesFacade() {
        super(Invoices.class);
    }
    
}
