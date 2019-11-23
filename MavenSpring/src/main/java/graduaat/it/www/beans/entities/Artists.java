/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "Artists")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artists.findAll", query = "SELECT a FROM Artists a")
    , @NamedQuery(name = "Artists.findById", query = "SELECT a FROM Artists a WHERE a.id = :id")
    , @NamedQuery(name = "Artists.findByName", query = "SELECT a FROM Artists a WHERE a.name = :name")
    , @NamedQuery(name = "Artists.findByDescription", query = "SELECT a FROM Artists a WHERE a.description = :description")
    , @NamedQuery(name = "Artists.findByLogourl", query = "SELECT a FROM Artists a WHERE a.logourl = :logourl")})
public class Artists implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @Size(max = 255)
    @Column(name = "logourl")
    private String logourl;
    @OneToMany(mappedBy = "artistID")
    private Collection<EventLocations> eventLocationsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artists")
    private Collection<UsersArtist> usersArtistCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artistID")
    private Collection<EventTypes> eventTypesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artistID")
    private Collection<Clients> clientsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artistID")
    private Collection<Events> eventsCollection;

    public Artists() {
    }

    public Artists(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    @XmlTransient
    public Collection<EventLocations> getEventLocationsCollection() {
        return eventLocationsCollection;
    }

    public void setEventLocationsCollection(Collection<EventLocations> eventLocationsCollection) {
        this.eventLocationsCollection = eventLocationsCollection;
    }

    @XmlTransient
    public Collection<UsersArtist> getUsersArtistCollection() {
        return usersArtistCollection;
    }

    public void setUsersArtistCollection(Collection<UsersArtist> usersArtistCollection) {
        this.usersArtistCollection = usersArtistCollection;
    }

    @XmlTransient
    public Collection<EventTypes> getEventTypesCollection() {
        return eventTypesCollection;
    }

    public void setEventTypesCollection(Collection<EventTypes> eventTypesCollection) {
        this.eventTypesCollection = eventTypesCollection;
    }

    @XmlTransient
    public Collection<Clients> getClientsCollection() {
        return clientsCollection;
    }

    public void setClientsCollection(Collection<Clients> clientsCollection) {
        this.clientsCollection = clientsCollection;
    }

    @XmlTransient
    public Collection<Events> getEventsCollection() {
        return eventsCollection;
    }

    public void setEventsCollection(Collection<Events> eventsCollection) {
        this.eventsCollection = eventsCollection;
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
        if (!(object instanceof Artists)) {
            return false;
        }
        Artists other = (Artists) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "graduaat.it.www.beans.entities.Artists[ id=" + id + " ]";
    }
    
}
