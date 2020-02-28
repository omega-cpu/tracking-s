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
public class Claim extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String policyNumber;
    private String policyHolder;
    private String telephone;
    private String postalAddress;
    private String emailAdress;
   

      // commencement date
      private String commencementDate;
      private String firstPremiumMonth;
      private String NoMonthContributed;
      private String contributed;
     
     // deduction source
    private String accountName;
    private String accountNO;
    private String monthlyPremium;
    private String requirement;
 
   
    // reason
    private String reason;
    private String otherReason;
    private String dateOfDeath;

    private String beneficiary;

    // Electronic transfer
    private String taccountHolderName;
    private String taccountName;
    private String taccountNumber;
    private String tbranch;
    private String date;
    // personnal
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

    public String getCommencementDate() {
        return commencementDate;
    }

    public void setCommencementDate(String commencementDate) {
        this.commencementDate = commencementDate;
    }

    public String getFirstPremiumMonth() {
        return firstPremiumMonth;
    }

    public void setFirstPremiumMonth(String firstPremiumMonth) {
        this.firstPremiumMonth = firstPremiumMonth;
    }

    public String getNoMonthContributed() {
        return NoMonthContributed;
    }

    public void setNoMonthContributed(String noMonthContributed) {
        NoMonthContributed = noMonthContributed;
    }

    public String getContributed() {
        return contributed;
    }

    public void setContributed(String contributed) {
        this.contributed = contributed;
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

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
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

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
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

    public Claim(int id, String policyNumber, String policyHolder, String telephone, String postalAddress,
            String emailAdress, String commencementDate, String firstPremiumMonth, String noMonthContributed,
            String contributed, String accountName, String accountNO, String monthlyPremium, String requirement,
            String reason, String otherReason, String dateOfDeath, String beneficiary, String taccountHolderName,
            String taccountName, String taccountNumber, String tbranch, String date, String location, String status,
            String comment) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.telephone = telephone;
        this.postalAddress = postalAddress;
        this.emailAdress = emailAdress;
        this.commencementDate = commencementDate;
        this.firstPremiumMonth = firstPremiumMonth;
        NoMonthContributed = noMonthContributed;
        this.contributed = contributed;
        this.accountName = accountName;
        this.accountNO = accountNO;
        this.monthlyPremium = monthlyPremium;
        this.requirement = requirement;
        this.reason = reason;
        this.otherReason = otherReason;
        this.dateOfDeath = dateOfDeath;
        this.beneficiary = beneficiary;
        this.taccountHolderName = taccountHolderName;
        this.taccountName = taccountName;
        this.taccountNumber = taccountNumber;
        this.tbranch = tbranch;
        this.date = date;
        this.location = location;
        this.status = status;
        this.comment = comment;
    }

    public Claim() {
    }

    @Override
    public String toString() {
        return "Claim [NoMonthContributed=" + NoMonthContributed + ", accountNO=" + accountNO + ", accountName="
                + accountName + ", beneficiary=" + beneficiary + ", commencementDate=" + commencementDate + ", comment="
                + comment + ", contributed=" + contributed + ", date=" + date + ", dateOfDeath=" + dateOfDeath
                + ", emailAdress=" + emailAdress + ", firstPremiumMonth=" + firstPremiumMonth + ", id=" + id
                + ", location=" + location + ", monthlyPremium=" + monthlyPremium + ", otherReason=" + otherReason
                + ", policyHolder=" + policyHolder + ", policyNumber=" + policyNumber + ", postalAddress="
                + postalAddress + ", reason=" + reason + ", requirement=" + requirement + ", status=" + status
                + ", taccountHolderName=" + taccountHolderName + ", taccountName=" + taccountName + ", taccountNumber="
                + taccountNumber + ", tbranch=" + tbranch + ", telephone=" + telephone + "]";
    }

    
}