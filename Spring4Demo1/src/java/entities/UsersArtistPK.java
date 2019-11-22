/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Danny
 */
@Embeddable
public class UsersArtistPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "userID")
    private long userID;
    @Basic(optional = false)
    @Column(name = "ArtitstID")
    private long artitstID;

    public UsersArtistPK() {
    }

    public UsersArtistPK(long userID, long artitstID) {
        this.userID = userID;
        this.artitstID = artitstID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public long getArtitstID() {
        return artitstID;
    }

    public void setArtitstID(long artitstID) {
        this.artitstID = artitstID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) userID;
        hash += (int) artitstID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersArtistPK)) {
            return false;
        }
        UsersArtistPK other = (UsersArtistPK) object;
        if (this.userID != other.userID) {
            return false;
        }
        if (this.artitstID != other.artitstID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UsersArtistPK[ userID=" + userID + ", artitstID=" + artitstID + " ]";
    }
    
}
