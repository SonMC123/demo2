package EntitiesDB;

import EntitiesDB.Bookings;
import EntitiesDB.Customers;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(Employees.class)
public class Employees_ { 

    public static volatile SingularAttribute<Employees, String> lastName;
    public static volatile SingularAttribute<Employees, String> image;
    public static volatile SingularAttribute<Employees, String> address;
    public static volatile SingularAttribute<Employees, String> role;
    public static volatile SingularAttribute<Employees, Boolean> gender;
    public static volatile SingularAttribute<Employees, String> firtsName;
    public static volatile SingularAttribute<Employees, String> identityCard;
    public static volatile SingularAttribute<Employees, String> idEmployee;
    public static volatile ListAttribute<Employees, Customers> customersList;
    public static volatile SingularAttribute<Employees, String> password;
    public static volatile SingularAttribute<Employees, String> phoneNumber;
    public static volatile ListAttribute<Employees, Bookings> bookingsList;
    public static volatile SingularAttribute<Employees, Date> dateOfTime;
    public static volatile SingularAttribute<Employees, String> email;

}