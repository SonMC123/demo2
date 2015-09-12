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
@Table(name = "Rooms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rooms.findAll", query = "SELECT r FROM Rooms r"),
    @NamedQuery(name = "Rooms.findByIdRoom", query = "SELECT r FROM Rooms r WHERE r.idRoom = :idRoom"),
    @NamedQuery(name = "Rooms.findByNameRoom", query = "SELECT r FROM Rooms r WHERE r.nameRoom = :nameRoom"),
    @NamedQuery(name = "Rooms.findByStatus", query = "SELECT r FROM Rooms r WHERE r.status = :status"),
    @NamedQuery(name = "Rooms.findByPrice", query = "SELECT r FROM Rooms r WHERE r.price = :price")})
public class Rooms implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "_idRoom")
    private Integer idRoom;
    @Size(max = 40)
    @Column(name = "_nameRoom")
    private String nameRoom;
    @Column(name = "_status")
    private Boolean status;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "_price")
    private Double price;
    @OneToMany(mappedBy = "idRoom")
    private List<Abouts> aboutsList;
    @OneToMany(mappedBy = "idRoom")
    private List<Equipments> equipmentsList;
    @JoinColumn(name = "_idKeeping", referencedColumnName = "_idKeeping")
    @ManyToOne
    private Keepings idKeeping;
    @JoinColumn(name = "_idRoomType", referencedColumnName = "_idRoomType")
    @ManyToOne
    private RoomTypes idRoomType;
    @JoinColumn(name = "_idService", referencedColumnName = "_idService")
    @ManyToOne
    private Services idService;

    public Rooms() {
    }

    public Rooms(Integer idRoom) {
        this.idRoom = idRoom;
    }

    public Integer getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Integer idRoom) {
        this.idRoom = idRoom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @XmlTransient
    public List<Abouts> getAboutsList() {
        return aboutsList;
    }

    public void setAboutsList(List<Abouts> aboutsList) {
        this.aboutsList = aboutsList;
    }

    @XmlTransient
    public List<Equipments> getEquipmentsList() {
        return equipmentsList;
    }

    public void setEquipmentsList(List<Equipments> equipmentsList) {
        this.equipmentsList = equipmentsList;
    }

    public Keepings getIdKeeping() {
        return idKeeping;
    }

    public void setIdKeeping(Keepings idKeeping) {
        this.idKeeping = idKeeping;
    }

    public RoomTypes getIdRoomType() {
        return idRoomType;
    }

    public void setIdRoomType(RoomTypes idRoomType) {
        this.idRoomType = idRoomType;
    }

    public Services getIdService() {
        return idService;
    }

    public void setIdService(Services idService) {
        this.idService = idService;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRoom != null ? idRoom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rooms)) {
            return false;
        }
        Rooms other = (Rooms) object;
        if ((this.idRoom == null && other.idRoom != null) || (this.idRoom != null && !this.idRoom.equals(other.idRoom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesDB.Rooms[ idRoom=" + idRoom + " ]";
    }
    
}
