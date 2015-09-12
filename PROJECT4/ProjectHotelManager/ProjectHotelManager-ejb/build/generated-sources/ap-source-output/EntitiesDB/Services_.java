package EntitiesDB;

import EntitiesDB.Abouts;
import EntitiesDB.Customers;
import EntitiesDB.Rooms;
import EntitiesDB.ServiceFoods;
import EntitiesDB.ServiceGames;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(Services.class)
public class Services_ { 

    public static volatile ListAttribute<Services, ServiceGames> serviceGamesList;
    public static volatile SingularAttribute<Services, String> nameService;
    public static volatile SingularAttribute<Services, Double> price;
    public static volatile ListAttribute<Services, Abouts> aboutsList;
    public static volatile SingularAttribute<Services, String> idService;
    public static volatile ListAttribute<Services, Rooms> roomsList;
    public static volatile SingularAttribute<Services, Customers> idCustomer;
    public static volatile ListAttribute<Services, ServiceFoods> serviceFoodsList;

}