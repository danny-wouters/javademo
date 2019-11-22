/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "Locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locations.findAll", query = "SELECT l FROM Locations l")
    , @NamedQuery(name = "Locations.findById", query = "SELECT l FROM Locations l WHERE l.id = :id")
    , @NamedQuery(name = "Locations.findByUserID", query = "SELECT l FROM Locations l WHERE l.userID = :userID")
    , @NamedQuery(name = "Locations.findByName", query = "SELECT l FROM Locations l WHERE l.name = :name")
    , @NamedQuery(name = "Locations.findByManager", query = "SELECT l FROM Locations l WHERE l.manager = :manager")
    , @NamedQuery(name = "Locations.findByStreet", query = "SELECT l FROM Locations l WHERE l.street = :street")
    , @NamedQuery(name = "Locations.findByNrBus", query = "SELECT l FROM Locations l WHERE l.nrBus = :nrBus")
    , @NamedQuery(name = "Locations.findByPostCode", query = "SELECT l FROM Locations l WHERE l.postCode = :postCode")
    , @NamedQuery(name = "Locations.findByCity", query = "SELECT l FROM Locations l WHERE l.city = :city")
    , @NamedQuery(name = "Locations.findByCountry", query = "SELECT l FROM Locations l WHERE l.country = :country")
    , @NamedQuery(name = "Locations.findByPhone", query = "SELECT l FROM Locations l WHERE l.phone = :phone")
    , @NamedQuery(name = "Locations.findByVat", query = "SELECT l FROM Locations l WHERE l.vat = :vat")
    , @NamedQuery(name = "Locations.findByEmail", query = "SELECT l FROM Locations l WHERE l.email = :email")
    , @NamedQuery(name = "Locations.findByAck", query = "SELECT l FROM Locations l WHERE l.ack = :ack")})
public class Locations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "userID")
    private long userID;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "manager")
    private String manager;
    @Column(name = "street")
    private String street;
    @Column(name = "nrBus")
    private String nrBus;
    @Column(name = "postCode")
    private String postCode;
    @Column(name = "City")
    private String city;
    @Column(name = "Country")
    private String country;
    @Column(name = "phone")
    private String phone;
    @Column(name = "vat")
    private String vat;
    @Column(name = "email")
    private String email;
    @Column(name = "ack")
    private Short ack;
    @JoinColumn(name = "artistID", referencedColumnName = "id")
    @ManyToOne
    private Artists artistID;

    public Locations() {
    }

    public Locations(Long id) {
        this.id = id;
    }

    public Locations(Long id, long userID, String name) {
        this.id = id;
        this.userID = userID;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNrBus() {
        return nrBus;
    }

    public void setNrBus(String nrBus) {
        this.nrBus = nrBus;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Short getAck() {
        return ack;
    }

    public void setAck(Short ack) {
        this.ack = ack;
    }

    public Artists getArtistID() {
        return artistID;
    }

    public void setArtistID(Artists artistID) {
        this.artistID = artistID;
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
        if (!(object instanceof Locations)) {
            return false;
        }
        Locations other = (Locations) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Locations[ id=" + id + " ]";
    }
    
}
