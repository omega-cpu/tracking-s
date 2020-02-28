package com.example.tracking.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cancellation extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String policyNumber;
    private String policyHolder;
    private String idNumber;
    private String telephone;
    private String postalAddress;
    private String monthlyPremium;
    private String account;
    private String accountNumber;
    private String branch;
    private String reason;
    private String comment;
    private String status;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getMonthlyPremium() {
        return monthlyPremium;
    }

    public void setMonthlyPremium(String monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public Cancellation(int id, String policyNumber, String policyHolder, String idNumber, String telephone,
            String postalAddress, String monthlyPremium, String account, String accountNumber, String branch,
            String reason, String comment, String status, String location) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.idNumber = idNumber;
        this.telephone = telephone;
        this.postalAddress = postalAddress;
        this.monthlyPremium = monthlyPremium;
        this.account = account;
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.reason = reason;
        this.comment = comment;
        this.status = status;
        this.location = location;
    }

    public Cancellation() {
    }

    @Override
    public String toString() {
        return "Cancellation [account=" + account + ", accountNumber=" + accountNumber + ", branch=" + branch
                + ", comment=" + comment + ", id=" + id + ", idNumber=" + idNumber + ", location=" + location
                + ", monthlyPremium=" + monthlyPremium + ", policyHolder=" + policyHolder + ", policyNumber="
                + policyNumber + ", postalAddress=" + postalAddress + ", reason=" + reason + ", status=" + status
                + ", telephone=" + telephone + "]";
    }

    
}