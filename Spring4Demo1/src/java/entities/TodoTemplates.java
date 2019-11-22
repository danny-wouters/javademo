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
@Table(name = "TodoTemplates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TodoTemplates.findAll", query = "SELECT t FROM TodoTemplates t")
    , @NamedQuery(name = "TodoTemplates.findById", query = "SELECT t FROM TodoTemplates t WHERE t.id = :id")
    , @NamedQuery(name = "TodoTemplates.findBySortNumber", query = "SELECT t FROM TodoTemplates t WHERE t.sortNumber = :sortNumber")
    , @NamedQuery(name = "TodoTemplates.findByName", query = "SELECT t FROM TodoTemplates t WHERE t.name = :name")})
public class TodoTemplates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "sortNumber")
    private int sortNumber;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "artistID", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Artists artistID;
    @JoinColumn(name = "eventTypesID", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EventTypes eventTypesID;

    public TodoTemplates() {
    }

    public TodoTemplates(Long id) {
        this.id = id;
    }

    public TodoTemplates(Long id, int sortNumber, String name) {
        this.id = id;
        this.sortNumber = sortNumber;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(int sortNumber) {
        this.sortNumber = sortNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artists getArtistID() {
        return artistID;
    }

    public void setArtistID(Artists artistID) {
        this.artistID = artistID;
    }

    public EventTypes getEventTypesID() {
        return eventTypesID;
    }

    public void setEventTypesID(EventTypes eventTypesID) {
        this.eventTypesID = eventTypesID;
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
        if (!(object instanceof TodoTemplates)) {
            return false;
        }
        TodoTemplates other = (TodoTemplates) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TodoTemplates[ id=" + id + " ]";
    }
    
}
