package com.example.tracking.models;


import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bank extends Auditable<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String policynumber;
    private String bankName;
    private String accountName;
    private String acountNumber;
    private String accountType;
    private String branch;
    private String status;
    private String location;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(String acountNumber) {
        this.acountNumber = acountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Bank(int id, String policynumber, String bankName, String accountName, String acountNumber,
            String accountType, String branch, String status, String location, String comment) {
        this.id = id;
        this.policynumber = policynumber;
        this.bankName = bankName;
        this.accountName = accountName;
        this.acountNumber = acountNumber;
        this.accountType = accountType;
        this.branch = branch;
        this.status = status;
        this.location = location;
        this.comment = comment;
    }

    public Bank() {
    }

    @Override
    public String toString() {
        return "Bank [accountName=" + accountName + ", accountType=" + accountType + ", acountNumber=" + acountNumber
                + ", bankName=" + bankName + ", branch=" + branch + ", comment=" + comment + ", id=" + id
                + ", location=" + location + ", policynumber=" + policynumber + ", status=" + status + "]";
    }

  
}