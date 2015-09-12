/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesDB;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sonmc
 */
@Entity
@Table(name = "Services")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Services.findAll", query = "SELECT s FROM Services s"),
    @NamedQuery(name = "Services.findByIdService", query = "SELECT s FROM Services s WHERE s.idService = :idService"),
    @NamedQuery(name = "Services.findByNameService", query = "SELECT s FROM Services s WHERE s.nameService = :nameService"),
    @NamedQuery(name = "Services.findByPrice", query = "SELECT s FROM Services s WHERE s.price = :price")})
public class Services implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "_idService")
    private String idService;
    @Size(max = 50)
    @Column(name = "_nameService")
    private String nameService;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "_price")
    private Double price;
    @JoinColumn(name = "_idCustomer", referencedColumnName = "_idCustomer")
    @ManyToOne
    private Customers idCustomer;
    @OneToMany(mappedBy = "idService")
    private List<Abouts> aboutsList;
    @OneToMany(mappedBy = "idService")
    private List<ServiceFoods> serviceFoodsList;
    @OneToMany(mappedBy = "idService")
    private List<ServiceGames> serviceGamesList;
    @OneToMany(mappedBy = "idService")
    private List<Rooms> roomsList;

    public Services() {
    }

    public Services(String idService) {
        this.idService = idService;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Customers getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customers idCustomer) {
        this.idCustomer = idCustomer;
    }

    @XmlTransient
    public List<Abouts> getAboutsList() {
        return aboutsList;
    }

    public void setAboutsList(List<Abouts> aboutsList) {
        this.aboutsList = aboutsList;
    }

    @XmlTransient
    public List<ServiceFoods> getServiceFoodsList() {
        return serviceFoodsList;
    }

    public void setServiceFoodsList(List<ServiceFoods> serviceFoodsList) {
        this.serviceFoodsList = serviceFoodsList;
    }

    @XmlTransient
    public List<ServiceGames> getServiceGamesList() {
        return serviceGamesList;
    }

    public void setServiceGamesList(List<ServiceGames> serviceGamesList) {
        this.serviceGamesList = serviceGamesList;
    }

    @XmlTransient
    public List<Rooms> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(List<Rooms> roomsList) {
        this.roomsList = roomsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idService != null ? idService.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Services)) {
            return false;
        }
        Services other = (Services) object;
        if ((this.idService == null && other.idService != null) || (this.idService != null && !this.idService.equals(other.idService))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesDB.Services[ idService=" + idService + " ]";
    }
    
}
