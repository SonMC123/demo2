/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupSessionBeanLocal;

import EntitiesDB.ServiceGames;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sonmc
 */
@Local
public interface ServiceGamesFacadeLocal {

    void create(ServiceGames serviceGames);

    void edit(ServiceGames serviceGames);

    void remove(ServiceGames serviceGames);

    ServiceGames find(Object id);

    List<ServiceGames> findAll();

    List<ServiceGames> findRange(int[] range);

    int count();
    
}
