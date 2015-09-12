package EntitiesDB;

import EntitiesDB.Rooms;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-12T13:23:36")
@StaticMetamodel(Equipments.class)
public class Equipments_ { 

    public static volatile SingularAttribute<Equipments, String> image;
    public static volatile SingularAttribute<Equipments, Rooms> idRoom;
    public static volatile SingularAttribute<Equipments, Integer> idEquiment;
    public static volatile SingularAttribute<Equipments, String> nameEquiment;

}