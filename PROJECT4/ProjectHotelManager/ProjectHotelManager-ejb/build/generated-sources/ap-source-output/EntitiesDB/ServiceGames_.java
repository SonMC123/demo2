package EntitiesDB;

import EntitiesDB.Services;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(ServiceGames.class)
public class ServiceGames_ { 

    public static volatile SingularAttribute<ServiceGames, String> gameId;
    public static volatile SingularAttribute<ServiceGames, String> image;
    public static volatile SingularAttribute<ServiceGames, String> gameName;
    public static volatile SingularAttribute<ServiceGames, Double> price;
    public static volatile SingularAttribute<ServiceGames, String> descriptionSort;
    public static volatile SingularAttribute<ServiceGames, Services> idService;
    public static volatile SingularAttribute<ServiceGames, Integer> quantityPeople;
    public static volatile SingularAttribute<ServiceGames, String> descriptionDetails;
    public static volatile SingularAttribute<ServiceGames, String> tool;

}