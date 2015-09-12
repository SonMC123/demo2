/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupSessionBeanLocal;

import EntitiesDB.ServiceFoods;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sonmc
 */
@Local
public interface ServiceFoodsFacadeLocal {

    void create(ServiceFoods serviceFoods);

    void edit(ServiceFoods serviceFoods);

    void remove(ServiceFoods serviceFoods);

    ServiceFoods find(Object id);

    List<ServiceFoods> findAll();

    List<ServiceFoods> findRange(int[] range);

    int count();
    
}
