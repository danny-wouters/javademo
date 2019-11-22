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
import javax.persistence.Lob;
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
@Table(name = "Notes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notes.findAll", query = "SELECT n FROM Notes n")
    , @NamedQuery(name = "Notes.findById", query = "SELECT n FROM Notes n WHERE n.id = :id")
    , @NamedQuery(name = "Notes.findByModeTimeStamp", query = "SELECT n FROM Notes n WHERE n.modeTimeStamp = :modeTimeStamp")})
public class Notes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "modeTimeStamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modeTimeStamp;
    @Lob
    @Column(name = "note")
    private String note;
    @JoinColumn(name = "eventID", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Events eventID;
    @JoinColumn(name = "modUserID", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users modUserID;

    public Notes() {
    }

    public Notes(Long id) {
        this.id = id;
    }

    public Notes(Long id, Date modeTimeStamp) {
        this.id = id;
        this.modeTimeStamp = modeTimeStamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getModeTimeStamp() {
        return modeTimeStamp;
    }

    public void setModeTimeStamp(Date modeTimeStamp) {
        this.modeTimeStamp = modeTimeStamp;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Events getEventID() {
        return eventID;
    }

    public void setEventID(Events eventID) {
        this.eventID = eventID;
    }

    public Users getModUserID() {
        return modUserID;
    }

    public void setModUserID(Users modUserID) {
        this.modUserID = modUserID;
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
        if (!(object instanceof Notes)) {
            return false;
        }
        Notes other = (Notes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Notes[ id=" + id + " ]";
    }
    
}
