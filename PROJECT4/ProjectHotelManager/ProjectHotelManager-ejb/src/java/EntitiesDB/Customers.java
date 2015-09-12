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
@Table(name = "Customers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c"),
    @NamedQuery(name = "Customers.findByIdCustomer", query = "SELECT c FROM Customers c WHERE c.idCustomer = :idCustomer"),
    @NamedQuery(name = "Customers.findByNameCustomer", query = "SELECT c FROM Customers c WHERE c.nameCustomer = :nameCustomer"),
    @NamedQuery(name = "Customers.findByAddress", query = "SELECT c FROM Customers c WHERE c.address = :address"),
    @NamedQuery(name = "Customers.findByGender", query = "SELECT c FROM Customers c WHERE c.gender = :gender"),
    @NamedQuery(name = "Customers.findByIdentityCard", query = "SELECT c FROM Customers c WHERE c.identityCard = :identityCard"),
    @NamedQuery(name = "Customers.findByPhoneNumber", query = "SELECT c FROM Customers c WHERE c.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Customers.findByNationality", query = "SELECT c FROM Customers c WHERE c.nationality = :nationality"),
    @NamedQuery(name = "Customers.findByDateOfTime", query = "SELECT c FROM Customers c WHERE c.dateOfTime = :dateOfTime"),
    @NamedQuery(name = "Customers.findByEmail", query = "SELECT c FROM Customers c WHERE c.email = :email"),
    @NamedQuery(name = "Customers.findByIdInvoice", query = "SELECT c FROM Customers c WHERE c.idInvoice = :idInvoice")})
public class Customers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "_idCustomer")
    private String idCustomer;
    @Size(max = 100)
    @Column(name = "_nameCustomer")
    private String nameCustomer;
    @Size(max = 200)
    @Column(name = "_address")
    private String address;
    @Column(name = "_gender")
    private Boolean gender;
    @Size(max = 50)
    @Column(name = "_identityCard")
    private String identityCard;
    @Size(max = 11)
    @Column(name = "_phoneNumber")
    private String phoneNumber;
    @Size(max = 30)
    @Column(name = "_nationality")
    private String nationality;
    @Column(name = "_dateOfTime")
    @Temporal(TemporalType.DATE)
    private Date dateOfTime;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 300)
    @Column(name = "_email")
    private String email;
    @Column(name = "_idInvoice")
    private Integer idInvoice;
    @OneToMany(mappedBy = "idCustomer")
    private List<Services> servicesList;
    @OneToMany(mappedBy = "idCustomer")
    private List<Keepings> keepingsList;
    @JoinColumn(name = "_idEmployee", referencedColumnName = "_idEmployee")
    @ManyToOne
    private Employees idEmployee;
    @OneToMany(mappedBy = "idCustomer")
    private List<Invoices> invoicesList;

    public Customers() {
    }

    public Customers(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfTime() {
        return dateOfTime;
    }

    public void setDateOfTime(Date dateOfTime) {
        this.dateOfTime = dateOfTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    @XmlTransient
    public List<Services> getServicesList() {
        return servicesList;
    }

    public void setServicesList(List<Services> servicesList) {
        this.servicesList = servicesList;
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

    @XmlTransient
    public List<Invoices> getInvoicesList() {
        return invoicesList;
    }

    public void setInvoicesList(List<Invoices> invoicesList) {
        this.invoicesList = invoicesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCustomer != null ? idCustomer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.idCustomer == null && other.idCustomer != null) || (this.idCustomer != null && !this.idCustomer.equals(other.idCustomer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesDB.Customers[ idCustomer=" + idCustomer + " ]";
    }
    
}
