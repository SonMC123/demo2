package EntitiesDB;

import EntitiesDB.Bookings;
import EntitiesDB.Invoices;
import EntitiesDB.Rooms;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(RoomTypes.class)
public class RoomTypes_ { 

    public static volatile SingularAttribute<RoomTypes, Integer> idRoomType;
    public static volatile ListAttribute<RoomTypes, Bookings> bookingsList;
    public static volatile ListAttribute<RoomTypes, Invoices> invoicesList;
    public static volatile SingularAttribute<RoomTypes, String> type;
    public static volatile ListAttribute<RoomTypes, Rooms> roomsList;

}