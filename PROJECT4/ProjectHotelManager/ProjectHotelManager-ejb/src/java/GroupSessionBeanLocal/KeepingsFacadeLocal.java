/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupSessionBeanLocal;

import EntitiesDB.Keepings;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sonmc
 */
@Local
public interface KeepingsFacadeLocal {

    void create(Keepings keepings);

    void edit(Keepings keepings);

    void remove(Keepings keepings);

    Keepings find(Object id);

    List<Keepings> findAll();

    List<Keepings> findRange(int[] range);

    int count();
    
}
