/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "UsersArtist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersArtist.findAll", query = "SELECT u FROM UsersArtist u")
    , @NamedQuery(name = "UsersArtist.findByUserID", query = "SELECT u FROM UsersArtist u WHERE u.usersArtistPK.userID = :userID")
    , @NamedQuery(name = "UsersArtist.findByArtitstID", query = "SELECT u FROM UsersArtist u WHERE u.usersArtistPK.artitstID = :artitstID")
    , @NamedQuery(name = "UsersArtist.findByRole", query = "SELECT u FROM UsersArtist u WHERE u.role = :role")})
public class UsersArtist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsersArtistPK usersArtistPK;
    @Basic(optional = false)
    @Column(name = "role")
    private int role;
    @JoinColumn(name = "ArtitstID", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Artists artists;
    @JoinColumn(name = "userID", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Users users;

    public UsersArtist() {
    }

    public UsersArtist(UsersArtistPK usersArtistPK) {
        this.usersArtistPK = usersArtistPK;
    }

    public UsersArtist(UsersArtistPK usersArtistPK, int role) {
        this.usersArtistPK = usersArtistPK;
        this.role = role;
    }

    public UsersArtist(long userID, long artitstID) {
        this.usersArtistPK = new UsersArtistPK(userID, artitstID);
    }

    public UsersArtistPK getUsersArtistPK() {
        return usersArtistPK;
    }

    public void setUsersArtistPK(UsersArtistPK usersArtistPK) {
        this.usersArtistPK = usersArtistPK;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Artists getArtists() {
        return artists;
    }

    public void setArtists(Artists artists) {
        this.artists = artists;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersArtistPK != null ? usersArtistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersArtist)) {
            return false;
        }
        UsersArtist other = (UsersArtist) object;
        if ((this.usersArtistPK == null && other.usersArtistPK != null) || (this.usersArtistPK != null && !this.usersArtistPK.equals(other.usersArtistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UsersArtist[ usersArtistPK=" + usersArtistPK + " ]";
    }
    
}
