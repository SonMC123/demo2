/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesDB;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sonmc
 */
@Entity
@Table(name = "Invoices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoices.findAll", query = "SELECT i FROM Invoices i"),
    @NamedQuery(name = "Invoices.findByIdInvoice", query = "SELECT i FROM Invoices i WHERE i.idInvoice = :idInvoice"),
    @NamedQuery(name = "Invoices.findByNameCustomer", query = "SELECT i FROM Invoices i WHERE i.nameCustomer = :nameCustomer"),
    @NamedQuery(name = "Invoices.findByAddress", query = "SELECT i FROM Invoices i WHERE i.address = :address"),
    @NamedQuery(name = "Invoices.findByQuantityRoom", query = "SELECT i FROM Invoices i WHERE i.quantityRoom = :quantityRoom"),
    @NamedQuery(name = "Invoices.findByIdentityCard", query = "SELECT i FROM Invoices i WHERE i.identityCard = :identityCard"),
    @NamedQuery(name = "Invoices.findByPhoneNumber", query = "SELECT i FROM Invoices i WHERE i.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Invoices.findByQuantityMember", query = "SELECT i FROM Invoices i WHERE i.quantityMember = :quantityMember"),
    @NamedQuery(name = "Invoices.findByCheckIn", query = "SELECT i FROM Invoices i WHERE i.checkIn = :checkIn"),
    @NamedQuery(name = "Invoices.findByCheckOut", query = "SELECT i FROM Invoices i WHERE i.checkOut = :checkOut"),
    @NamedQuery(name = "Invoices.findByNameInvoice", query = "SELECT i FROM Invoices i WHERE i.nameInvoice = :nameInvoice"),
    @NamedQuery(name = "Invoices.findByIdService", query = "SELECT i FROM Invoices i WHERE i.idService = :idService"),
    @NamedQuery(name = "Invoices.findByDateCreate", query = "SELECT i FROM Invoices i WHERE i.dateCreate = :dateCreate")})
public class Invoices implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "_idInvoice")
    private Integer idInvoice;
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
    @JoinColumn(name = "_idCustomer", referencedColumnName = "_idCustomer")
    @ManyToOne
    private Customers idCustomer;
    @JoinColumn(name = "_idRoomType", referencedColumnName = "_idRoomType")
    @ManyToOne
    private RoomTypes idRoomType;

    public Invoices() {
    }

    public Invoices(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
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

    public Customers getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customers idCustomer) {
        this.idCustomer = idCustomer;
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
        hash += (idInvoice != null ? idInvoice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoices)) {
            return false;
        }
        Invoices other = (Invoices) object;
        if ((this.idInvoice == null && other.idInvoice != null) || (this.idInvoice != null && !this.idInvoice.equals(other.idInvoice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesDB.Invoices[ idInvoice=" + idInvoice + " ]";
    }
    
}
