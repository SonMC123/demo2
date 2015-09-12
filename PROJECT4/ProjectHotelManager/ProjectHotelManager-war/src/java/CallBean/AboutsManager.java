/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallBean;

import GroupSessionBeanLocal.AboutsFacadeLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author sonmc
 */
public class AboutsManager {
    AboutsFacadeLocal aboutsFacade = lookupAboutsFacadeLocal();

    private AboutsFacadeLocal lookupAboutsFacadeLocal() {
        try {
            Context c = new InitialContext();
            return (AboutsFacadeLocal) c.lookup("java:global/ProjectHotelManager/ProjectHotelManager-ejb/AboutsFacade!GroupSessionBeanLocal.AboutsFacadeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
