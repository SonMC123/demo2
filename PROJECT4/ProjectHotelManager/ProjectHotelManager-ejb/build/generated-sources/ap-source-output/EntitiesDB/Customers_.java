package EntitiesDB;

import EntitiesDB.Employees;
import EntitiesDB.Invoices;
import EntitiesDB.Keepings;
import EntitiesDB.Services;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile ListAttribute<Customers, Services> servicesList;
    public static volatile SingularAttribute<Customers, String> address;
    public static volatile SingularAttribute<Customers, Boolean> gender;
    public static volatile SingularAttribute<Customers, Integer> idInvoice;
    public static volatile SingularAttribute<Customers, String> identityCard;
    public static volatile SingularAttribute<Customers, String> idCustomer;
    public static volatile SingularAttribute<Customers, Employees> idEmployee;
    public static volatile SingularAttribute<Customers, String> phoneNumber;
    public static volatile SingularAttribute<Customers, String> nameCustomer;
    public static volatile SingularAttribute<Customers, String> nationality;
    public static volatile ListAttribute<Customers, Invoices> invoicesList;
    public static volatile SingularAttribute<Customers, Date> dateOfTime;
    public static volatile ListAttribute<Customers, Keepings> keepingsList;
    public static volatile SingularAttribute<Customers, String> email;

}