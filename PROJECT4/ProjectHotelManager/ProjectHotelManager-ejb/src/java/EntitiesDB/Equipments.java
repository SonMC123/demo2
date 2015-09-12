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
@Table(name = "Equipments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipments.findAll", query = "SELECT e FROM Equipments e"),
    @NamedQuery(name = "Equipments.findByIdEquiment", query = "SELECT e FROM Equipments e WHERE e.idEquiment = :idEquiment"),
    @NamedQuery(name = "Equipments.findByNameEquiment", query = "SELECT e FROM Equipments e WHERE e.nameEquiment = :nameEquiment"),
    @NamedQuery(name = "Equipments.findByImage", query = "SELECT e FROM Equipments e WHERE e.image = :image")})
public class Equipments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "_idEquiment")
    private Integer idEquiment;
    @Size(max = 100)
    @Column(name = "_nameEquiment")
    private String nameEquiment;
    @Size(max = 2147483647)
    @Column(name = "_image")
    private String image;
    @JoinColumn(name = "_idRoom", referencedColumnName = "_idRoom")
    @ManyToOne
    private Rooms idRoom;

    public Equipments() {
    }

    public Equipments(Integer idEquiment) {
        this.idEquiment = idEquiment;
    }

    public Integer getIdEquiment() {
        return idEquiment;
    }

    public void setIdEquiment(Integer idEquiment) {
        this.idEquiment = idEquiment;
    }

    public String getNameEquiment() {
        return nameEquiment;
    }

    public void setNameEquiment(String nameEquiment) {
        this.nameEquiment = nameEquiment;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Rooms getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Rooms idRoom) {
        this.idRoom = idRoom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquiment != null ? idEquiment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipments)) {
            return false;
        }
        Equipments other = (Equipments) object;
        if ((this.idEquiment == null && other.idEquiment != null) || (this.idEquiment != null && !this.idEquiment.equals(other.idEquiment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesDB.Equipments[ idEquiment=" + idEquiment + " ]";
    }
    
}
