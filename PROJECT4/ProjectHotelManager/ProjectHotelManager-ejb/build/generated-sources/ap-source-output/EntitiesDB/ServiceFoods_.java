package EntitiesDB;

import EntitiesDB.Services;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(ServiceFoods.class)
public class ServiceFoods_ { 

    public static volatile SingularAttribute<ServiceFoods, String> image;
    public static volatile SingularAttribute<ServiceFoods, String> foodName;
    public static volatile SingularAttribute<ServiceFoods, String> authorName;
    public static volatile SingularAttribute<ServiceFoods, Double> price;
    public static volatile SingularAttribute<ServiceFoods, String> foodId;
    public static volatile SingularAttribute<ServiceFoods, String> descriptionSort;
    public static volatile SingularAttribute<ServiceFoods, String> ingredients;
    public static volatile SingularAttribute<ServiceFoods, Services> idService;
    public static volatile SingularAttribute<ServiceFoods, String> descriptionDetails;

}