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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "Todo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Todo.findAll", query = "SELECT t FROM Todo t")
    , @NamedQuery(name = "Todo.findById", query = "SELECT t FROM Todo t WHERE t.id = :id")
    , @NamedQuery(name = "Todo.findBySortNumber", query = "SELECT t FROM Todo t WHERE t.sortNumber = :sortNumber")
    , @NamedQuery(name = "Todo.findByName", query = "SELECT t FROM Todo t WHERE t.name = :name")
    , @NamedQuery(name = "Todo.findByAttachmentFilePath", query = "SELECT t FROM Todo t WHERE t.attachmentFilePath = :attachmentFilePath")
    , @NamedQuery(name = "Todo.findByAck", query = "SELECT t FROM Todo t WHERE t.ack = :ack")})
public class Todo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sortNumber")
    private int sortNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;
    @Size(max = 255)
    @Column(name = "attachmentFilePath")
    private String attachmentFilePath;
    @Column(name = "ack")
    private Short ack;
    @JoinColumn(name = "eventID", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Events eventID;

    public Todo() {
    }

    public Todo(Long id) {
        this.id = id;
    }

    public Todo(Long id, int sortNumber, String name) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttachmentFilePath() {
        return attachmentFilePath;
    }

    public void setAttachmentFilePath(String attachmentFilePath) {
        this.attachmentFilePath = attachmentFilePath;
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
        if (!(object instanceof Todo)) {
            return false;
        }
        Todo other = (Todo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "graduaat.it.www.beans.entities.Todo[ id=" + id + " ]";
    }
    
}
