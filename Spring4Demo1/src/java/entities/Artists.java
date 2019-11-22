/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
    , @NamedQuery(name = "Artists.findByDiscription", query = "SELECT a FROM Artists a WHERE a.discription = :discription")
    , @NamedQuery(name = "Artists.findByLogourl", query = "SELECT a FROM Artists a WHERE a.logourl = :logourl")})
public class Artists implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "discription")
    private String discription;
    @Column(name = "logourl")
    private String logourl;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artistID")
    private Collection<TodoTemplates> todoTemplatesCollection;
    @OneToMany(mappedBy = "artistID")
    private Collection<Locations> locationsCollection;
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

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    @XmlTransient
    public Collection<TodoTemplates> getTodoTemplatesCollection() {
        return todoTemplatesCollection;
    }

    public void setTodoTemplatesCollection(Collection<TodoTemplates> todoTemplatesCollection) {
        this.todoTemplatesCollection = todoTemplatesCollection;
    }

    @XmlTransient
    public Collection<Locations> getLocationsCollection() {
        return locationsCollection;
    }

    public void setLocationsCollection(Collection<Locations> locationsCollection) {
        this.locationsCollection = locationsCollection;
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
        return "entities.Artists[ id=" + id + " ]";
    }
    
}
