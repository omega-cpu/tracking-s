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
public class Momo extends Auditable<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String policynumber;
    private String telcomName;
    private String mobileNUmber;
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

    public String getTelcomName() {
        return telcomName;
    }

    public void setTelcomName(String telcomName) {
        this.telcomName = telcomName;
    }

    public String getMobileNUmber() {
        return mobileNUmber;
    }

    public void setMobileNUmber(String mobileNUmber) {
        this.mobileNUmber = mobileNUmber;
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

    public Momo(int id, String policynumber, String telcomName, String mobileNUmber, String status, String location,
            String comment) {
        this.id = id;
        this.policynumber = policynumber;
        this.telcomName = telcomName;
        this.mobileNUmber = mobileNUmber;
        this.status = status;
        this.location = location;
        this.comment = comment;
    }

    public Momo() {
    }

    @Override
    public String toString() {
        return "Momo [comment=" + comment + ", id=" + id + ", location=" + location + ", mobileNUmber=" + mobileNUmber
                + ", policynumber=" + policynumber + ", status=" + status + ", telcomName=" + telcomName + "]";
    }
    
  

    
}