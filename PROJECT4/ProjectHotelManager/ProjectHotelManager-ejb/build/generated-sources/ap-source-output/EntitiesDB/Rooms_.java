package EntitiesDB;

import EntitiesDB.Abouts;
import EntitiesDB.Equipments;
import EntitiesDB.Keepings;
import EntitiesDB.RoomTypes;
import EntitiesDB.Services;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(Rooms.class)
public class Rooms_ { 

    public static volatile SingularAttribute<Rooms, RoomTypes> idRoomType;
    public static volatile SingularAttribute<Rooms, Integer> idRoom;
    public static volatile SingularAttribute<Rooms, String> nameRoom;
    public static volatile SingularAttribute<Rooms, Keepings> idKeeping;
    public static volatile SingularAttribute<Rooms, Double> price;
    public static volatile ListAttribute<Rooms, Abouts> aboutsList;
    public static volatile SingularAttribute<Rooms, Services> idService;
    public static volatile ListAttribute<Rooms, Equipments> equipmentsList;
    public static volatile SingularAttribute<Rooms, Boolean> status;

}