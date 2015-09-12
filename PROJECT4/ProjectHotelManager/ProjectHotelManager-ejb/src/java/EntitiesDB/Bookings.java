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
@Table(name = "Bookings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookings.findAll", query = "SELECT b FROM Bookings b"),
    @NamedQuery(name = "Bookings.findByBookingId", query = "SELECT b FROM Bookings b WHERE b.bookingId = :bookingId"),
    @NamedQuery(name = "Bookings.findByNameCustomer", query = "SELECT b FROM Bookings b WHERE b.nameCustomer = :nameCustomer"),
    @NamedQuery(name = "Bookings.findByAddress", query = "SELECT b FROM Bookings b WHERE b.address = :address"),
    @NamedQuery(name = "Bookings.findByQuantityRoom", query = "SELECT b FROM Bookings b WHERE b.quantityRoom = :quantityRoom"),
    @NamedQuery(name = "Bookings.findByIdentityCard", query = "SELECT b FROM Bookings b WHERE b.identityCard = :identityCard"),
    @NamedQuery(name = "Bookings.findByPhoneNumber", query = "SELECT b FROM Bookings b WHERE b.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Bookings.findByQuantityMember", query = "SELECT b FROM Bookings b WHERE b.quantityMember = :quantityMember"),
    @NamedQuery(name = "Bookings.findByCheckIn", query = "SELECT b FROM Bookings b WHERE b.checkIn = :checkIn"),
    @NamedQuery(name = "Bookings.findByCheckOut", query = "SELECT b FROM Bookings b WHERE b.checkOut = :checkOut"),
    @NamedQuery(name = "Bookings.findByNameInvoice", query = "SELECT b FROM Bookings b WHERE b.nameInvoice = :nameInvoice"),
    @NamedQuery(name = "Bookings.findByIdService", query = "SELECT b FROM Bookings b WHERE b.idService = :idService"),
    @NamedQuery(name = "Bookings.findByDateCreate", query = "SELECT b FROM Bookings b WHERE b.dateCreate = :dateCreate")})
public class Bookings implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "_bookingId")
    private Integer bookingId;
    @Size(max = 100)
    @Column(name = "_nameCustomer")
    private String nameCustomer;
    @Size(max = 300)
    @Column(name = "_address")
    private String address;
    @Column(name = "_quantityRoom")
    private Integer quantityRoom;
    @Size(max = 30)
    @Column(name = "_identityCard")
    private String identityCard;
    @Size(max = 20)
    @Column(name = "_phoneNumber")
    private String phoneNumber;
    @Column(name = "_quantityMember")
    private Integer quantityMember;
    @Column(name = "_checkIn")
    @Temporal(TemporalType.DATE)
    private Date checkIn;
    @Column(name = "_checkOut")
    @Temporal(TemporalType.DATE)
    private Date checkOut;
    @Size(max = 30)
    @Column(name = "_nameInvoice")
    private String nameInvoice;
    @Size(max = 20)
    @Column(name = "_idService")
    private String idService;
    @Column(name = "_dateCreate")
    @Temporal(TemporalType.DATE)
    private Date dateCreate;
    @OneToMany(mappedBy = "bookingId")
    private List<Keepings> keepingsList;
    @JoinColumn(name = "_idEmployee", referencedColumnName = "_idEmployee")
    @ManyToOne
    private Employees idEmployee;
    @JoinColumn(name = "_idRoomType", referencedColumnName = "_idRoomType")
    @ManyToOne
    private RoomTypes idRoomType;

    public Bookings() {
    }

    public Bookings(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getQuantityRoom() {
        return quantityRoom;
    }

    public void setQuantityRoom(Integer quantityRoom) {
        this.quantityRoom = quantityRoom;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getQuantityMember() {
        return quantityMember;
    }

    public void setQuantityMember(Integer quantityMember) {
        this.quantityMember = quantityMember;
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

    public String getNameInvoice() {
        return nameInvoice;
    }

    public void setNameInvoice(String nameInvoice) {
        this.nameInvoice = nameInvoice;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    @XmlTransient
    public List<Keepings> getKeepingsList() {
        return keepingsList;
    }

    public void setKeepingsList(List<Keepings> keepingsList) {
        this.keepingsList = keepingsList;
    }

    public Employees getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Employees idEmployee) {
        this.idEmployee = idEmployee;
    }

    public RoomTypes getIdRoomType() {
        return idRoomType;
    }

    public void setIdRoomType(RoomTypes idRoomType) {
        this.idRoomType = idRoomType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingId != null ? bookingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookings)) {
            return false;
        }
        Bookings other = (Bookings) object;
        if ((this.bookingId == null && other.bookingId != null) || (this.bookingId != null && !this.bookingId.equals(other.bookingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesDB.Bookings[ bookingId=" + bookingId + " ]";
    }
    
}
