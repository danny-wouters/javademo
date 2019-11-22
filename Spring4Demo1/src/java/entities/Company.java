/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c")
    , @NamedQuery(name = "Company.findById", query = "SELECT c FROM Company c WHERE c.id = :id")
    , @NamedQuery(name = "Company.findByName", query = "SELECT c FROM Company c WHERE c.name = :name")
    , @NamedQuery(name = "Company.findByManager", query = "SELECT c FROM Company c WHERE c.manager = :manager")
    , @NamedQuery(name = "Company.findByStreet", query = "SELECT c FROM Company c WHERE c.street = :street")
    , @NamedQuery(name = "Company.findByNrBus", query = "SELECT c FROM Company c WHERE c.nrBus = :nrBus")
    , @NamedQuery(name = "Company.findByPostCode", query = "SELECT c FROM Company c WHERE c.postCode = :postCode")
    , @NamedQuery(name = "Company.findByCity", query = "SELECT c FROM Company c WHERE c.city = :city")
    , @NamedQuery(name = "Company.findByCountry", query = "SELECT c FROM Company c WHERE c.country = :country")
    , @NamedQuery(name = "Company.findByPhone", query = "SELECT c FROM Company c WHERE c.phone = :phone")
    , @NamedQuery(name = "Company.findByVat", query = "SELECT c FROM Company c WHERE c.vat = :vat")
    , @NamedQuery(name = "Company.findByEmail", query = "SELECT c FROM Company c WHERE c.email = :email")
    , @NamedQuery(name = "Company.findByLogoFilePath", query = "SELECT c FROM Company c WHERE c.logoFilePath = :logoFilePath")
    , @NamedQuery(name = "Company.findByBankaccount", query = "SELECT c FROM Company c WHERE c.bankaccount = :bankaccount")
    , @NamedQuery(name = "Company.findByVatLegalLine", query = "SELECT c FROM Company c WHERE c.vatLegalLine = :vatLegalLine")
    , @NamedQuery(name = "Company.findByInvoicePreFix", query = "SELECT c FROM Company c WHERE c.invoicePreFix = :invoicePreFix")
    , @NamedQuery(name = "Company.findByFirstInvoiceNumber", query = "SELECT c FROM Company c WHERE c.firstInvoiceNumber = :firstInvoiceNumber")})
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "manager")
    private String manager;
    @Column(name = "street")
    private String street;
    @Column(name = "nrBus")
    private String nrBus;
    @Column(name = "postCode")
    private String postCode;
    @Column(name = "City")
    private String city;
    @Column(name = "Country")
    private String country;
    @Column(name = "phone")
    private String phone;
    @Column(name = "vat")
    private String vat;
    @Column(name = "email")
    private String email;
    @Column(name = "logoFilePath")
    private String logoFilePath;
    @Column(name = "bankaccount")
    private String bankaccount;
    @Column(name = "vatLegalLine")
    private Short vatLegalLine;
    @Column(name = "invoicePreFix")
    private BigInteger invoicePreFix;
    @Column(name = "firstInvoiceNumber")
    private BigInteger firstInvoiceNumber;
    @JoinColumn(name = "userID", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users userID;

    public Company() {
    }

    public Company(Long id) {
        this.id = id;
    }

    public Company(Long id, String name) {
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

    public String getLogoFilePath() {
        return logoFilePath;
    }

    public void setLogoFilePath(String logoFilePath) {
        this.logoFilePath = logoFilePath;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public Short getVatLegalLine() {
        return vatLegalLine;
    }

    public void setVatLegalLine(Short vatLegalLine) {
        this.vatLegalLine = vatLegalLine;
    }

    public BigInteger getInvoicePreFix() {
        return invoicePreFix;
    }

    public void setInvoicePreFix(BigInteger invoicePreFix) {
        this.invoicePreFix = invoicePreFix;
    }

    public BigInteger getFirstInvoiceNumber() {
        return firstInvoiceNumber;
    }

    public void setFirstInvoiceNumber(BigInteger firstInvoiceNumber) {
        this.firstInvoiceNumber = firstInvoiceNumber;
    }

    public Users getUserID() {
        return userID;
    }

    public void setUserID(Users userID) {
        this.userID = userID;
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
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Company[ id=" + id + " ]";
    }
    
}
