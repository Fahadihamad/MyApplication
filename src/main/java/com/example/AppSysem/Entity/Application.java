package com.example.AppSysem.Entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
@Data
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Time time;
    private boolean status;
    private Date date;
    private String discription;
    private String image;
    private String district;
    private String region;
    private String shehia;
    private String street;
    @ManyToOne
    @JoinColumn(name = "userId",insertable = false,updatable = false)
    private Users users;
    private int userName;
    private String letter;

    public Application() {
    }

    public Application(Time time, boolean status, Date date, String discription, String image, String district, String region, String shehia, String street, Users users, int userName, String letter) {
        this.time = time;
        this.status = status;
        this.date = date;
        this.discription = discription;
        this.image = image;
        this.district = district;
        this.region = region;
        this.shehia = shehia;
        this.street = street;
        this.users = users;
        this.userName = userName;
        this.letter = letter;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getShehia() {
        return shehia;
    }

    public void setShehia(String shehia) {
        this.shehia = shehia;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public int getUserName() {
        return userName;
    }

    public void setUserName(int userName) {
        this.userName = userName;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
