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
@Table(name = "Service_Foods")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceFoods.findAll", query = "SELECT s FROM ServiceFoods s"),
    @NamedQuery(name = "ServiceFoods.findByFoodId", query = "SELECT s FROM ServiceFoods s WHERE s.foodId = :foodId"),
    @NamedQuery(name = "ServiceFoods.findByFoodName", query = "SELECT s FROM ServiceFoods s WHERE s.foodName = :foodName"),
    @NamedQuery(name = "ServiceFoods.findByImage", query = "SELECT s FROM ServiceFoods s WHERE s.image = :image"),
    @NamedQuery(name = "ServiceFoods.findByAuthorName", query = "SELECT s FROM ServiceFoods s WHERE s.authorName = :authorName"),
    @NamedQuery(name = "ServiceFoods.findByIngredients", query = "SELECT s FROM ServiceFoods s WHERE s.ingredients = :ingredients"),
    @NamedQuery(name = "ServiceFoods.findByPrice", query = "SELECT s FROM ServiceFoods s WHERE s.price = :price"),
    @NamedQuery(name = "ServiceFoods.findByDescriptionSort", query = "SELECT s FROM ServiceFoods s WHERE s.descriptionSort = :descriptionSort"),
    @NamedQuery(name = "ServiceFoods.findByDescriptionDetails", query = "SELECT s FROM ServiceFoods s WHERE s.descriptionDetails = :descriptionDetails")})
public class ServiceFoods implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "_foodId")
    private String foodId;
    @Size(max = 50)
    @Column(name = "_foodName")
    private String foodName;
    @Size(max = 300)
    @Column(name = "_image")
    private String image;
    @Size(max = 100)
    @Column(name = "_authorName")
    private String authorName;
    @Size(max = 2147483647)
    @Column(name = "_ingredients")
    private String ingredients;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "_price")
    private Double price;
    @Size(max = 200)
    @Column(name = "_descriptionSort")
    private String descriptionSort;
    @Size(max = 2147483647)
    @Column(name = "_descriptionDetails")
    private String descriptionDetails;
    @JoinColumn(name = "_idService", referencedColumnName = "_idService")
    @ManyToOne
    private Services idService;

    public ServiceFoods() {
    }

    public ServiceFoods(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public Services getIdService() {
        return idService;
    }

    public void setIdService(Services idService) {
        this.idService = idService;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foodId != null ? foodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceFoods)) {
            return false;
        }
        ServiceFoods other = (ServiceFoods) object;
        if ((this.foodId == null && other.foodId != null) || (this.foodId != null && !this.foodId.equals(other.foodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntitiesDB.ServiceFoods[ foodId=" + foodId + " ]";
    }
    
}
