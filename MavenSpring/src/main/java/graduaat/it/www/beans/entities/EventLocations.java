/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans.entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "EventLocations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EventLocations.findAll", query = "SELECT e FROM EventLocations e")
    , @NamedQuery(name = "EventLocations.findById", query = "SELECT e FROM EventLocations e WHERE e.id = :id")
    , @NamedQuery(name = "EventLocations.findByUserID", query = "SELECT e FROM EventLocations e WHERE e.userID = :userID")
    , @NamedQuery(name = "EventLocations.findByName", query = "SELECT e FROM EventLocations e WHERE e.name = :name")
    , @NamedQuery(name = "EventLocations.findByManager", query = "SELECT e FROM EventLocations e WHERE e.manager = :manager")
    , @NamedQuery(name = "EventLocations.findByStreet", query = "SELECT e FROM EventLocations e WHERE e.street = :street")
    , @NamedQuery(name = "EventLocations.findByNrBus", query = "SELECT e FROM EventLocations e WHERE e.nrBus = :nrBus")
    , @NamedQuery(name = "EventLocations.findByPostCode", query = "SELECT e FROM EventLocations e WHERE e.postCode = :postCode")
    , @NamedQuery(name = "EventLocations.findByCity", query = "SELECT e FROM EventLocations e WHERE e.city = :city")
    , @NamedQuery(name = "EventLocations.findByCountry", query = "SELECT e FROM EventLocations e WHERE e.country = :country")
    , @NamedQuery(name = "EventLocations.findByPhone", query = "SELECT e FROM EventLocations e WHERE e.phone = :phone")
    , @NamedQuery(name = "EventLocations.findByVat", query = "SELECT e FROM EventLocations e WHERE e.vat = :vat")
    , @NamedQuery(name = "EventLocations.findByEmail", query = "SELECT e FROM EventLocations e WHERE e.email = :email")
    , @NamedQuery(name = "EventLocations.findByAck", query = "SELECT e FROM EventLocations e WHERE e.ack = :ack")})
public class EventLocations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userID")
    private long userID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "manager")
    private String manager;
    @Size(max = 255)
    @Column(name = "street")
    private String street;
    @Size(max = 255)
    @Column(name = "nrBus")
    private String nrBus;
    @Size(max = 255)
    @Column(name = "postCode")
    private String postCode;
    @Size(max = 255)
    @Column(name = "City")
    private String city;
    @Size(max = 255)
    @Column(name = "Country")
    private String country;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "phone")
    private String phone;
    @Size(max = 255)
    @Column(name = "vat")
    private String vat;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Column(name = "ack")
    private Short ack;
    @JoinColumn(name = "artistID", referencedColumnName = "id")
    @ManyToOne
    private Artists artistID;

    public EventLocations() {
    }

    public EventLocations(Long id) {
        this.id = id;
    }

    public EventLocations(Long id, long userID, String name) {
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
        if (!(object instanceof EventLocations)) {
            return false;
        }
        EventLocations other = (EventLocations) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "graduaat.it.www.beans.entities.EventLocations[ id=" + id + " ]";
    }
    
}
