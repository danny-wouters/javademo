/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans.entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    , @NamedQuery(name = "Company.findByFirstInvoiceNumber", query = "SELECT c FROM Company c WHERE c.firstInvoiceNumber = :firstInvoiceNumber")
    , @NamedQuery(name = "Company.findByTermsAndConditionsUrl", query = "SELECT c FROM Company c WHERE c.termsAndConditionsUrl = :termsAndConditionsUrl")})
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "manager")
    private String manager;
    @Size(max = 255)
    @Column(name = "street")
    private String street;
    @Size(max = 255)
    @Column(name = "nrBus")
    private String nrBus;
    @Size(max = 255)
    @Column(name = "postCode")
    private String postCode;
    @Size(max = 255)
    @Column(name = "city")
    private String city;
    @Size(max = 255)
    @Column(name = "country")
    private String country;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "phone")
    private String phone;
    @Size(max = 255)
    @Column(name = "vat")
    private String vat;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Size(max = 255)
    @Column(name = "logoFilePath")
    private String logoFilePath;
    @Size(max = 255)
    @Column(name = "bankaccount")
    private String bankaccount;
    @Column(name = "vatLegalLine")
    private Short vatLegalLine;
    @Size(max = 255)
    @Column(name = "invoicePreFix")
    private String invoicePreFix;
    @Column(name = "firstInvoiceNumber")
    private BigInteger firstInvoiceNumber;
    @Size(max = 255)
    @Column(name = "termsAndConditionsUrl")
    private String termsAndConditionsUrl;
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

    public String getInvoicePreFix() {
        return invoicePreFix;
    }

    public void setInvoicePreFix(String invoicePreFix) {
        this.invoicePreFix = invoicePreFix;
    }

    public BigInteger getFirstInvoiceNumber() {
        return firstInvoiceNumber;
    }

    public void setFirstInvoiceNumber(BigInteger firstInvoiceNumber) {
        this.firstInvoiceNumber = firstInvoiceNumber;
    }

    public String getTermsAndConditionsUrl() {
        return termsAndConditionsUrl;
    }

    public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
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
        return "graduaat.it.www.beans.entities.Company[ id=" + id + " ]";
    }
    
}
