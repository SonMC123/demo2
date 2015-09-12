/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupSessionBeanLocal;

import EntitiesDB.Rooms;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sonmc
 */
@Local
public interface RoomsFacadeLocal {

    void create(Rooms rooms);

    void edit(Rooms rooms);

    void remove(Rooms rooms);

    Rooms find(Object id);

    List<Rooms> findAll();

    List<Rooms> findRange(int[] range);

    int count();
    
}
