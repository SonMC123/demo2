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
@Table(name = "Service_Games")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceGames.findAll", query = "SELECT s FROM ServiceGames s"),
    @NamedQuery(name = "ServiceGames.findByGameId", query = "SELECT s FROM ServiceGames s WHERE s.gameId = :gameId"),
    @NamedQuery(name = "ServiceGames.findByGameName", query = "SELECT s FROM ServiceGames s WHERE s.gameName = :gameName"),
    @NamedQuery(name = "ServiceGames.findByImage", query = "SELECT s FROM ServiceGames s WHERE s.image = :image"),
    @NamedQuery(name = "ServiceGames.findByQuantityPeople", query = "SELECT s FROM ServiceGames s WHERE s.quantityPeople = :quantityPeople"),
    @NamedQuery(name = "ServiceGames.findByDescriptionSort", query = "SELECT s FROM ServiceGames s WHERE s.descriptionSort = :descriptionSort"),
    @NamedQuery(name = "ServiceGames.findByDescriptionDetails", query = "SELECT s FROM ServiceGames s WHERE s.descriptionDetails = :descriptionDetails"),
    @NamedQuery(name = "ServiceGames.findByTool", query = "SELECT s FROM ServiceGames s WHERE s.tool = :tool"),
    @NamedQuery(name = "ServiceGames.findByPrice", query = "SELECT s FROM ServiceGames s WHERE s.price = :price")})
public class ServiceGames implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "_gameId")
    private String gameId;
    @Size(max = 50)
    @Column(name = "_gameName")
    private String gameName;
    @Size(max = 300)
    @Column(name = "_image")
    private String image;
    @Column(name = "_quantityPeople")
    private Integer quantityPeople;
    @Size(max = 200)
    @Column(name = "_descriptionSort")
    private String descriptionSort;
    @Size(max = 2147483647)
    @Column(name = "_descriptionDetails")
    private String descriptionDetails;
    @Size(max = 2147483647)
    @Column(name = "_tool")
    private String tool;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "_price")
    private Double price;
    @JoinColumn(name = "_idService", referencedColumnName = "_idService")
    @ManyToOne
    private Services idService;

    public ServiceGames() {
    }

    public ServiceGames(String gameId) {
        this.gameId = gameId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getQuantityPeople() {
        return quantityPeople;
    }

    public void setQuantityPeople(Integer quantityPeople) {
        this.quantityPeople = quantityPeople;
    }

    public String getDescriptionSort() {
        return descriptionSort;
    }

    public void setDescriptionSort(String descriptionSort) {
        this.descriptionSort = descriptionSort;
    }

    public String getDescriptionDetails() {
        return descriptionDetails;
    }

    public void setDescriptionDetails(String descriptionDetails) {
        this.descriptionDetails = descriptionDetails;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        hash += (gameId != null ? gameId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceGames)) {
            return false;
        }
        ServiceGames other = (ServiceGames) object;
        if ((this.gameId == null && other.gameId != null) || (this.gameId != null && !this.gameId.equals(other.gameId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesDB.ServiceGames[ gameId=" + gameId + " ]";
    }
    
}
