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
public class Refund extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String policyNumber;
    private String policyHolder;
    private String telephone;
    private String postalAddress;
    private String emailAdress;
    //deduction source
    private String accountName;
    private String accountNO;
//private String accountNumber;
    private String monthlyPremium;
    private String refundDuration;
    private String durationTo;
    //reason
    private String reason;
    private String otherReason;

    //Electronic transfer
    private String taccountHolderName;
    private String taccountName;
    private String taccountNumber;
    private String tbranch;
    private String date;
    //personnal
    private String location;
    private String status;
    private String comment;

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

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNO() {
        return accountNO;
    }

    public void setAccountNO(String accountNO) {
        this.accountNO = accountNO;
    }

    public String getMonthlyPremium() {
        return monthlyPremium;
    }

    public void setMonthlyPremium(String monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }

    public String getRefundDuration() {
        return refundDuration;
    }

    public void setRefundDuration(String refundDuration) {
        this.refundDuration = refundDuration;
    }

    public String getDurationTo() {
        return durationTo;
    }

    public void setDurationTo(String durationTo) {
        this.durationTo = durationTo;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOtherReason() {
        return otherReason;
    }

    public void setOtherReason(String otherReason) {
        this.otherReason = otherReason;
    }

    public String getTaccountHolderName() {
        return taccountHolderName;
    }

    public void setTaccountHolderName(String taccountHolderName) {
        this.taccountHolderName = taccountHolderName;
    }

    public String getTaccountName() {
        return taccountName;
    }

    public void setTaccountName(String taccountName) {
        this.taccountName = taccountName;
    }

    public String getTaccountNumber() {
        return taccountNumber;
    }

    public void setTaccountNumber(String taccountNumber) {
        this.taccountNumber = taccountNumber;
    }

    public String getTbranch() {
        return tbranch;
    }

    public void setTbranch(String tbranch) {
        this.tbranch = tbranch;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Refund(int id, String policyNumber, String policyHolder, String telephone, String postalAddress,
            String emailAdress, String accountName, String accountNO, String monthlyPremium, String refundDuration,
            String durationTo, String reason, String otherReason, String taccountHolderName, String taccountName,
            String taccountNumber, String tbranch, String date, String location, String status, String comment) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.telephone = telephone;
        this.postalAddress = postalAddress;
        this.emailAdress = emailAdress;
        this.accountName = accountName;
        this.accountNO = accountNO;
        this.monthlyPremium = monthlyPremium;
        this.refundDuration = refundDuration;
        this.durationTo = durationTo;
        this.reason = reason;
        this.otherReason = otherReason;
        this.taccountHolderName = taccountHolderName;
        this.taccountName = taccountName;
        this.taccountNumber = taccountNumber;
        this.tbranch = tbranch;
        this.date = date;
        this.location = location;
        this.status = status;
        this.comment = comment;
    }

    public Refund() {
    }

    @Override
    public String toString() {
        return "Refund [accountNO=" + accountNO + ", accountName=" + accountName + ", comment=" + comment + ", date="
                + date + ", durationTo=" + durationTo + ", emailAdress=" + emailAdress + ", id=" + id + ", location="
                + location + ", monthlyPremium=" + monthlyPremium + ", otherReason=" + otherReason + ", policyHolder="
                + policyHolder + ", policyNumber=" + policyNumber + ", postalAddress=" + postalAddress + ", reason="
                + reason + ", refundDuration=" + refundDuration + ", status=" + status + ", taccountHolderName="
                + taccountHolderName + ", taccountName=" + taccountName + ", taccountNumber=" + taccountNumber
                + ", tbranch=" + tbranch + ", telephone=" + telephone + "]";
    }

  
   
}