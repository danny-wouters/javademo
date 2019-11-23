/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
 * @author Danny
 */
@Entity
@Table(name = "events")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Events.findAll", query = "SELECT e FROM Events e")
    , @NamedQuery(name = "Events.findById", query = "SELECT e FROM Events e WHERE e.id = :id")
    , @NamedQuery(name = "Events.findByName", query = "SELECT e FROM Events e WHERE e.name = :name")
    , @NamedQuery(name = "Events.findByTodoAck", query = "SELECT e FROM Events e WHERE e.todoAck = :todoAck")
    , @NamedQuery(name = "Events.findByDateCalendar", query = "SELECT e FROM Events e WHERE e.dateCalendar = :dateCalendar")
    , @NamedQuery(name = "Events.findByDateActStart", query = "SELECT e FROM Events e WHERE e.dateActStart = :dateActStart")
    , @NamedQuery(name = "Events.findByDateActEnd", query = "SELECT e FROM Events e WHERE e.dateActEnd = :dateActEnd")
    , @NamedQuery(name = "Events.findByDateAck", query = "SELECT e FROM Events e WHERE e.dateAck = :dateAck")
    , @NamedQuery(name = "Events.findByConfirmedAck", query = "SELECT e FROM Events e WHERE e.confirmedAck = :confirmedAck")
    , @NamedQuery(name = "Events.findByLocationID", query = "SELECT e FROM Events e WHERE e.locationID = :locationID")
    , @NamedQuery(name = "Events.findByLocationAck", query = "SELECT e FROM Events e WHERE e.locationAck = :locationAck")
    , @NamedQuery(name = "Events.findByClientAck", query = "SELECT e FROM Events e WHERE e.clientAck = :clientAck")
    , @NamedQuery(name = "Events.findByCrowdQty", query = "SELECT e FROM Events e WHERE e.crowdQty = :crowdQty")
    , @NamedQuery(name = "Events.findByCrowdsAvgAge", query = "SELECT e FROM Events e WHERE e.crowdsAvgAge = :crowdsAvgAge")
    , @NamedQuery(name = "Events.findByCrowdAck", query = "SELECT e FROM Events e WHERE e.crowdAck = :crowdAck")})
public class Events implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Column(name = "todoAck")
    private Short todoAck;
    @Column(name = "dateCalendar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCalendar;
    @Column(name = "dateActStart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateActStart;
    @Column(name = "dateActEnd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateActEnd;
    @Column(name = "dateAck")
    private Short dateAck;
    @Column(name = "confirmedAck")
    private Short confirmedAck;
    @Column(name = "locationID")
    private BigInteger locationID;
    @Column(name = "locationAck")
    private Short locationAck;
    @Column(name = "clientAck")
    private Short clientAck;
    @Column(name = "crowdQty")
    private Integer crowdQty;
    @Column(name = "crowdsAvgAge")
    private Integer crowdsAvgAge;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "crowdInformation")
    private String crowdInformation;
    @Column(name = "crowdAck")
    private Short crowdAck;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventID")
    private Collection<Todo> todoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventID")
    private Collection<Payments> paymentsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventID")
    private Collection<Notes> notesCollection;
    @JoinColumn(name = "clientID", referencedColumnName = "id")
    @ManyToOne
    private Clients clientID;
    @JoinColumn(name = "artistID", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Artists artistID;

    public Events() {
    }

    public Events(Long id) {
        this.id = id;
    }

    public Events(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public Short getTodoAck() {
        return todoAck;
    }

    public void setTodoAck(Short todoAck) {
        this.todoAck = todoAck;
    }

    public Date getDateCalendar() {
        return dateCalendar;
    }

    public void setDateCalendar(Date dateCalendar) {
        this.dateCalendar = dateCalendar;
    }

    public Date getDateActStart() {
        return dateActStart;
    }

    public void setDateActStart(Date dateActStart) {
        this.dateActStart = dateActStart;
    }

    public Date getDateActEnd() {
        return dateActEnd;
    }

    public void setDateActEnd(Date dateActEnd) {
        this.dateActEnd = dateActEnd;
    }

    public Short getDateAck() {
        return dateAck;
    }

    public void setDateAck(Short dateAck) {
        this.dateAck = dateAck;
    }

    public Short getConfirmedAck() {
        return confirmedAck;
    }

    public void setConfirmedAck(Short confirmedAck) {
        this.confirmedAck = confirmedAck;
    }

    public BigInteger getLocationID() {
        return locationID;
    }

    public void setLocationID(BigInteger locationID) {
        this.locationID = locationID;
    }

    public Short getLocationAck() {
        return locationAck;
    }

    public void setLocationAck(Short locationAck) {
        this.locationAck = locationAck;
    }

    public Short getClientAck() {
        return clientAck;
    }

    public void setClientAck(Short clientAck) {
        this.clientAck = clientAck;
    }

    public Integer getCrowdQty() {
        return crowdQty;
    }

    public void setCrowdQty(Integer crowdQty) {
        this.crowdQty = crowdQty;
    }

    public Integer getCrowdsAvgAge() {
        return crowdsAvgAge;
    }

    public void setCrowdsAvgAge(Integer crowdsAvgAge) {
        this.crowdsAvgAge = crowdsAvgAge;
    }

    public String getCrowdInformation() {
        return crowdInformation;
    }

    public void setCrowdInformation(String crowdInformation) {
        this.crowdInformation = crowdInformation;
    }

    public Short getCrowdAck() {
        return crowdAck;
    }

    public void setCrowdAck(Short crowdAck) {
        this.crowdAck = crowdAck;
    }

    @XmlTransient
    public Collection<Todo> getTodoCollection() {
        return todoCollection;
    }

    public void setTodoCollection(Collection<Todo> todoCollection) {
        this.todoCollection = todoCollection;
    }

    @XmlTransient
    public Collection<Payments> getPaymentsCollection() {
        return paymentsCollection;
    }

    public void setPaymentsCollection(Collection<Payments> paymentsCollection) {
        this.paymentsCollection = paymentsCollection;
    }

    @XmlTransient
    public Collection<Notes> getNotesCollection() {
        return notesCollection;
    }

    public void setNotesCollection(Collection<Notes> notesCollection) {
        this.notesCollection = notesCollection;
    }

    public Clients getClientID() {
        return clientID;
    }

    public void setClientID(Clients clientID) {
        this.clientID = clientID;
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
        if (!(object instanceof Events)) {
            return false;
        }
        Events other = (Events) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "graduaat.it.www.beans.entities.Events[ id=" + id + " ]";
    }
    
}
