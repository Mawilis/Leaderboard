package com.wilsy.leaderboard.model;

//
// Created by Wilson Khanyezi on 2020/09/09.
//
class Hours {
    private String name;
    private Integer hours;
    private String country;
    private String badgeUrl;

    public Hours() {
    }

    public Hours(String name, Integer hours, String country, String badgeUrl) {
        this.name = name;
        this.hours = hours;
        this.country = country;
        this.badgeUrl = badgeUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBadgeUrl() {
        return badgeUrl;
    }

    public void setBadgeUrl(String badgeUrl) {
        this.badgeUrl = badgeUrl;
    }

    @Override
    public String toString() {
        return "Hours{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", country='" + country + '\'' +
                ", badgeUrl='" + badgeUrl + '\'' +
                '}';
    }
}
