package org.icm.model;
// Generated 5 Jun, 2012 5:27:43 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AdminMaster generated by hbm2java
 */
@Entity
@Table(name="admin_master"
    ,catalog="icm"
)
public class AdminMaster  implements java.io.Serializable {


     private Integer adminUserId;
     private String adminUserName;
     private String adminPassword;
     private Date lastModifiedDate;

    public AdminMaster() {
    }

    public AdminMaster(String adminUserName, String adminPassword, Date lastModifiedDate) {
       this.adminUserName = adminUserName;
       this.adminPassword = adminPassword;
       this.lastModifiedDate = lastModifiedDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="adminUserId", unique=true, nullable=false)
    public Integer getAdminUserId() {
        return this.adminUserId;
    }
    
    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
    }
    
    @Column(name="adminUserName", nullable=false, length=100)
    public String getAdminUserName() {
        return this.adminUserName;
    }
    
    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }
    
    @Column(name="adminPassword", nullable=false, length=100)
    public String getAdminPassword() {
        return this.adminPassword;
    }
    
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
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


