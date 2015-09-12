/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupSessionBeanLocal;

import EntitiesDB.RoomTypes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sonmc
 */
@Local
public interface RoomTypesFacadeLocal {

    void create(RoomTypes roomTypes);

    void edit(RoomTypes roomTypes);

    void remove(RoomTypes roomTypes);

    RoomTypes find(Object id);

    List<RoomTypes> findAll();

    List<RoomTypes> findRange(int[] range);

    int count();
    
}
