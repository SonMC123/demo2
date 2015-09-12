/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallBean;

import GroupSessionBeanLocal.CustomersFacadeLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author sonmc
 */
public class CustomerManager {
    CustomersFacadeLocal customersFacade = lookupCustomersFacadeLocal();

    private CustomersFacadeLocal lookupCustomersFacadeLocal() {
        try {
            Context c = new InitialContext();
            return (CustomersFacadeLocal) c.lookup("java:global/ProjectHotelManager/ProjectHotelManager-ejb/CustomersFacade!GroupSessionBeanLocal.CustomersFacadeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
