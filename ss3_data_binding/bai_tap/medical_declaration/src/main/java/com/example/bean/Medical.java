package com.example.bean;

public class Medical {
    private String fullName;
    private String birthday;
    private String gender;
    private String country;
    private String idCard;
    private String vehicle;
    private String licensePlates;
    private int numberOfSeating;
    private String startOfDay;
    private String startOfMonth;
    private String startOfYear;
    private String endOfDay;
    private String endOfMonth;
    private String endOfYear;
    private String otherInformation;

    public Medical() {
    }


    public Medical(String fullName, String birthday, String gender, String country, String idCard, String vehicle, String licensePlates, int numberOfSeating, String startOfDay, String startOfMonth, String startOfYear, String endOfDay, String endOfMonth, String endOfYear, String otherInformation) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.country = country;
        this.idCard = idCard;
        this.vehicle = vehicle;
        this.licensePlates = licensePlates;
        this.numberOfSeating = numberOfSeating;
        this.startOfDay = startOfDay;
        this.startOfMonth = startOfMonth;
        this.startOfYear = startOfYear;
        this.endOfDay = endOfDay;
        this.endOfMonth = endOfMonth;
        this.endOfYear = endOfYear;
        this.otherInformation = otherInformation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public int getNumberOfSeating() {
        return numberOfSeating;
    }

    public void setNumberOfSeating(int numberOfSeating) {
        this.numberOfSeating = numberOfSeating;
    }

    public String getStartOfDay() {
        return startOfDay;
    }

    public void setStartOfDay(String startOfDay) {
        this.startOfDay = startOfDay;
    }

    public String getStartOfMonth() {
        return startOfMonth;
    }

    public void setStartOfMonth(String startOfMonth) {
        this.startOfMonth = startOfMonth;
    }

    public String getStartOfYear() {
        return startOfYear;
    }

    public void setStartOfYear(String startOfYear) {
        this.startOfYear = startOfYear;
    }

    public String getEndOfDay() {
        return endOfDay;
    }

    public void setEndOfDay(String endOfDay) {
        this.endOfDay = endOfDay;
    }

    public String getEndOfMonth() {
        return endOfMonth;
    }

    public void setEndOfMonth(String endOfMonth) {
        this.endOfMonth = endOfMonth;
    }

    public String getEndOfYear() {
        return endOfYear;
    }

    public void setEndOfYear(String endOfYear) {
        this.endOfYear = endOfYear;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
