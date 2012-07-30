package org.icm.model;
// Generated 5 Jun, 2012 5:27:43 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ChristianNeedsMaster generated by hbm2java
 */
@Entity
@Table(name="christian_needs_master"
    ,catalog="icm"
)
public class ChristianNeedsMaster  implements java.io.Serializable {


     private int id;
     private LanguageMaster languageMaster;
     private String title;
     private String providerName;
     private String description;
     private String keywords;
     private String thumbnail;
     private String preview;
     private String ocassion;
     private String genre;
     private String artist;
     private String purchaseInfo;
     private Date lastModifiedDate;

    public ChristianNeedsMaster() {
    }

	
    public ChristianNeedsMaster(int id, LanguageMaster languageMaster, String title, String description, Date lastModifiedDate) {
        this.id = id;
        this.languageMaster = languageMaster;
        this.title = title;
        this.description = description;
        this.lastModifiedDate = lastModifiedDate;
    }
    public ChristianNeedsMaster(int id, LanguageMaster languageMaster, String title, String providerName, String description, String keywords, String thumbnail, String preview, String ocassion, String genre, String artist, String purchaseInfo, Date lastModifiedDate) {
       this.id = id;
       this.languageMaster = languageMaster;
       this.title = title;
       this.providerName = providerName;
       this.description = description;
       this.keywords = keywords;
       this.thumbnail = thumbnail;
       this.preview = preview;
       this.ocassion = ocassion;
       this.genre = genre;
       this.artist = artist;
       this.purchaseInfo = purchaseInfo;
       this.lastModifiedDate = lastModifiedDate;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="languageId", nullable=false)
    public LanguageMaster getLanguageMaster() {
        return this.languageMaster;
    }
    
    public void setLanguageMaster(LanguageMaster languageMaster) {
        this.languageMaster = languageMaster;
    }
    
    @Column(name="title", nullable=false, length=100)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Column(name="provider_name", length=100)
    public String getProviderName() {
        return this.providerName;
    }
    
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    
    @Column(name="description", nullable=false, length=200)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="keywords", length=200)
    public String getKeywords() {
        return this.keywords;
    }
    
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    
    @Column(name="thumbnail", length=100)
    public String getThumbnail() {
        return this.thumbnail;
    }
    
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    
    @Column(name="preview", length=100)
    public String getPreview() {
        return this.preview;
    }
    
    public void setPreview(String preview) {
        this.preview = preview;
    }
    
    @Column(name="ocassion", length=50)
    public String getOcassion() {
        return this.ocassion;
    }
    
    public void setOcassion(String ocassion) {
        this.ocassion = ocassion;
    }
    
    @Column(name="genre", length=50)
    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Column(name="artist", length=100)
    public String getArtist() {
        return this.artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    @Column(name="purchaseInfo", length=500)
    public String getPurchaseInfo() {
        return this.purchaseInfo;
    }
    
    public void setPurchaseInfo(String purchaseInfo) {
        this.purchaseInfo = purchaseInfo;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastModifiedDate", nullable=false, length=19)
    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }




}

