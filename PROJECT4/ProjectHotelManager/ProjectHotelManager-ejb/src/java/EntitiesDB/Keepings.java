/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesDB;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sonmc
 */
@Entity
@Table(name = "Keepings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Keepings.findAll", query = "SELECT k FROM Keepings k"),
    @NamedQuery(name = "Keepings.findByIdKeeping", query = "SELECT k FROM Keepings k WHERE k.idKeeping = :idKeeping"),
    @NamedQuery(name = "Keepings.findByFullName", query = "SELECT k FROM Keepings k WHERE k.fullName = :fullName"),
    @NamedQuery(name = "Keepings.findByEmail", query = "SELECT k FROM Keepings k WHERE k.email = :email"),
    @NamedQuery(name = "Keepings.findByPhoneNumber", query = "SELECT k FROM Keepings k WHERE k.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Keepings.findByIdentitysCards", query = "SELECT k FROM Keepings k WHERE k.identitysCards = :identitysCards"),
    @NamedQuery(name = "Keepings.findByCheckIn", query = "SELECT k FROM Keepings k WHERE k.checkIn = :checkIn"),
    @NamedQuery(name = "Keepings.findByCheckOut", query = "SELECT k FROM Keepings k WHERE k.checkOut = :checkOut"),
    @NamedQuery(name = "Keepings.findByQuantityMember", query = "SELECT k FROM Keepings k WHERE k.quantityMember = :quantityMember"),
    @NamedQuery(name = "Keepings.findByQuantityRoom", query = "SELECT k FROM Keepings k WHERE k.quantityRoom = :quantityRoom")})
public class Keepings implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "_idKeeping")
    private Integer idKeeping;
    @Size(max = 50)
    @Column(name = "_fullName")
    private String fullName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 300)
    @Column(name = "_email")
    private String email;
    @Size(max = 15)
    @Column(name = "_phoneNumber")
    private String phoneNumber;
    @Size(max = 13)
    @Column(name = "_identitysCards")
    private String identitysCards;
    @Column(name = "_checkIn")
    @Temporal(TemporalType.DATE)
    private Date checkIn;
    @Column(name = "_checkOut")
    @Temporal(TemporalType.DATE)
    private Date checkOut;
    @Column(name = "_quantityMember")
    private Integer quantityMember;
    @Column(name = "_quantityRoom")
    private Integer quantityRoom;
    @JoinColumn(name = "_bookingId", referencedColumnName = "_bookingId")
    @ManyToOne
    private Bookings bookingId;
    @JoinColumn(name = "_idCustomer", referencedColumnName = "_idCustomer")
    @ManyToOne
    private Customers idCustomer;
    @OneToMany(mappedBy = "idKeeping")
    private List<Rooms> roomsList;

    public Keepings() {
    }

    public Keepings(Integer idKeeping) {
        this.idKeeping = idKeeping;
    }

    public Integer getIdKeeping() {
        return idKeeping;
    }

    public void setIdKeeping(Integer idKeeping) {
        this.idKeeping = idKeeping;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentitysCards() {
        return identitysCards;
    }

    public void setIdentitysCards(String identitysCards) {
        this.identitysCards = identitysCards;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Integer getQuantityMember() {
        return quantityMember;
    }

    public void setQuantityMember(Integer quantityMember) {
        this.quantityMember = quantityMember;
    }

    public Integer getQuantityRoom() {
        return quantityRoom;
    }

    public void setQuantityRoom(Integer quantityRoom) {
        this.quantityRoom = quantityRoom;
    }

    public Bookings getBookingId() {
        return bookingId;
    }

    public void setBookingId(Bookings bookingId) {
        this.bookingId = bookingId;
    }

    public Customers getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customers idCustomer) {
        this.idCustomer = idCustomer;
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
        hash += (idKeeping != null ? idKeeping.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Keepings)) {
            return false;
        }
        Keepings other = (Keepings) object;
        if ((this.idKeeping == null && other.idKeeping != null) || (this.idKeeping != null && !this.idKeeping.equals(other.idKeeping))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesDB.Keepings[ idKeeping=" + idKeeping + " ]";
    }
    
}
