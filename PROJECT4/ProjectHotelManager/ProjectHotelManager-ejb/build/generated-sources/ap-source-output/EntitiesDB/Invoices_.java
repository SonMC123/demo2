package EntitiesDB;

import EntitiesDB.Customers;
import EntitiesDB.RoomTypes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(Invoices.class)
public class Invoices_ { 

    public static volatile SingularAttribute<Invoices, Integer> quantityRoom;
    public static volatile SingularAttribute<Invoices, String> address;
    public static volatile SingularAttribute<Invoices, String> nameInvoice;
    public static volatile SingularAttribute<Invoices, Integer> idInvoice;
    public static volatile SingularAttribute<Invoices, String> identityCard;
    public static volatile SingularAttribute<Invoices, Date> dateCreate;
    public static volatile SingularAttribute<Invoices, Customers> idCustomer;
    public static volatile SingularAttribute<Invoices, RoomTypes> idRoomType;
    public static volatile SingularAttribute<Invoices, Integer> quantityMember;
    public static volatile SingularAttribute<Invoices, String> phoneNumber;
    public static volatile SingularAttribute<Invoices, Date> checkIn;
    public static volatile SingularAttribute<Invoices, String> nameCustomer;
    public static volatile SingularAttribute<Invoices, String> idService;
    public static volatile SingularAttribute<Invoices, Date> checkOut;

}