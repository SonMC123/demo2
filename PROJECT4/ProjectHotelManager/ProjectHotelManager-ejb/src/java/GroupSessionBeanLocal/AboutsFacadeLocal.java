/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupSessionBeanLocal;

import EntitiesDB.Abouts;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sonmc
 */
@Local
public interface AboutsFacadeLocal {

    void create(Abouts abouts);

    void edit(Abouts abouts);

    void remove(Abouts abouts);

    Abouts find(Object id);

    List<Abouts> findAll();

    List<Abouts> findRange(int[] range);

    int count();
    
}
