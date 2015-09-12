package EntitiesDB;

import EntitiesDB.Rooms;
import EntitiesDB.Services;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(Abouts.class)
public class Abouts_ { 

    public static volatile SingularAttribute<Abouts, String> image;
    public static volatile SingularAttribute<Abouts, Rooms> idRoom;
    public static volatile SingularAttribute<Abouts, Services> idService;
    public static volatile SingularAttribute<Abouts, Integer> id;
    public static volatile SingularAttribute<Abouts, String> informationSort;
    public static volatile SingularAttribute<Abouts, String> content;

}