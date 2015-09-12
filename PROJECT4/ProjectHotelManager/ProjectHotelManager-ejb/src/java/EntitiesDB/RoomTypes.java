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
@Table(name = "RoomTypes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoomTypes.findAll", query = "SELECT r FROM RoomTypes r"),
    @NamedQuery(name = "RoomTypes.findByIdRoomType", query = "SELECT r FROM RoomTypes r WHERE r.idRoomType = :idRoomType"),
    @NamedQuery(name = "RoomTypes.findByType", query = "SELECT r FROM RoomTypes r WHERE r.type = :type")})
public class RoomTypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "_idRoomType")
    private Integer idRoomType;
    @Size(max = 100)
    @Column(name = "_type")
    private String type;
    @OneToMany(mappedBy = "idRoomType")
    private List<Bookings> bookingsList;
    @OneToMany(mappedBy = "idRoomType")
    private List<Invoices> invoicesList;
    @OneToMany(mappedBy = "idRoomType")
    private List<Rooms> roomsList;

    public RoomTypes() {
    }

    public RoomTypes(Integer idRoomType) {
        this.idRoomType = idRoomType;
    }

    public Integer getIdRoomType() {
        return idRoomType;
    }

    public void setIdRoomType(Integer idRoomType) {
        this.idRoomType = idRoomType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlTransient
    public List<Bookings> getBookingsList() {
        return bookingsList;
    }

    public void setBookingsList(List<Bookings> bookingsList) {
        this.bookingsList = bookingsList;
    }

    @XmlTransient
    public List<Invoices> getInvoicesList() {
        return invoicesList;
    }

    public void setInvoicesList(List<Invoices> invoicesList) {
        this.invoicesList = invoicesList;
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
        hash += (idRoomType != null ? idRoomType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomTypes)) {
            return false;
        }
        RoomTypes other = (RoomTypes) object;
        if ((this.idRoomType == null && other.idRoomType != null) || (this.idRoomType != null && !this.idRoomType.equals(other.idRoomType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesDB.RoomTypes[ idRoomType=" + idRoomType + " ]";
    }
    
}
