package EntitiesDB;

import EntitiesDB.Bookings;
import EntitiesDB.Customers;
import EntitiesDB.Rooms;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(Keepings.class)
public class Keepings_ { 

    public static volatile SingularAttribute<Keepings, String> identitysCards;
    public static volatile SingularAttribute<Keepings, Integer> quantityRoom;
    public static volatile SingularAttribute<Keepings, Integer> quantityMember;
    public static volatile SingularAttribute<Keepings, String> phoneNumber;
    public static volatile SingularAttribute<Keepings, Date> checkIn;
    public static volatile SingularAttribute<Keepings, Integer> idKeeping;
    public static volatile SingularAttribute<Keepings, String> fullName;
    public static volatile SingularAttribute<Keepings, Date> checkOut;
    public static volatile SingularAttribute<Keepings, Bookings> bookingId;
    public static volatile SingularAttribute<Keepings, String> email;
    public static volatile ListAttribute<Keepings, Rooms> roomsList;
    public static volatile SingularAttribute<Keepings, Customers> idCustomer;

}