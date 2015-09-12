package EntitiesDB;

import EntitiesDB.Employees;
import EntitiesDB.Keepings;
import EntitiesDB.RoomTypes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(Bookings.class)
public class Bookings_ { 

    public static volatile SingularAttribute<Bookings, Integer> quantityRoom;
    public static volatile SingularAttribute<Bookings, String> address;
    public static volatile SingularAttribute<Bookings, String> nameInvoice;
    public static volatile SingularAttribute<Bookings, String> identityCard;
    public static volatile SingularAttribute<Bookings, Date> dateCreate;
    public static volatile SingularAttribute<Bookings, Integer> bookingId;
    public static volatile SingularAttribute<Bookings, RoomTypes> idRoomType;
    public static volatile SingularAttribute<Bookings, Employees> idEmployee;
    public static volatile SingularAttribute<Bookings, Integer> quantityMember;
    public static volatile SingularAttribute<Bookings, String> phoneNumber;
    public static volatile SingularAttribute<Bookings, Date> checkIn;
    public static volatile SingularAttribute<Bookings, String> nameCustomer;
    public static volatile SingularAttribute<Bookings, String> idService;
    public static volatile SingularAttribute<Bookings, Date> checkOut;
    public static volatile ListAttribute<Bookings, Keepings> keepingsList;

}