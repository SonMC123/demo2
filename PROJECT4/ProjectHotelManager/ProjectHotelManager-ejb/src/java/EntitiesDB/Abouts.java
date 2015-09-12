/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitiesDB;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sonmc
 */
@Entity
@Table(name = "Abouts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abouts.findAll", query = "SELECT a FROM Abouts a"),
    @NamedQuery(name = "Abouts.findById", query = "SELECT a FROM Abouts a WHERE a.id = :id"),
    @NamedQuery(name = "Abouts.findByContent", query = "SELECT a FROM Abouts a WHERE a.content = :content"),
    @NamedQuery(name = "Abouts.findByImage", query = "SELECT a FROM Abouts a WHERE a.image = :image"),
    @NamedQuery(name = "Abouts.findByInformationSort", query = "SELECT a FROM Abouts a WHERE a.informationSort = :informationSort")})
public class Abouts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "_id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "_content")
    private String content;
    @Size(max = 2147483647)
    @Column(name = "_image")
    private String image;
    @Size(max = 300)
    @Column(name = "_informationSort")
    private String informationSort;
    @JoinColumn(name = "_idRoom", referencedColumnName = "_idRoom")
    @ManyToOne
    private Rooms idRoom;
    @JoinColumn(name = "_idService", referencedColumnName = "_idService")
    @ManyToOne
    private Services idService;

    public Abouts() {
    }

    public Abouts(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInformationSort() {
        return informationSort;
    }

    public void setInformationSort(String informationSort) {
        this.informationSort = informationSort;
    }

    public Rooms getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Rooms idRoom) {
        this.idRoom = idRoom;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abouts)) {
            return false;
        }
        Abouts other = (Abouts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesDB.Abouts[ id=" + id + " ]";
    }
    
}
