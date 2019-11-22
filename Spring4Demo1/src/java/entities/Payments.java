/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "Payments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payments.findAll", query = "SELECT p FROM Payments p")
    , @NamedQuery(name = "Payments.findById", query = "SELECT p FROM Payments p WHERE p.id = :id")
    , @NamedQuery(name = "Payments.findByPaymentscol", query = "SELECT p FROM Payments p WHERE p.paymentscol = :paymentscol")
    , @NamedQuery(name = "Payments.findByModeTimeStamp", query = "SELECT p FROM Payments p WHERE p.modeTimeStamp = :modeTimeStamp")
    , @NamedQuery(name = "Payments.findByName", query = "SELECT p FROM Payments p WHERE p.name = :name")
    , @NamedQuery(name = "Payments.findByDescription", query = "SELECT p FROM Payments p WHERE p.description = :description")
    , @NamedQuery(name = "Payments.findByPrice", query = "SELECT p FROM Payments p WHERE p.price = :price")
    , @NamedQuery(name = "Payments.findByAck", query = "SELECT p FROM Payments p WHERE p.ack = :ack")})
public class Payments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Paymentscol")
    private long paymentscol;
    @Basic(optional = false)
    @Column(name = "modeTimeStamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modeTimeStamp;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @Column(name = "ack")
    private Short ack;
    @JoinColumn(name = "eventID", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Events eventID;

    public Payments() {
    }

    public Payments(Long id) {
        this.id = id;
    }

    public Payments(Long id, long paymentscol, Date modeTimeStamp, String name) {
        this.id = id;
        this.paymentscol = paymentscol;
        this.modeTimeStamp = modeTimeStamp;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getPaymentscol() {
        return paymentscol;
    }

    public void setPaymentscol(long paymentscol) {
        this.paymentscol = paymentscol;
    }

    public Date getModeTimeStamp() {
        return modeTimeStamp;
    }

    public void setModeTimeStamp(Date modeTimeStamp) {
        this.modeTimeStamp = modeTimeStamp;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Short getAck() {
        return ack;
    }

    public void setAck(Short ack) {
        this.ack = ack;
    }

    public Events getEventID() {
        return eventID;
    }

    public void setEventID(Events eventID) {
        this.eventID = eventID;
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
        if (!(object instanceof Payments)) {
            return false;
        }
        Payments other = (Payments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Payments[ id=" + id + " ]";
    }
    
}
